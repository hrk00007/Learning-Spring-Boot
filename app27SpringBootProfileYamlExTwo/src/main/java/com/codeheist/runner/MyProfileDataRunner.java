package com.codeheist.runner;

import com.codeheist.service.ExportService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyProfileDataRunner implements CommandLineRunner {

    @Autowired
    ExportService exportService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(this);
    }
}
