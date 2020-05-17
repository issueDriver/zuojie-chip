package com.zuojie.chip.service.impl;


import com.zuojie.chip.service.QRcodeService;
import com.zuojie.chip.util.Base64Util;
import com.zuojie.chip.util.QRcodeUtil;
import org.springframework.stereotype.Service;


import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Service
public class QRcodeServiceImpl implements QRcodeService {
    @Override
    public void createQrcode(String msg, HttpServletResponse response) {
        //1.验证参数的合法性
        if(msg!=null && msg.length()>0) {
            //2.解码
            String str = Base64Util.base64UrlDec(msg);
            //3.生成二维码
            BufferedImage image= QRcodeUtil.createColor(str,500);
            try {
                ImageIO.write(image,"png",response.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
