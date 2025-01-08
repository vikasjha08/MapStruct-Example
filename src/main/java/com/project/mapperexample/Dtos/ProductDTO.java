package com.project.mapperexample.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {

    private String name;
    private String category;
    private List<String> tags;

}
