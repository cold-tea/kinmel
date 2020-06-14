package com.sandesh.kinmel.service;

import com.sandesh.kinmel.model.BaseFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BaseFilterService {

    @Autowired
    private RestTemplate restTemplate;

    public List<BaseFilter> getAllBaseFilters() {
        ResponseEntity<List<BaseFilter>> respListCat = restTemplate.exchange("http://localhost:8081/rest/filter/base", HttpMethod.GET,
                null, new ParameterizedTypeReference<List<BaseFilter>>(){});
        return respListCat.getBody();
    }
}
