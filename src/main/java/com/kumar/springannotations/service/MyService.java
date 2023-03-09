package com.kumar.springannotations.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public  String hello(){
        return "Hello services";
    }
}
