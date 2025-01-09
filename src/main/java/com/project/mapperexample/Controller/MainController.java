package com.project.mapperexample.Controller;

import com.project.mapperexample.Dtos.OrderDTO;
import com.project.mapperexample.Entity.*;
import com.project.mapperexample.Mapper.OrderMapperImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class MainController {

    @GetMapping("/order")
    public ResponseEntity<OrderDTO> getMappedResponse(){

        //Here I am creating dummy Entity for reference
        Order orderEntity = generateOrderEntity();

        return ResponseEntity.ok(new OrderMapperImpl().toOrderDto(orderEntity));
    }

    private Order generateOrderEntity() {

        return Order.builder()
                .id(1L)
                .orderNumber("123456789")
                .orderDate(LocalDate.parse("1997-08-29"))
                .products(generateProductEntity())
                .customer(Customer.builder().id(1L).name("Vikas").email("vikas@gmail.com").build())
                .build();
    }

    private List<Product> generateProductEntity() {
        return List.of(Product.builder()
                .id(1L)
                .name("LG-Refrigerator")
                .category(ProductCategory.ELECTRONICS)
                .tags(List.of(Tag.builder().name("LG").build()))
                .build());
    }


}
