package com.fh.biz;

import org.springframework.stereotype.Component;

@Component
public class FallBack implements TypeService{

    @Override
    public String findById(Integer id) {
        return "错误";
    }
}
