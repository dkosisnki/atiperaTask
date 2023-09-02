package com.kosinski.recruitmentTask.feignclient;


import com.kosinski.recruitmentTask.exception.NotFoundException;
import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

@Component
public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() == 404) {
            return new NotFoundException("Resource not found");
        }
        return FeignException.errorStatus(methodKey, response);
    }
}
