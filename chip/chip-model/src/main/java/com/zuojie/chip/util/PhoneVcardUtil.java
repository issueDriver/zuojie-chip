package com.zuojie.chip.util;


import com.zuojie.chip.dto.CardDto;
import com.zuojie.chip.entity.Card;

/**
 * author:zuojie
 */
public class PhoneVcardUtil {
    /**
     * 手机联系人的固定格式*/
    public static String createPV(CardDto dto){
        StringBuffer buffer=new StringBuffer();
        buffer.append("BEGIN:VCARD\n");
        buffer.append("NOTE:"+dto.getInfo()+"\n");
        buffer.append("N:"+dto.getName()+"\n");
        buffer.append("TITLE:"+dto.getPosition()+"\n");
        buffer.append("ADR:"+dto.getAddress()+"\n");
        buffer.append("EMAIL:"+dto.getEmail()+"\n");
        buffer.append("TEL:"+dto.getPhone()+"\n");
        buffer.append("URL:"+dto.getBlogurl()+"\n");
        buffer.append("END:VCARD\n");
        return buffer.toString();
    }
    /**
     * 手机联系人的固定格式*/
    public static String createPV(Card card){
        StringBuffer buffer=new StringBuffer();
        buffer.append("BEGIN:VCARD\n");
        buffer.append("NOTE:"+card.getInfo()+"\n");
        buffer.append("N:"+card.getName()+"\n");
        buffer.append("TITLE:"+card.getPosition()+"\n");
        buffer.append("ADR:"+card.getAddress()+"\n");
        buffer.append("EMAIL:"+card.getEmail()+"\n");
        buffer.append("TEL:"+card.getPhone()+"\n");
        buffer.append("URL:"+card.getBlogurl()+"\n");
        buffer.append("END:VCARD\n");
        return buffer.toString();
    }



}
