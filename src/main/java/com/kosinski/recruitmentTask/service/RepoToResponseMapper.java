package com.kosinski.recruitmentTask.service;

import com.kosinski.recruitmentTask.controller.RepositoryResponseDto;
import com.kosinski.recruitmentTask.domain.Branch;
import com.kosinski.recruitmentTask.domain.Repository;
import com.kosinski.recruitmentTask.feignclient.RepoDownloaderClient;

import java.util.List;

class RepoToResponseMapper {

    public static RepositoryResponseDto mapOnResponseDto(Repository notFork, RepoDownloaderClient repoDownloaderClient) {
        String ownerLogin = notFork.owner().login();
        String repoName = notFork.name();
        List<Branch> allBranchesByRepo = repoDownloaderClient.getAllBranchesByRepo(
                ownerLogin, repoName);
        return new RepositoryResponseDto(repoName,ownerLogin,allBranchesByRepo);
    }

}
