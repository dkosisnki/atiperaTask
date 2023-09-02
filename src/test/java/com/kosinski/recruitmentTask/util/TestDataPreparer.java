package com.kosinski.recruitmentTask.util;

import com.kosinski.recruitmentTask.domain.Branch;
import com.kosinski.recruitmentTask.domain.Commit;
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

    default Branch someBranch1(){
        return Branch.builder()
                .commit(someCommit1())
                .name("someBranch1")
                .build();
    }

    default Branch someBranch2(){
        return Branch.builder()
                .commit(someCommit2())
                .name("someBranch2")
                .build();
    }

    default Commit someCommit1(){
        return Commit.builder()
                .sha("214sad6")
                .build();
    }

    default Commit someCommit2(){
        return Commit.builder()
                .sha("315gaad4tg6")
                .build();
    }
}
