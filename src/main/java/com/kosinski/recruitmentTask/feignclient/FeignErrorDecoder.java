package com.kosinski.recruitmentTask.feignclient;



import com.kosinski.recruitmentTask.exception.NotFoundException;
import org.springframework.stereotype.Component;

import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;

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
