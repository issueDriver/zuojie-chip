package com.zuojie.chip.dao;

import com.zuojie.chip.dto.CardDto;
import com.zuojie.chip.entity.Card;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * author:zuojie
 */
public interface CardDao {
    /**
     * 查询
     * @param phone
     * @return
     */
    @Select("select * from t_card where phone=#{phone}")
    Card selectByPhone(String phone);

    /**
     * 新增
     * @param dto
     * @return
     */
    @Insert("insert into t_card(name,email,info,phone,address,position,blogurl,ctime,flag) values(#{name},#{email},#{info},#{phone},#{address},#{position},#{blogurl},now(),1)")
    int insert(CardDto dto);

    /**
     * 查询全部
     * @return
     */
    @Select("select * from t_card order by ctime desc")
    List<Card> selectAll();
}
