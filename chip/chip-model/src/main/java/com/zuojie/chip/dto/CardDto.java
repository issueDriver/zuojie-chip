package com.zuojie.chip.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class CardDto implements Serializable {
    private String name;
    private String info;
    private String phone;
    private String email;
    private String address;
    private String blogurl;
    private String position;
}
