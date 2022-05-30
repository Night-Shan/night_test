package com.night.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class PlayAndOrderVo {
    private int id;
    private String username;
    private String userpassword;
    private Date createTime;
    private int orderid;
    private String ordername;
    private String orderclass;

}
