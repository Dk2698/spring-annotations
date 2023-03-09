package com.kumar.springannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String hello(){
        return "repository bean created";
    }
}
