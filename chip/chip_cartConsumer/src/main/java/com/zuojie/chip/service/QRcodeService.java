package com.zuojie.chip.service;

import javax.servlet.http.HttpServletResponse;

public interface QRcodeService {
    void createQrcode(String msg, HttpServletResponse response);
}
