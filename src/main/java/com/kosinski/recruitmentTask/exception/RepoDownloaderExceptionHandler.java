package com.kosinski.recruitmentTask.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RepoDownloaderExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public RepoDownloaderExceptionResponse handleNotFoundException(NotFoundException exception) {
        log.warn("Not found resource");
        return new RepoDownloaderExceptionResponse(HttpStatus.NOT_FOUND, exception.getMessage());
    }

    @ExceptionHandler(InvalidAcceptException.class)
    @ResponseBody
    public ResponseEntity<RepoDownloaderExceptionResponse> handleInvalidAcceptException(InvalidAcceptException exception) {
        log.warn("Invalid accept format");
        RepoDownloaderExceptionResponse response = new RepoDownloaderExceptionResponse(HttpStatus.NOT_ACCEPTABLE, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).contentType(MediaType.APPLICATION_JSON).body(response);
    }
}
