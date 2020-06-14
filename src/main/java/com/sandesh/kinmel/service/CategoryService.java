package com.sandesh.kinmel.service;

import com.sandesh.kinmel.interfaces.CategoryView;
import com.sandesh.kinmel.model.Category;
import com.sandesh.kinmel.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private RestTemplate restTemplate;

    public List<CategoryView> getAllCategoriesView() {
        ResponseEntity<List<CategoryView>> respListCat = restTemplate.exchange("http://localhost:8081/rest/categories/view", HttpMethod.GET,
                null, new ParameterizedTypeReference<List<CategoryView>>(){});
        return respListCat.getBody();
    }

    public List<Category> getAllCategories() {
        ResponseEntity<List<Category>> respListCat = restTemplate.exchange("http://localhost:8081/rest/categories", HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Category>>(){});
        return respListCat.getBody();
    }
}
