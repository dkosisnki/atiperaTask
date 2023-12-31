package com.kosinski.recruitmentTask.service;

import com.kosinski.recruitmentTask.controller.RepositoryResponseDto;
import com.kosinski.recruitmentTask.domain.Owner;
import com.kosinski.recruitmentTask.domain.Repository;
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
    void shouldIgnoreRepositoriesWhichAreForksCorrectly() {
        //given
        Owner owner = someOwner1();
        when(repoDownloaderClient.getAllRepos(owner.login()))
                .thenReturn(List.of(someRepository1(), someRepository2(), someRepository3()));

        //when
        List<RepositoryResponseDto> allRepositories = repoDownloaderService.getAllRepositories(owner.login());

        //then
        assertEquals(2, allRepositories.size());
    }

    @Test
    void shouldMapRepositoryToRepositoryResponseDtoCorrectly(){
        //given
        Owner owner = someOwner1();
        Repository repository = someRepository2();
        when(repoDownloaderClient.getAllBranchesByRepo(owner.login(),repository.name()))
                .thenReturn(List.of(someBranch1(),someBranch2()));

        //when
        RepositoryResponseDto responseDto = RepoToResponseMapper.mapOnResponseDto(repository, repoDownloaderClient);

        //then
        assertAll(
                () -> assertEquals(repository.name(),responseDto.repositoryName()),
                () -> assertEquals(repository.owner().login(),responseDto.ownerLogin()),
                () -> assertEquals(2,responseDto.branches().size())
        );
    }

}