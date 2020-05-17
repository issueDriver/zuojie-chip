package com.zuojie.chip.service;

import com.zuojie.chip.dto.CardDto;
import com.zuojie.chip.vo.R;

public interface CardService {
    /**
     * ​	1.校验手机号是否存在
     *
     * ​	2.根据手机号查询名片
     *
     * ​	3.新增名片信息
     *
     * ​	4.查询名片列表*/
    R checkPhone(String phone);
    R queryByPhone(String phone);
    R save(CardDto dto);
    R all();

    /**
     * 查询 名片对应的二维码
     * @param phone
     * @return
     */
    R queryQRcode(String phone);
}
