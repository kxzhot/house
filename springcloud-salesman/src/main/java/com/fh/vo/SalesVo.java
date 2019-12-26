package com.fh.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SalesVo implements Serializable {
    private int id;
    private String salesName;
    private int age;
    private int sex;
    private String phone;
    private String entryTime;
}
