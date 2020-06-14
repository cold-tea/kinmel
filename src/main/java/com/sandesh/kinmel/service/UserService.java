package com.sandesh.kinmel.service;

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

    public Long getUserCountByUsername(String username) {
        return restTemplate.getForObject("http://localhost:8081/rest/users/count/" + username, Long.class);
    }

    /*  This will also work, below one is used to utilize the feature of AOP
    public ResponseEntity<Status> saveUser(User user) throws JsonProcessingException {
        ResponseEntity<Status> responseEntity = null;
        try {
            responseEntity = restTemplate.postForEntity("http://localhost:8081/rest/users/", user, Status.class);
        } catch (HttpClientErrorException ex) {
            responseEntity = ResponseMapperUtil.mapExToResponse(ex.getStatusCode(), ex.getResponseBodyAsString());
        }
        return responseEntity;
    }
     */

    public ResponseEntity<Status> saveUser(User user) {
        return restTemplate.postForEntity("http://localhost:8081/rest/users/", user, Status.class);
    }

    public Long getUserCountByEmail(String email) {
        return restTemplate.getForObject("http://localhost:8081/rest/users/countEmail/" + email, Long.class);
    }

    public User getUserByUsername(String username) {
        ResponseEntity<User> usersResponse = restTemplate.getForEntity("http://localhost:8081/rest/users/" + username,
                User.class);
        User user = usersResponse.getBody();
        return user;
    }
}
