package com.sandesh.kinmel.services;

import com.sandesh.kinmel.model.User;
import com.sandesh.kinmel.model.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ResponseEntity<User> usersResponse = restTemplate.getForEntity("http://localhost:8081/rest/users/" + username,
                User.class);
        User user = usersResponse.getBody();
        if (user == null) throw new UsernameNotFoundException("Username not found");
        return new UserDetailsImpl(user);
    }
}
