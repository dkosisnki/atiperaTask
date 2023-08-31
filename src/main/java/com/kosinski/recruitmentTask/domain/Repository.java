package com.kosinski.recruitmentTask.domain;

import java.util.List;

public record Repository(
        String repositoryName,
        Owner ownerLogin,
        List<Branch> branches
) {

}
