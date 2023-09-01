package com.kosinski.recruitmentTask.features.samples;

public interface SampleGithubResponse {

    default String sampleResponseFromGithubApi() {
        return """
                [
                    {
                        "id": 685088222,
                        "node_id": "R_kgDOKNWd3g",
                        "name": "atiperaTask",
                        "full_name": "dkosisnki/atiperaTask",
                        "private": false,
                        "owner": {
                            "login": "dkosisnki",
                            "id": 129215194,
                            "node_id": "U_kgDOB7Oq2g",
                            "avatar_url": "https://avatars.githubusercontent.com/u/129215194?v=4",
                            "gravatar_id": "",
                            "url": "https://api.github.com/users/dkosisnki",
                            "html_url": "https://github.com/dkosisnki",
                            "followers_url": "https://api.github.com/users/dkosisnki/followers",
                            "following_url": "https://api.github.com/users/dkosisnki/following{/other_user}",
                            "gists_url": "https://api.github.com/users/dkosisnki/gists{/gist_id}",
                            "starred_url": "https://api.github.com/users/dkosisnki/starred{/owner}{/repo}",
                            "subscriptions_url": "https://api.github.com/users/dkosisnki/subscriptions",
                            "organizations_url": "https://api.github.com/users/dkosisnki/orgs",
                            "repos_url": "https://api.github.com/users/dkosisnki/repos",
                            "events_url": "https://api.github.com/users/dkosisnki/events{/privacy}",
                            "received_events_url": "https://api.github.com/users/dkosisnki/received_events",
                            "type": "User",
                            "site_admin": false
                        },
                        "html_url": "https://github.com/dkosisnki/atiperaTask",
                        "description": null,
                        "fork": false,
                        "url": "https://api.github.com/repos/dkosisnki/atiperaTask",
                        "forks_url": "https://api.github.com/repos/dkosisnki/atiperaTask/forks",
                        "keys_url": "https://api.github.com/repos/dkosisnki/atiperaTask/keys{/key_id}",
                        "collaborators_url": "https://api.github.com/repos/dkosisnki/atiperaTask/collaborators{/collaborator}",
                        "teams_url": "https://api.github.com/repos/dkosisnki/atiperaTask/teams",
                        "hooks_url": "https://api.github.com/repos/dkosisnki/atiperaTask/hooks",
                        "issue_events_url": "https://api.github.com/repos/dkosisnki/atiperaTask/issues/events{/number}",
                        "events_url": "https://api.github.com/repos/dkosisnki/atiperaTask/events",
                        "assignees_url": "https://api.github.com/repos/dkosisnki/atiperaTask/assignees{/user}",
                        "branches_url": "https://api.github.com/repos/dkosisnki/atiperaTask/branches{/branch}",
                        "tags_url": "https://api.github.com/repos/dkosisnki/atiperaTask/tags",
                        "blobs_url": "https://api.github.com/repos/dkosisnki/atiperaTask/git/blobs{/sha}",
                        "git_tags_url": "https://api.github.com/repos/dkosisnki/atiperaTask/git/tags{/sha}",
                        "git_refs_url": "https://api.github.com/repos/dkosisnki/atiperaTask/git/refs{/sha}",
                        "trees_url": "https://api.github.com/repos/dkosisnki/atiperaTask/git/trees{/sha}",
                        "statuses_url": "https://api.github.com/repos/dkosisnki/atiperaTask/statuses/{sha}",
                        "languages_url": "https://api.github.com/repos/dkosisnki/atiperaTask/languages",
                        "stargazers_url": "https://api.github.com/repos/dkosisnki/atiperaTask/stargazers",
                        "contributors_url": "https://api.github.com/repos/dkosisnki/atiperaTask/contributors",
                        "subscribers_url": "https://api.github.com/repos/dkosisnki/atiperaTask/subscribers",
                        "subscription_url": "https://api.github.com/repos/dkosisnki/atiperaTask/subscription",
                        "commits_url": "https://api.github.com/repos/dkosisnki/atiperaTask/commits{/sha}",
                        "git_commits_url": "https://api.github.com/repos/dkosisnki/atiperaTask/git/commits{/sha}",
                        "comments_url": "https://api.github.com/repos/dkosisnki/atiperaTask/comments{/number}",
                        "issue_comment_url": "https://api.github.com/repos/dkosisnki/atiperaTask/issues/comments{/number}",
                        "contents_url": "https://api.github.com/repos/dkosisnki/atiperaTask/contents/{+path}",
                        "compare_url": "https://api.github.com/repos/dkosisnki/atiperaTask/compare/{base}...{head}",
                        "merges_url": "https://api.github.com/repos/dkosisnki/atiperaTask/merges",
                        "archive_url": "https://api.github.com/repos/dkosisnki/atiperaTask/{archive_format}{/ref}",
                        "downloads_url": "https://api.github.com/repos/dkosisnki/atiperaTask/downloads",
                        "issues_url": "https://api.github.com/repos/dkosisnki/atiperaTask/issues{/number}",
                        "pulls_url": "https://api.github.com/repos/dkosisnki/atiperaTask/pulls{/number}",
                        "milestones_url": "https://api.github.com/repos/dkosisnki/atiperaTask/milestones{/number}",
                        "notifications_url": "https://api.github.com/repos/dkosisnki/atiperaTask/notifications{?since,all,participating}",
                        "labels_url": "https://api.github.com/repos/dkosisnki/atiperaTask/labels{/name}",
                        "releases_url": "https://api.github.com/repos/dkosisnki/atiperaTask/releases{/id}",
                        "deployments_url": "https://api.github.com/repos/dkosisnki/atiperaTask/deployments",
                        "created_at": "2023-08-30T13:45:57Z",
                        "updated_at": "2023-08-30T13:46:53Z",
                        "pushed_at": "2023-08-31T05:37:10Z",
                        "git_url": "git://github.com/dkosisnki/atiperaTask.git",
                        "ssh_url": "git@github.com:dkosisnki/atiperaTask.git",
                        "clone_url": "https://github.com/dkosisnki/atiperaTask.git",
                        "svn_url": "https://github.com/dkosisnki/atiperaTask",
                        "homepage": null,
                        "size": 3,
                        "stargazers_count": 0,
                        "watchers_count": 0,
                        "language": "Java",
                        "has_issues": true,
                        "has_projects": true,
                        "has_downloads": true,
                        "has_wiki": true,
                        "has_pages": false,
                        "has_discussions": false,
                        "forks_count": 0,
                        "mirror_url": null,
                        "archived": false,
                        "disabled": false,
                        "open_issues_count": 0,
                        "license": null,
                        "allow_forking": true,
                        "is_template": false,
                        "web_commit_signoff_required": false,
                        "topics": [],
                        "visibility": "public",
                        "forks": 0,
                        "open_issues": 0,
                        "watchers": 0,
                        "default_branch": "master"
                    },
                    {
                        "id": 650143852,
                        "node_id": "R_kgDOJsBobA",
                        "name": "LottoGame",
                        "full_name": "dkosisnki/LottoGame",
                        "private": false,
                        "owner": {
                            "login": "dkosisnki",
                            "id": 129215194,
                            "node_id": "U_kgDOB7Oq2g",
                            "avatar_url": "https://avatars.githubusercontent.com/u/129215194?v=4",
                            "gravatar_id": "",
                            "url": "https://api.github.com/users/dkosisnki",
                            "html_url": "https://github.com/dkosisnki",
                            "followers_url": "https://api.github.com/users/dkosisnki/followers",
                            "following_url": "https://api.github.com/users/dkosisnki/following{/other_user}",
                            "gists_url": "https://api.github.com/users/dkosisnki/gists{/gist_id}",
                            "starred_url": "https://api.github.com/users/dkosisnki/starred{/owner}{/repo}",
                            "subscriptions_url": "https://api.github.com/users/dkosisnki/subscriptions",
                            "organizations_url": "https://api.github.com/users/dkosisnki/orgs",
                            "repos_url": "https://api.github.com/users/dkosisnki/repos",
                            "events_url": "https://api.github.com/users/dkosisnki/events{/privacy}",
                            "received_events_url": "https://api.github.com/users/dkosisnki/received_events",
                            "type": "User",
                            "site_admin": false
                        },
                        "html_url": "https://github.com/dkosisnki/LottoGame",
                        "description": null,
                        "fork": true,
                        "url": "https://api.github.com/repos/dkosisnki/LottoGame",
                        "forks_url": "https://api.github.com/repos/dkosisnki/LottoGame/forks",
                        "keys_url": "https://api.github.com/repos/dkosisnki/LottoGame/keys{/key_id}",
                        "collaborators_url": "https://api.github.com/repos/dkosisnki/LottoGame/collaborators{/collaborator}",
                        "teams_url": "https://api.github.com/repos/dkosisnki/LottoGame/teams",
                        "hooks_url": "https://api.github.com/repos/dkosisnki/LottoGame/hooks",
                        "issue_events_url": "https://api.github.com/repos/dkosisnki/LottoGame/issues/events{/number}",
                        "events_url": "https://api.github.com/repos/dkosisnki/LottoGame/events",
                        "assignees_url": "https://api.github.com/repos/dkosisnki/LottoGame/assignees{/user}",
                        "branches_url": "https://api.github.com/repos/dkosisnki/LottoGame/branches{/branch}",
                        "tags_url": "https://api.github.com/repos/dkosisnki/LottoGame/tags",
                        "blobs_url": "https://api.github.com/repos/dkosisnki/LottoGame/git/blobs{/sha}",
                        "git_tags_url": "https://api.github.com/repos/dkosisnki/LottoGame/git/tags{/sha}",
                        "git_refs_url": "https://api.github.com/repos/dkosisnki/LottoGame/git/refs{/sha}",
                        "trees_url": "https://api.github.com/repos/dkosisnki/LottoGame/git/trees{/sha}",
                        "statuses_url": "https://api.github.com/repos/dkosisnki/LottoGame/statuses/{sha}",
                        "languages_url": "https://api.github.com/repos/dkosisnki/LottoGame/languages",
                        "stargazers_url": "https://api.github.com/repos/dkosisnki/LottoGame/stargazers",
                        "contributors_url": "https://api.github.com/repos/dkosisnki/LottoGame/contributors",
                        "subscribers_url": "https://api.github.com/repos/dkosisnki/LottoGame/subscribers",
                        "subscription_url": "https://api.github.com/repos/dkosisnki/LottoGame/subscription",
                        "commits_url": "https://api.github.com/repos/dkosisnki/LottoGame/commits{/sha}",
                        "git_commits_url": "https://api.github.com/repos/dkosisnki/LottoGame/git/commits{/sha}",
                        "comments_url": "https://api.github.com/repos/dkosisnki/LottoGame/comments{/number}",
                        "issue_comment_url": "https://api.github.com/repos/dkosisnki/LottoGame/issues/comments{/number}",
                        "contents_url": "https://api.github.com/repos/dkosisnki/LottoGame/contents/{+path}",
                        "compare_url": "https://api.github.com/repos/dkosisnki/LottoGame/compare/{base}...{head}",
                        "merges_url": "https://api.github.com/repos/dkosisnki/LottoGame/merges",
                        "archive_url": "https://api.github.com/repos/dkosisnki/LottoGame/{archive_format}{/ref}",
                        "downloads_url": "https://api.github.com/repos/dkosisnki/LottoGame/downloads",
                        "issues_url": "https://api.github.com/repos/dkosisnki/LottoGame/issues{/number}",
                        "pulls_url": "https://api.github.com/repos/dkosisnki/LottoGame/pulls{/number}",
                        "milestones_url": "https://api.github.com/repos/dkosisnki/LottoGame/milestones{/number}",
                        "notifications_url": "https://api.github.com/repos/dkosisnki/LottoGame/notifications{?since,all,participating}",
                        "labels_url": "https://api.github.com/repos/dkosisnki/LottoGame/labels{/name}",
                        "releases_url": "https://api.github.com/repos/dkosisnki/LottoGame/releases{/id}",
                        "deployments_url": "https://api.github.com/repos/dkosisnki/LottoGame/deployments",
                        "created_at": "2023-06-06T12:39:43Z",
                        "updated_at": "2023-06-06T13:09:14Z",
                        "pushed_at": "2023-08-07T20:29:36Z",
                        "git_url": "git://github.com/dkosisnki/LottoGame.git",
                        "ssh_url": "git@github.com:dkosisnki/LottoGame.git",
                        "clone_url": "https://github.com/dkosisnki/LottoGame.git",
                        "svn_url": "https://github.com/dkosisnki/LottoGame",
                        "homepage": null,
                        "size": 101,
                        "stargazers_count": 0,
                        "watchers_count": 0,
                        "language": "Java",
                        "has_issues": true,
                        "has_projects": true,
                        "has_downloads": true,
                        "has_wiki": true,
                        "has_pages": false,
                        "has_discussions": false,
                        "forks_count": 0,
                        "mirror_url": null,
                        "archived": false,
                        "disabled": false,
                        "open_issues_count": 0,
                        "license": null,
                        "allow_forking": true,
                        "is_template": false,
                        "web_commit_signoff_required": false,
                        "topics": [],
                        "visibility": "public",
                        "forks": 0,
                        "open_issues": 0,
                        "watchers": 0,
                        "default_branch": "master"
                    },
                    {
                            "id": 624905989,
                            "node_id": "R_kgDOJT9PBQ",
                            "name": "my-testing-repo",
                            "full_name": "dkosisnki/my-testing-repo",
                            "private": false,
                            "owner": {
                                "login": "dkosisnki",
                                "id": 129215194,
                                "node_id": "U_kgDOB7Oq2g",
                                "avatar_url": "https://avatars.githubusercontent.com/u/129215194?v=4",
                                "gravatar_id": "",
                                "url": "https://api.github.com/users/dkosisnki",
                                "html_url": "https://github.com/dkosisnki",
                                "followers_url": "https://api.github.com/users/dkosisnki/followers",
                                "following_url": "https://api.github.com/users/dkosisnki/following{/other_user}",
                                "gists_url": "https://api.github.com/users/dkosisnki/gists{/gist_id}",
                                "starred_url": "https://api.github.com/users/dkosisnki/starred{/owner}{/repo}",
                                "subscriptions_url": "https://api.github.com/users/dkosisnki/subscriptions",
                                "organizations_url": "https://api.github.com/users/dkosisnki/orgs",
                                "repos_url": "https://api.github.com/users/dkosisnki/repos",
                                "events_url": "https://api.github.com/users/dkosisnki/events{/privacy}",
                                "received_events_url": "https://api.github.com/users/dkosisnki/received_events",
                                "type": "User",
                                "site_admin": false
                            },
                            "html_url": "https://github.com/dkosisnki/my-testing-repo",
                            "description": null,
                            "fork": false,
                            "url": "https://api.github.com/repos/dkosisnki/my-testing-repo",
                            "forks_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/forks",
                            "keys_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/keys{/key_id}",
                            "collaborators_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/collaborators{/collaborator}",
                            "teams_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/teams",
                            "hooks_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/hooks",
                            "issue_events_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/issues/events{/number}",
                            "events_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/events",
                            "assignees_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/assignees{/user}",
                            "branches_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/branches{/branch}",
                            "tags_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/tags",
                            "blobs_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/git/blobs{/sha}",
                            "git_tags_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/git/tags{/sha}",
                            "git_refs_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/git/refs{/sha}",
                            "trees_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/git/trees{/sha}",
                            "statuses_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/statuses/{sha}",
                            "languages_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/languages",
                            "stargazers_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/stargazers",
                            "contributors_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/contributors",
                            "subscribers_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/subscribers",
                            "subscription_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/subscription",
                            "commits_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/commits{/sha}",
                            "git_commits_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/git/commits{/sha}",
                            "comments_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/comments{/number}",
                            "issue_comment_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/issues/comments{/number}",
                            "contents_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/contents/{+path}",
                            "compare_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/compare/{base}...{head}",
                            "merges_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/merges",
                            "archive_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/{archive_format}{/ref}",
                            "downloads_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/downloads",
                            "issues_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/issues{/number}",
                            "pulls_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/pulls{/number}",
                            "milestones_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/milestones{/number}",
                            "notifications_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/notifications{?since,all,participating}",
                            "labels_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/labels{/name}",
                            "releases_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/releases{/id}",
                            "deployments_url": "https://api.github.com/repos/dkosisnki/my-testing-repo/deployments",
                            "created_at": "2023-04-07T14:55:28Z",
                            "updated_at": "2023-04-07T15:37:00Z",
                            "pushed_at": "2023-04-09T13:45:57Z",
                            "git_url": "git://github.com/dkosisnki/my-testing-repo.git",
                            "ssh_url": "git@github.com:dkosisnki/my-testing-repo.git",
                            "clone_url": "https://github.com/dkosisnki/my-testing-repo.git",
                            "svn_url": "https://github.com/dkosisnki/my-testing-repo",
                            "homepage": null,
                            "size": 60,
                            "stargazers_count": 0,
                            "watchers_count": 0,
                            "language": "Java",
                            "has_issues": true,
                            "has_projects": true,
                            "has_downloads": true,
                            "has_wiki": true,
                            "has_pages": false,
                            "has_discussions": false,
                            "forks_count": 0,
                            "mirror_url": null,
                            "archived": false,
                            "disabled": false,
                            "open_issues_count": 0,
                            "license": null,
                            "allow_forking": true,
                            "is_template": false,
                            "web_commit_signoff_required": false,
                            "topics": [],
                            "visibility": "public",
                            "forks": 0,
                            "open_issues": 0,
                            "watchers": 0,
                            "default_branch": "master"
                        }
                ]
                """.trim();
    }

    default String sampleResponseForRepo1(){
       return  """
                [
                    {
                        "name": "master",
                        "commit": {
                            "sha": "f55362cbc83cd0665598b7dcac58433ea12c683b",
                            "url": "https://api.github.com/repos/dkosisnki/atiperaTask/commits/f55362cbc83cd0665598b7dcac58433ea12c683b"
                        },
                        "protected": false
                    }
                ]
                """;

    }
    default String sampleResponseForRepo2(){
        return """
                [
                    {
                        "name": "master",
                        "commit": {
                            "sha": "2eb5b254486d49fc39664593bb020e0baba89480",
                            "url": "https://api.github.com/repos/dkosisnki/LottoGame/commits/2eb5b254486d49fc39664593bb020e0baba89480"
                        },
                        "protected": false
                    }
                ]
                """;
    }
    default String sampleResponseForRepo3(){
        return """
                [
                    {
                        "name": "master",
                        "commit": {
                            "sha": "003cac39c3d3b6a2f783df5ece8ce06da728d982",
                            "url": "https://api.github.com/repos/dkosisnki/my-testing-repo/commits/003cac39c3d3b6a2f783df5ece8ce06da728d982"
                        },
                        "protected": false
                    },
                    {
                        "name": "someOtherBranch",
                        "commit": {
                            "sha": "dd33fb5a3cae8205879f2fa1b3e0994ab4b163e8",
                            "url": "https://api.github.com/repos/dkosisnki/my-testing-repo/commits/917957hsahd7h1e6gdsg6a6812g68das1224fuh97"
                        },
                        "protected": false
                    }
                ]
                """;
    }
}
