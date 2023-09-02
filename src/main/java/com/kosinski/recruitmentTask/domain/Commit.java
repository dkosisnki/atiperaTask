package com.kosinski.recruitmentTask.domain;

import lombok.Builder;

@Builder
public record Commit(String sha) {
}
