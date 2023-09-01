package com.kosinski.recruitmentTask.domain;


import lombok.Builder;

@Builder
public record Repository(
        String name,
        Owner owner,
        boolean fork
) {

}
