package com.codeheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2AnnotationExTwoApplication {

    public static void main(String[] args) {

        ApplicationContext ac=SpringApplication.run(SpringBoot2AnnotationExTwoApplication.class, args);
        Customer cob=ac.getBean("cob",Customer.class);
        cob.printData();
    }

}
