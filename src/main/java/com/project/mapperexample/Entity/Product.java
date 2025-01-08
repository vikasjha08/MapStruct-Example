package com.project.mapperexample.Entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private ProductCategory category;
    private List<Tag> tags;
}
