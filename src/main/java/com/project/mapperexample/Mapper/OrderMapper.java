package com.project.mapperexample.Mapper;

import com.project.mapperexample.Dtos.OrderDTO;
import com.project.mapperexample.Dtos.ProductDTO;
import com.project.mapperexample.Entity.Order;
import com.project.mapperexample.Entity.Product;
import com.project.mapperexample.Entity.ProductCategory;
import com.project.mapperexample.Entity.Tag;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Collections;
import java.util.List;

@Mapper(builder = @Builder(disableBuilder = true), componentModel = "spring", imports = java.time.format.DateTimeFormatter.class)
public interface OrderMapper {


    @Mapping(source="order.orderNumber", target="orderNumber")
    @Mapping(source = "order.customer.name", target = "customerName")
    @Mapping(source = "order.customer.email",target = "customerEmail")
    @Mapping(expression = "java(order.getOrderDate().format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy\")))", target = "formattedDate")
    @Mapping(source = "order.products", target = "products")
    OrderDTO toOrderDto(Order order);


    @Mapping(source = "product.name", target = "name")
    @Mapping(source = "product.category", target = "category", qualifiedByName = "categoryToString")
    @Mapping(source = "product.tags", target = "tags", qualifiedByName = "tagsToString" )
    ProductDTO toProductDto(Product product);

    @Named("categoryToString")
    default String categoryToString(ProductCategory category){
        return category!=null?category.name().toLowerCase():null;
    }

    @Named("tagsToString")
    default List<String> tagsToString(List<Tag> tags){
        return tags!=null ? tags.stream().map(Tag::getName).toList() : Collections.emptyList();
    }


}
