package com.zuojie.chip.controller;

import com.zuojie.chip.dto.CardDto;
import com.zuojie.chip.service.CardService;
import com.zuojie.chip.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@Api(value = "操作名片",tags = "操作名片") //修饰类
@RestController
@CrossOrigin //解决跨域的问题
public class CardController {
    //
    @Reference(version = "2.0.0",timeout = 10000,retries = 0)
    private CardService service;

    /**
     * 校验
     * @param phone
     * @return
     */
    @ApiOperation(value = "实现手机号的校验",notes = "实现手机号的校验")
    @GetMapping("/api/card/checkphone.do")
    public R check(String phone){
        return service.checkPhone(phone);
    }

    /**
     * 查询单个名片信息
     * @param phone
     * @return
     */
    @ApiOperation(value = "查询单个名片信息",notes = "查询单个名片信息")
    @GetMapping("/api/card/single.do")
    public R single(String phone){
        return service.queryByPhone(phone);
    }

    /**
     * 查询单个名片信息对应的二维码
     * @param phone
     * @return
     */
    @ApiOperation(value = "查询单个名片信息对应的二维码",notes = "查询单个名片信息对应的二维码")
    @GetMapping("/api/card/singleQrcode.do")
    public R singleQrcode(String phone){
        return service.queryQRcode(phone);
    }

    /**
     * 查询所有的名片数据
     * @return
     */
    @ApiOperation(value = "查询所有的名片数据",notes = "查询所有的名片数据")
    @GetMapping("api/card/all.do")
    public R all(){
        return service.all();
    }

    /**
     * 新增名片
     * @param dto
     * @return
     */
    @ApiOperation(value = "新增名片数据",notes = "新增名片数据")
    @PostMapping("api/card/save.do")
    public R save(@RequestBody CardDto dto){
        return service.save(dto);
    }

}
