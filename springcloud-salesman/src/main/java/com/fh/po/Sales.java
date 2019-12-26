package com.fh.po;

import com.fh.common.Page;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@Data
public class Sales extends Page implements Serializable {
    private int id;
    private String salesName;
    private int age;
    private int sex;
    private String phone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryTime;
}
