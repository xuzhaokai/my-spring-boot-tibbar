package com.shp.mytibbar.mapper;

import com.shp.mytibbar.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    User findByName(@Param("name") String name);

    User insert(@Param("username") String username, @Param("password") String password);

    List<User> getAllUsers();
}