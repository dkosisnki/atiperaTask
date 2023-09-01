package com.kosinski.recruitmentTask.controller;

import com.kosinski.recruitmentTask.domain.Branch;

import java.util.List;

public record RepositoryResponseDto(
        String repositoryName,
        String ownerLogin,
        List<Branch> branches
) {
}
