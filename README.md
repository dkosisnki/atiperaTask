# Atipera Task
API enables to get some information from GitHub API about repository of provided user.
# How to use?
1. Clone the repository
2. Mark integration directory as test source root, if you want to run it.
3. Send requests to the appropriate endpoint.

**Endpoint:** `http://localhost:8080/repositories/{username}`

**Method:** GET

**Headers:**
- Accept: application/json

**Example response:**



```
[
 {
  "repositoryName": "atiperaTask",
  "ownerLogin": "dkosisnki",
  "branches": [
    {
     "name": "master",
     "commit": {
       "sha": "f55362cbc83cd0665598b7dcac58433ea12c683b"
      }
    }
   ]
 },
 {
  "repositoryName": "my-testing-repo",
  "ownerLogin": "dkosisnki",
  "branches": [
    {
      "name": "master",
      "commit": {
        "sha": "003cac39c3d3b6a2f783df5ece8ce06da728d982"
      }
    },
    {
      "name": "someOtherBranch",
      "commit": {
        "sha": "dd33fb5a3cae8205879f2fa1b3e0994ab4b163e8"
      }
    }
   ]
  }
]
```
