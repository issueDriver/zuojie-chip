package com.zuojie.chip.controller;

import com.zuojie.chip.service.QRcodeService;
import com.zuojie.chip.util.QRcodeUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Api(value = "实现二维码图片的生成",tags = "实现二维码图片的生成")
@Controller
public class QRcodeController {

    @Autowired
    private QRcodeService qRcodeService;

    /**
     * 普通字符串的二维码
     * @param msg
     * @param response
     * @throws IOException
     */
    @GetMapping("/api/qrcode/showqrcode.do")
    public void showImg(String msg, HttpServletResponse response) throws IOException {
        BufferedImage image= QRcodeUtil.createColor(msg,500);
        ImageIO.write(image,"png",response.getOutputStream());
    }

    /**
     * 基于base64URL进行编码的 内容 生成二维码
     * @param msg
     * @param response
     * @throws IOException
     */
    @GetMapping("/api/qrcode/cardqrcode.do")
    public void createQrcode(String msg,HttpServletResponse response) throws IOException {
        qRcodeService.createQrcode(msg, response);
    }
}
