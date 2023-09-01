package com.kosinski.recruitmentTask.exception;

import org.springframework.http.HttpStatus;

public record RepoDownloaderExceptionResponse(
        HttpStatus status,
        String message
) {
}
