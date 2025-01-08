package com.project.mapperexample.Entity;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;
    private String orderNumber;
    private Customer customer;
    private LocalDate orderDate;
    private List<Product> products;
}
