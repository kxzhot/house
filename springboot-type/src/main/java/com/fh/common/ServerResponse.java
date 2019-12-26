package com.fh.common;

import lombok.Data;

import java.io.Serializable;
@Data
public class ServerResponse implements Serializable {

    private int status;

    private String msg;

    private Object data;

    public ServerResponse(){

    }
    private ServerResponse(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static ServerResponse success() {
        return new ServerResponse(200, "ok", null);
    }

    public static ServerResponse success(Object data) {
        return new ServerResponse(200, "ok", data);
    }

    public static ServerResponse error() {
        return new ServerResponse(-1, "操作失败", null);
    }

    public static ServerResponse error(int code, String msg) {
        return new ServerResponse(code, msg, null);
    }

    public static ServerResponse error(ResponseEnum responseEnum){
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMsg(),null);
    }

}
