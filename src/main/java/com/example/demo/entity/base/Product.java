package com.example.demo.entity.base;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {
    private int id;
    private String name;
    private String slug;
    private String thumbnail;
    private String description;
    private int status;
}
