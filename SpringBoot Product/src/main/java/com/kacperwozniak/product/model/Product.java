package com.kacperwozniak.product.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product", schema = "product_sch")
public class Product {
    @Id
    @PrimaryKeyJoinColumn(name = "CreditId")
    private int creditId;

    @NotNull
    @Column(name = "Value")
    private int value;

    @NotNull
    @Column(name = "productName")
    private String productName;

    public Product() {
    }

    public Product(int creditId, int value, String productName) {
        this.creditId = creditId;
        this.value = value;
        this.productName = productName;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        if (creditId < 0)
            throw new IllegalArgumentException("CreditID must be positive number");
        this.creditId = creditId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value <= 0){
            throw new IllegalArgumentException("Value must be >=0");
        }
        this.value = value;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == ""){
            throw new IllegalArgumentException("ProductName can't be empty");
        }
        if (productName == null){
            throw new IllegalArgumentException("ProductName can't be empty");
        }
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "creditId=" + creditId +
                ", value=" + value +
                ", productName='" + productName + '\'' +
                '}';
    }
}
