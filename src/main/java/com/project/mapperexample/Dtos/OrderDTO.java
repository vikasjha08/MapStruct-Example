package com.project.mapperexample.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {

    private String orderNumber;
    private String customerName;
    private String customerEmail;
    private String formattedDate;
    private List<ProductDTO> products;
}
