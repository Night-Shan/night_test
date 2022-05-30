package com.night.controller;

import lombok.Data;

@Data
public class R {
    private Object obj;
    private Boolean msg;

    public R() {
    }

    public R(Object obj) {
        this.obj = obj;
    }

    public R(Object obj, Boolean msg) {
        this.obj = obj;
        this.msg = msg;
    }

    public static R lR(Object obj){

        return new R(obj);
    }

    public static R testR(Object data,Boolean msg){

        return new R(data,true);
    }
}
