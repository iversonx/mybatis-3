package com.iversonx.ibatis.mapper;

import com.iversonx.ibatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 **/
@Mapper
public interface UserMapper {
    int insertUser(User user);
    
    @Select("select id, account, sex, is_delete isDelete FROM user WHERE id = #{id}")
    User getById(Long id);
    
    @Select("select * FROM user LIMIT 10")
    List<User> listUser();
    
    default void show() {
        System.out.println("asdasdasdsa" + this.getClass());
    }
}
