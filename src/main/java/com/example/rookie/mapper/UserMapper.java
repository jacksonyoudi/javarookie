package com.example.rookie.mapper;

import com.example.rookie.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



/**
 * UserMapper class
 *
 * @author changyou.liang
 * @date 2016/10/31
 */
@Mapper
public interface UserMapper {

    /**
     * fetch user by name
     *
     * @param name
     * @return User
     */
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    /**
     * fetch user by id
     *
     * @param id
     * @return User
     */
    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User findById(@Param("id") Integer id);


    /**
     * insert user info to table
     *
     * @param name
     * @param age
     * @return User
     */
    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}