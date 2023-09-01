package com.kosinski.recruitmentTask.exception;

import com.kosinski.recruitmentTask.controller.RepoDownloaderController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = RepoDownloaderController.class)
@Slf4j
public class RepoDownloaderExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public RepoDownloaderExceptionResponse handleNotFoundException(NotFoundException exception){
        log.warn("Not found resource");
        return new RepoDownloaderExceptionResponse(HttpStatus.NOT_FOUND, exception.getMessage());
    }

    @ExceptionHandler(InvalidAcceptException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public RepoDownloaderExceptionResponse handleInvalidAcceptException(InvalidAcceptException exception){
        log.warn("Invalid accept format");
        return new RepoDownloaderExceptionResponse(HttpStatus.NOT_ACCEPTABLE, exception.getMessage());
    }
}
