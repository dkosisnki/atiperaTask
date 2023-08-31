package com.kosinski.recruitmentTask.domain;

public record Branch(
        String name,
        String lastCommitSha
) {
}
