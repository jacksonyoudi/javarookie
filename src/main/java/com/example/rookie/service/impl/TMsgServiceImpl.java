package com.example.rookie.service.impl;

import com.example.rookie.entity.TMsg;
import com.example.rookie.mapper.TMsgMapper;
import com.example.rookie.service.TMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings({"ALL", "AlibabaClassNamingShouldBeCamel"})
@Service
public class TMsgServiceImpl implements TMsgService {
    @Autowired
    public TMsgMapper tMsgMapper;


    @Override
    public TMsg findById(Integer id) {
        return tMsgMapper.findByid(id);
    }
}
