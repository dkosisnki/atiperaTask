package com.kosinski.recruitmentTask.features;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.kosinski.recruitmentTask.BaseIntegrationTest;
import com.kosinski.recruitmentTask.exception.RepoDownloaderExceptionResponse;
import com.kosinski.recruitmentTask.features.samples.SampleGithubResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserPassedUserNameAndReceivedListOfRepositoriesIntegrationTest
        extends BaseIntegrationTest implements SampleGithubResponse {


    @Test
    public void shouldUserReceiveListOfRepositories() throws Exception {
        //step 1: github API return list of repositories and their branches for each repository
        wireMockServer.stubFor(WireMock.get("/users/dkosisnki/repos")
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.OK.value())
                        .withHeader("Content-type", "application/json")
                        .withBody(sampleResponseFromGithubApi())));

        wireMockServer.stubFor(WireMock.get("/users/nonExistentUser/repos")
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.NOT_FOUND.value())
                        .withHeader("Content-type", "application/json")
                        .withBody(sampleResponseForNonExistentUser())));

        wireMockServer.stubFor(WireMock.get("/repos/dkosisnki/atiperaTask/branches")
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.OK.value())
                        .withHeader("Content-type", "application/json")
                        .withBody(sampleResponseForRepo1())));

        wireMockServer.stubFor(WireMock.get("/repos/dkosisnki/LottoGame/branches")
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.OK.value())
                        .withHeader("Content-type", "application/json")
                        .withBody(sampleResponseForRepo2())));

        wireMockServer.stubFor(WireMock.get("/repos/dkosisnki/my-testing-repo/branches")
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.OK.value())
                        .withHeader("Content-type", "application/json")
                        .withBody(sampleResponseForRepo3())));

        //step 2: user pass username(nonExistentUser) to to GET /listRepositories/nonExistentUser
        //given
        ResultActions performWithNonExistentUser = mockMvc.perform(get("/repositories/nonExistentUser")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Accept", "application/json"));

        //when
        MvcResult resultForNonExistentUser = performWithNonExistentUser.andExpect(status().isNotFound()).andReturn();
        String jsonForNoExistentUser = resultForNonExistentUser.getResponse().getContentAsString();
        RepoDownloaderExceptionResponse responseForNonExistentUser =
                objectMapper.readValue(jsonForNoExistentUser, RepoDownloaderExceptionResponse.class);

        //then
        assertAll(
                () -> assertEquals(HttpStatus.NOT_FOUND, responseForNonExistentUser.status()),
                () -> assertEquals("Resource not found", responseForNonExistentUser.message())
        );


        //step 3: user pass username(dkosisnki) to GET /listRepositories/dkosisnki endpoint
        //        with header “Accept: application/json”
        //given
        ResultActions performWithAcceptXml = mockMvc.perform(get("/repositories/dkosisnki")
                .accept(MediaType.APPLICATION_XML));

        //when
        MvcResult resultForBadAcceptType = performWithAcceptXml.andExpect(status().isNotAcceptable()).andReturn();
        String jsonForBadAcceptType = resultForBadAcceptType.getResponse().getContentAsString();
        RepoDownloaderExceptionResponse responseForBadAcceptType =
                objectMapper.readValue(jsonForBadAcceptType, RepoDownloaderExceptionResponse.class);

        //then
        assertAll(
                () -> assertEquals(HttpStatus.NOT_ACCEPTABLE, responseForBadAcceptType.status()),
                () -> assertEquals("Invalid format only JSON acceptable", responseForBadAcceptType.message())
        );


        //step 4: user pass username(dkosisnki) to GET /listRepositories/dkosisnki endpoint.
        //given && when
        ResultActions performGetRepositories = mockMvc.perform(get("/repositories/dkosisnki")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Accept", "application/json"));

        //then
        performGetRepositories.andExpect(status().isOk())
                .andExpect(content().json("""
                        [
                         {
                            "repositoryName": "atiperaTask",
                            "ownerLogin": "dkosisnki",
                            "branches": [
                                {
                                    "name": "master",
                                    "commit": {"sha": "f55362cbc83cd0665598b7dcac58433ea12c683b"}
                                }
                            ]
                         },
                         {
                            "repositoryName": "my-testing-repo",
                            "ownerLogin": "dkosisnki",
                            "branches": [
                                {
                                    "name": "master",
                                    "commit": {"sha": "003cac39c3d3b6a2f783df5ece8ce06da728d982"}
                                },
                                 {
                                    "name": "someOtherBranch",
                                    "commit": {"sha": "dd33fb5a3cae8205879f2fa1b3e0994ab4b163e8"}
                                }
                                
                            ]
                         }
                        ]
                        """.trim()));
    }
}
