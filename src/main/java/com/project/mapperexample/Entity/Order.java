package com.project.mapperexample.Entity;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;
    private String orderNumber;
    private Customer customer;
    private LocalDate orderDate;
    private List<Product> products;

    Order(Long id, String orderNumber, Customer customer, LocalDate orderDate, List<Product> products) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderDate = orderDate;
        this.products = products;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Order)) return false;
        final Order other = (Order) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderNumber = this.getOrderNumber();
        final Object other$orderNumber = other.getOrderNumber();
        if (this$orderNumber == null ? other$orderNumber != null : !this$orderNumber.equals(other$orderNumber))
            return false;
        final Object this$customer = this.getCustomer();
        final Object other$customer = other.getCustomer();
        if (this$customer == null ? other$customer != null : !this$customer.equals(other$customer)) return false;
        final Object this$orderDate = this.getOrderDate();
        final Object other$orderDate = other.getOrderDate();
        if (this$orderDate == null ? other$orderDate != null : !this$orderDate.equals(other$orderDate)) return false;
        final Object this$products = this.getProducts();
        final Object other$products = other.getProducts();
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Order;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $orderNumber = this.getOrderNumber();
        result = result * PRIME + ($orderNumber == null ? 43 : $orderNumber.hashCode());
        final Object $customer = this.getCustomer();
        result = result * PRIME + ($customer == null ? 43 : $customer.hashCode());
        final Object $orderDate = this.getOrderDate();
        result = result * PRIME + ($orderDate == null ? 43 : $orderDate.hashCode());
        final Object $products = this.getProducts();
        result = result * PRIME + ($products == null ? 43 : $products.hashCode());
        return result;
    }

    public String toString() {
        return "Order(id=" + this.getId() + ", orderNumber=" + this.getOrderNumber() + ", customer=" + this.getCustomer() + ", orderDate=" + this.getOrderDate() + ", products=" + this.getProducts() + ")";
    }

    public static class OrderBuilder {
        private Long id;
        private String orderNumber;
        private Customer customer;
        private LocalDate orderDate;
        private List<Product> products;

        OrderBuilder() {
        }

        public OrderBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public OrderBuilder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public OrderBuilder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public OrderBuilder orderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public OrderBuilder products(List<Product> products) {
            this.products = products;
            return this;
        }

        public Order build() {
            return new Order(this.id, this.orderNumber, this.customer, this.orderDate, this.products);
        }

        public String toString() {
            return "Order.OrderBuilder(id=" + this.id + ", orderNumber=" + this.orderNumber + ", customer=" + this.customer + ", orderDate=" + this.orderDate + ", products=" + this.products + ")";
        }
    }
}
