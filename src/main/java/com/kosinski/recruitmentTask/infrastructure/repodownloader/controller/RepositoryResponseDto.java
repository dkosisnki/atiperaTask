package com.kosinski.recruitmentTask.infrastructure.repodownloader.controller;

import com.kosinski.recruitmentTask.domain.Branch;

import java.util.List;

public record RepositoryResponseDto(
        String repositoryName,
        String ownerLogin,
        List<Branch> branches
) {
}
