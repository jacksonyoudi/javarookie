package com.example.rookie.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TMsg implements Serializable {

    private Integer id;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
