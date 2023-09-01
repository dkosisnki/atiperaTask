package com.kosinski.recruitmentTask.feignclient;

import com.kosinski.recruitmentTask.domain.Branch;
import com.kosinski.recruitmentTask.domain.Repository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(value ="github", url="${repo-downloader.client.config.url}")
public interface RepoDownloaderClient {

    @GetMapping("users/{userName}/repos")
    List<Repository> getAllRepos(@PathVariable String userName);

    @GetMapping("/repos/{owner}/{repo}/branches")
    List<Branch> getAllBranchesByRepo(@PathVariable String owner, @PathVariable String repo);
}
