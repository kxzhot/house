package com.fh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class TagService {
    @Autowired
    private RestTemplate restTemplate;

    //根据id查找
    @GetMapping("/tag/queryTagById/{id}")
    String queryTagById( Integer id){
        return restTemplate.getForObject("http://springboot-tag/tag/queryTagById/?id="+id, String.class);
    }
}
