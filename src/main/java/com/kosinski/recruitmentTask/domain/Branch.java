package com.kosinski.recruitmentTask.domain;

import lombok.Builder;

@Builder
public record Branch(
        String name,
        Commit commit
) {
}
