package com.fh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class Citycontroller {
    @Autowired
    private RestTemplate restTemplate;

    //通过id查找@Service
    @RequestMapping(value = "queryById")
    public String queryById(Integer id) {
        return restTemplate.getForObject("http://springcloud-city/city/queryById?id="+id, String.class);
    }
    //通过pid查找
    @RequestMapping(value = "queryByPid")
    public String queryByPid(Integer pid) {
        return restTemplate.getForObject("http://springcloud-city/city/queryByPid?pid="+pid, String.class);
    }

    //通过省市县id查找，并拼接成一个字符串返回
    @RequestMapping(value = "queryCityData")
    public String queryCityData(Integer proId, Integer areaId, Integer ComId) {
        return restTemplate.getForObject("http://springcloud-city/city/queryCityData?proId="+proId+"&areaId="+areaId+"&ComId="+ComId, String.class);
    }
}
