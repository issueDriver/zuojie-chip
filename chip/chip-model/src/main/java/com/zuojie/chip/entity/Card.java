package com.zuojie.chip.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Card implements Serializable {
    private Integer id;
    private String name;
    private String info;
    private String phone;
    private String email;
    private String address;
    private String blogurl;
    private String position;
    private int flag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;
}
