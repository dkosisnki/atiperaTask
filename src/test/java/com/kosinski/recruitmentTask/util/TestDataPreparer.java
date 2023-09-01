package com.kosinski.recruitmentTask.util;

import com.kosinski.recruitmentTask.domain.Owner;
import com.kosinski.recruitmentTask.domain.Repository;


public interface TestDataPreparer {


    default Owner someOwner1() {
        return Owner.builder()
                .login("SavageBob69")
                .build();
    }

    default Repository someRepository1() {
        return Repository.builder()
                .owner(someOwner1())
                .name("someRepository1")
                .fork(false)
                .build();
    }

    default Repository someRepository2() {
        return Repository.builder()
                .owner(someOwner1())
                .name("someRepository2")
                .fork(false)
                .build();
    }

    default Repository someRepository3() {
        return Repository.builder()
                .owner(someOwner1())
                .name("someRepository3")
                .fork(true)
                .build();
    }
}
