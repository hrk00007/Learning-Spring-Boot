package com.codeheist.runner;

import com.codeheist.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(989);
        System.out.println(product);
    }
}
