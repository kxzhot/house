package com.fh.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-city",fallback = CityServiceimpl.class)
public interface CityService {
    //通过id查找
    @RequestMapping(value = "queryById")
    String queryById(Integer id);

    //通过pid查找
    @RequestMapping(value = "queryByPid")
    String queryByPid(Integer pid);

    //通过省市县id查找，并拼接成一个字符串返回
    @RequestMapping(value = "queryCityData")
    String queryCityData(Integer proId, Integer areaId, Integer ComId);
}
