package com.sustart.mapper;

import com.sustart.model.PermissionRole;

public interface PermissionRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PermissionRole record);

    int insertSelective(PermissionRole record);

    PermissionRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PermissionRole record);

    int updateByPrimaryKey(PermissionRole record);
}