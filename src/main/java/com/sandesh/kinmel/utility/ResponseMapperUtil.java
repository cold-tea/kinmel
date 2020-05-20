package com.sandesh.kinmel.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sandesh.kinmel.model.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseMapperUtil {
    private static ObjectMapper objectMapper;
    static {
        objectMapper = new ObjectMapper();
    }
    public static ResponseEntity<Status> mapExToResponse(String statusText, String errorMessage) throws JsonProcessingException {
        HttpStatus httpStatus = HttpStatus.valueOf(statusText);
        Status status = objectMapper.readValue(errorMessage, Status.class);
        return ResponseEntity.status(httpStatus).body(status);
    }

    public static ResponseEntity<Status> mapExToResponse(HttpStatus httpStatus, String errorMessage) throws JsonProcessingException {
        Status status = objectMapper.readValue(errorMessage, Status.class);
        return ResponseEntity.status(httpStatus).body(status);
    }
}
