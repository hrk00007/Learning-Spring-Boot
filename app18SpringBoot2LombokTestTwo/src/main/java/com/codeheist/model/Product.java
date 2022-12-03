package com.codeheist.model;

import lombok.*;

@ToString
@RequiredArgsConstructor
public class Product {
    @NonNull
    private Integer pid;
    private String  pcode;
}
/*
Lombok Generated

   public Product(Integer pid){
    super();
     this.pid=pid;
  }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pcode='" + pcode + '\'' +
                '}';
    }
 */