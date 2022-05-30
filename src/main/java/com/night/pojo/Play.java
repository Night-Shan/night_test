package com.night.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Play {
    private int id;
    private String username;
    private String user_password;
    private Date createTime;
    private int order_id;
}
