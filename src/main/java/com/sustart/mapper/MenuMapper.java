package com.sustart.mapper;

import com.sustart.model.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(String dishesId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String dishesId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}