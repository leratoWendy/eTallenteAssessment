package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Controllers;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Product;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IInvestor;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
    @Autowired
    private IProduct product;
    @Autowired
    private IInvestor investor;

    @GetMapping("/getAllProducts/{id}")
    public ResponseEntity<List<Product>> getAllProducts(@PathVariable("id") Long id){
        if(investor.exists(id))
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(product.getAllProducts(id));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ArrayList<>());
    }

    @PostMapping("/addProduct/")
    public ResponseEntity<String> addProduct(@RequestBody Product prod){
        product.addProduct(prod);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Product has been added");
    }
}
