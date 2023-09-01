package com.kosinski.recruitmentTask.controller;

import com.kosinski.recruitmentTask.exception.InvalidAcceptException;
import com.kosinski.recruitmentTask.service.RepoDownloaderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RepoDownloaderController {

    private final RepoDownloaderService repoDownloaderService;

    @GetMapping("/repositories/{userName}")
    public ResponseEntity<List<RepositoryResponseDto>> getAllRepositoriesByUsername(
            @PathVariable String userName,
            @RequestHeader(HttpHeaders.ACCEPT) String accept
    ) {
        if (accept.equals(MediaType.APPLICATION_XML_VALUE)) {
            throw new InvalidAcceptException("Invalid format only JSON acceptable");
        }
        List<RepositoryResponseDto> allRepositories = repoDownloaderService.getAllRepositories(userName);

        return ResponseEntity.ok(allRepositories);
    }

}
