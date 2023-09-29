package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Product;

import java.util.List;

public interface IProduct {
    public List<Product> getAllProducts(Long investorId);
    public void addProduct(Product product);
    public void updateProduct(Product product);

    Product getProduct(Long productId);
}
