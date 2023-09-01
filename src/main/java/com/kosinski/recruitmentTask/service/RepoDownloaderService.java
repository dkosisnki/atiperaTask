package com.kosinski.recruitmentTask.service;

import com.kosinski.recruitmentTask.controller.RepositoryResponseDto;
import com.kosinski.recruitmentTask.domain.Repository;
import com.kosinski.recruitmentTask.feignclient.RepoDownloaderClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kosinski.recruitmentTask.service.RepoToResponseMapper.mapOnResponseDto;

@Service
@AllArgsConstructor
public class RepoDownloaderService {


    private final RepoDownloaderClient repoDownloaderClient;

    public List<RepositoryResponseDto> getAllRepositories(String userName){
        List<Repository> allRepositories = repoDownloaderClient.getAllRepos(userName);
        return allRepositories.stream()
                .filter(repository -> !repository.fork())
                .map(notFork -> mapOnResponseDto(notFork,repoDownloaderClient))
                .toList();
    }

}
