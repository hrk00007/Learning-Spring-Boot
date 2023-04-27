package com.codeheist.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
@Profile("default")
public class PdfExportService implements  ExportService{

    private  String name;
    private String  format;

    @Override
    public void export() {
        System.out.println("From PDF");
        System.out.println(this);
    }
}
