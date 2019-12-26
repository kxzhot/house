package com.fh.controller;

import org.springframework.stereotype.Component;
@Component
public class CityServiceimpl implements CityService {

    @Override
    public String queryById(Integer pid) {
        return "错误";
    }

    @Override
    public String queryByPid(Integer pid) {
        return "错误";
    }

    @Override
    public String queryCityData(Integer proId, Integer areaId, Integer ComId) {
        return "错误";
    }
}
