package com.sandesh.kinmel.services;

import com.sandesh.kinmel.model.Status;
import com.sandesh.kinmel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<Status> saveUser(User user) {
        return restTemplate.postForEntity("http://localhost:8081/rest/users/", user, Status.class);
    }
}
