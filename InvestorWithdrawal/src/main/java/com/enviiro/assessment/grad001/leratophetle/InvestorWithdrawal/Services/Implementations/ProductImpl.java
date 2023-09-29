package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.Implementations;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Product;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories.ProductRepo;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements IProduct {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts(Long investorId) {
        return productRepo.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepo.saveAndFlush(product);
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepo.findById(productId).get();
    }
}
