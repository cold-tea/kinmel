package com.sandesh.kinmel.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sandesh.kinmel.model.Status;
import com.sandesh.kinmel.model.User;
import com.sandesh.kinmel.utility.ResponseMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public Long getUserCountByUsername(String username) {
        return restTemplate.getForObject("http://localhost:8081/rest/users/count/" + username, Long.class);
    }

    public ResponseEntity<Status> saveUser(User user) throws JsonProcessingException {
        ResponseEntity<Status> responseEntity = null;
        try {
            responseEntity = restTemplate.postForEntity("http://localhost:8081/rest/users/", user, Status.class);
        } catch (HttpClientErrorException ex) {
            responseEntity = ResponseMapperUtil.mapExToResponse(ex.getStatusCode(), ex.getResponseBodyAsString());
        }
        return responseEntity;
    }
}
