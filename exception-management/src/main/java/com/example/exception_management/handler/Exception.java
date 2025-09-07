package com.example.exception_management.handler;

import java.sql.Date;

import lombok.Data;

@Data
public class Exception<E> {

    private String hostName;

    private String path;

    private Date createTime;

    private E message;
}
