package com.project.mapperexample.Dtos;

import java.util.List;

public class OrderDTO {

    private String orderNumber;
    private String customerName;
    private String customerEmail;
    private String formattedDate;
    private List<ProductDTO> products;

    public OrderDTO() {
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getFormattedDate() {
        return this.formattedDate;
    }

    public List<ProductDTO> getProducts() {
        return this.products;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderDTO)) return false;
        final OrderDTO other = (OrderDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderNumber = this.getOrderNumber();
        final Object other$orderNumber = other.getOrderNumber();
        if (this$orderNumber == null ? other$orderNumber != null : !this$orderNumber.equals(other$orderNumber))
            return false;
        final Object this$customerName = this.getCustomerName();
        final Object other$customerName = other.getCustomerName();
        if (this$customerName == null ? other$customerName != null : !this$customerName.equals(other$customerName))
            return false;
        final Object this$customerEmail = this.getCustomerEmail();
        final Object other$customerEmail = other.getCustomerEmail();
        if (this$customerEmail == null ? other$customerEmail != null : !this$customerEmail.equals(other$customerEmail))
            return false;
        final Object this$formattedDate = this.getFormattedDate();
        final Object other$formattedDate = other.getFormattedDate();
        if (this$formattedDate == null ? other$formattedDate != null : !this$formattedDate.equals(other$formattedDate))
            return false;
        final Object this$products = this.getProducts();
        final Object other$products = other.getProducts();
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderNumber = this.getOrderNumber();
        result = result * PRIME + ($orderNumber == null ? 43 : $orderNumber.hashCode());
        final Object $customerName = this.getCustomerName();
        result = result * PRIME + ($customerName == null ? 43 : $customerName.hashCode());
        final Object $customerEmail = this.getCustomerEmail();
        result = result * PRIME + ($customerEmail == null ? 43 : $customerEmail.hashCode());
        final Object $formattedDate = this.getFormattedDate();
        result = result * PRIME + ($formattedDate == null ? 43 : $formattedDate.hashCode());
        final Object $products = this.getProducts();
        result = result * PRIME + ($products == null ? 43 : $products.hashCode());
        return result;
    }

    public String toString() {
        return "OrderDTO(orderNumber=" + this.getOrderNumber() + ", customerName=" + this.getCustomerName() + ", customerEmail=" + this.getCustomerEmail() + ", formattedDate=" + this.getFormattedDate() + ", products=" + this.getProducts() + ")";
    }
}
