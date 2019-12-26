package com.fh.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Page implements Serializable {
    private int start;
    private int length;
    private int draw;
}
