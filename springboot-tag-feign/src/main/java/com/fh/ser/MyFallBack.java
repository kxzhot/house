package com.fh.ser;

import org.springframework.stereotype.Component;
@Component
public class MyFallBack implements TagService {

    @Override
    public String queryTagById(Integer id) {
        return "错误";
    }
}
