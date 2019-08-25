package com.kacperwozniak.credit.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Credit entity class
 */
@Entity
@Table(name = "credit", schema = "credit_sch")
public class Credit {

    @Id
    @Column
    private int creditId;

    @NotNull
    @Column(name = "CreditName")
    private String creditName;

    @Transient
    private Customer customer;
    @Transient
    private Product product;

    public Credit() {
    }

    public Credit(int creditId, String creditName) {
        this.creditId = creditId;
        this.creditName = creditName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        if (creditId < 0)
            throw new IllegalArgumentException("Credit ID must be a positive number!");
        this.creditId = creditId;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "creditID=" + creditId +
                ", creditName='" + creditName + '\'' +
                '}';
    }
}
