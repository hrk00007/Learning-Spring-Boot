package com.codeheist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cob")
class Customer{
    @Value("33")
    private int cid;
    @Value("ABC")
    private String code;

    public void printData(){
        System.out.println(cid+" "+code);
    }
}
