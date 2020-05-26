package com.example.rookie.controller;

import com.example.rookie.entity.TMsg;
import com.example.rookie.service.TMsgService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class TMsgController {
    @Autowired
    private TMsgService tMsgService;

    @GetMapping("/getMsg")
    public String getMsg(@RequestParam("id") Integer id) {
        TMsg tMsg = tMsgService.findById(id);
        return tMsg.getMessage();

    }

    @GetMapping("/info")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
