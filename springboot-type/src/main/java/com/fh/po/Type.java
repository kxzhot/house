package com.fh.po;

import com.fh.common.Page;
import lombok.Data;

import java.io.Serializable;
@Data
public class Type extends Page implements Serializable {
    private int id;
    private String genre;
}
