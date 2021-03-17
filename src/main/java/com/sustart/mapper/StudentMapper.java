package com.sustart.mapper;

import com.sustart.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String phoneNumber);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String phoneNumber);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}