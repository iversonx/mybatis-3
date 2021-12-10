package com.iversonx.ibatis.mapper;

import com.iversonx.ibatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 **/
@Mapper
public interface UserMapper {
    int insertUser(User user);
    
    User getById(Long id);
}
