package com.kosinski.recruitmentTask.service;

import com.kosinski.recruitmentTask.controller.RepositoryResponseDto;
import com.kosinski.recruitmentTask.domain.Owner;
import com.kosinski.recruitmentTask.feignclient.RepoDownloaderClient;
import com.kosinski.recruitmentTask.util.TestDataPreparer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RepoDownloaderServiceTest implements TestDataPreparer {

    private final RepoDownloaderClient repoDownloaderClient = mock(RepoDownloaderClient.class);
    private final RepoDownloaderService repoDownloaderService = new RepoDownloaderService(repoDownloaderClient);

    @Test
    void shouldReturnCorrectAmountOfRepositories(){
        //given
        Owner owner = someOwner1();
        when(repoDownloaderClient.getAllRepos(owner.login()))
                .thenReturn(List.of(someRepository1(),someRepository2(),someRepository3()));

        //when
        List<RepositoryResponseDto> allRepositories = repoDownloaderService.getAllRepositories(owner.login());

        //then
        assertEquals(2,allRepositories.size());
    }

}