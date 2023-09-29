package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities;

import javax.persistence.*;

@Table
@Entity
public class Withdraw {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String WithdrawName;
    @Column
    private boolean status;
    @OneToOne
    private Product product;
    @Column
    private double WithdrawAmount;

    public Withdraw() {
    }

    public Withdraw(Long id, String withdrawName,boolean status, Product product, double withdrawAmount) {
        Id = id;
        WithdrawName = withdrawName;
        this.status = status;
        this.product = product;
        WithdrawAmount = withdrawAmount;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getWithdrawName() {
        return WithdrawName;
    }

    public void setWithdrawName(String withdrawName) {
        WithdrawName = withdrawName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getWithdrawAmount() {
        return WithdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        WithdrawAmount = withdrawAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
