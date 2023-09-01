package com.kosinski.recruitmentTask.domain;



public record Repository(
        String name,
        Owner owner,
        boolean fork
) {

}
