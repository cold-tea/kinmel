package com.sandesh.kinmel.aspect;

import com.sandesh.kinmel.model.Status;
import com.sandesh.kinmel.utility.ResponseMapperUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

@Aspect
@Component
public class GetLoginAspect {

    private static final Logger logger = LoggerFactory.getLogger(GetLoginAspect.class);

    @Around(value = "execution(* com.sandesh.kinmel.services.*.saveUser(..))")
    public ResponseEntity<Status> responseMapperForService(ProceedingJoinPoint joinPoint) throws Throwable {
        ResponseEntity<Status> responseEntity = null;
        logger.error("Around AOP for services");
        try {
            Object object = joinPoint.proceed();
            if (object instanceof ResponseEntity) responseEntity = (ResponseEntity<Status>) object;
        } catch (HttpClientErrorException ex) {
            responseEntity = ResponseMapperUtil.mapExToResponse(ex.getStatusCode(), ex.getResponseBodyAsString());
        }

        return responseEntity;
    }
}
