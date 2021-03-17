package com.sustart.mapper;

import com.sustart.model.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(String shopId);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String shopId);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}