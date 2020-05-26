package com.example.rookie.mapper;


import org.apache.ibatis.annotations.Mapper;
import com.example.rookie.entity.TMsg;

@Mapper
public interface TMsgMapper {
    public TMsg findByid(Integer id);
}
