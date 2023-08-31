package com.kosinski.recruitmentTask.features;

import com.kosinski.recruitmentTask.BaseIntegrationTest;
import org.junit.Test;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class UserPassedUserNameAndReceivedListOfRepositoriesIntegrationTest extends BaseIntegrationTest {

    @Test
    public void shouldUserReceiveListOfRepositories() throws Exception {
        //step 1: user pass username(dkosisnki) to GET /listRepositories/dkosisnki endpoint.
        //given && when
        ResultActions performGetRepositories = mockMvc.perform(get("/listRepositories/dkosisnki")
                .contentType(MediaType.APPLICATION_JSON)
                .header("Accept", "application/json"));
        //then
        performGetRepositories.andExpect(status().isOk())
                .andExpect(content().json("""
                        [
                         {
                            "repositoryName": "dkosisnki/Repo1",
                            "ownerLogin": "dkosisnki",
                            "branches": [
                                {
                                    "name": "branch1",
                                     "lastCommitSha": "sad123fs"
                                },
                                {
                                    "name": "branch2",
                                    "lastCommitSha": "hsa41rsa"
                                }
                            ]
                         },
                         {
                            "repositoryName": "dkosisnki/Repo2",
                            "ownerLogin": "dkosisnki",
                            "branches": [
                                {
                                    "name": "branch1",
                                    "lastCommitSha": "642gawdsa1"
                                },
                                {
                                    "name": "branch2",
                                    "lastCommitSha": "hs631ras"
                                }
                            ]
                         }
                        ]
                        """.trim()));
    }
}
