package com.fh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "springboot-tag")
public interface TagService {

    //根据id查找
    @RequestMapping(value = "/tag/queryTagById/{id}",method = RequestMethod.GET)
    String queryTagById( Integer id);
}
