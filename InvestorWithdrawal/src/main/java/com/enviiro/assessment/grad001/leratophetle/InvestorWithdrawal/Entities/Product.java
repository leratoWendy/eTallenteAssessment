package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities;

import javax.persistence.*;

@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ProductId;
    @Column
    private String ProductName;
    @Column
    private ProductType productType;
    @Column
    private double balance;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "Id")
    private Investor investor;

    public Product() {
    }

    public Product(Long id, String productName, ProductType productType, double balance, Investor investor) {
        ProductId = id;
        ProductName = productName;
        this.productType = productType;
        this.balance = balance;
        this.investor = investor;
    }

    public Long getProductId() {
        return ProductId;
    }

    public void setProductId(Long id) {
        ProductId = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }
}

