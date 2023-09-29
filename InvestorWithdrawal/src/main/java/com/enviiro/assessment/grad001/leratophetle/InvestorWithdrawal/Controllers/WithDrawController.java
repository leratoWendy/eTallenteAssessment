package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Controllers;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Product;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.ProductType;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Withdraw;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IInvestor;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IProduct;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IWithdraw;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Utils.WidthDrawalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "withdraw")
public class WithDrawController {
    @Autowired
    private IWithdraw _widthdraw;

    @Autowired
    private IProduct _product;

    @Autowired
    private IInvestor _investor;

    @PostMapping("giveNotice/{id}")
    public ResponseEntity<String> giveNotice(@PathVariable Long id, @RequestBody WidthDrawalDTO widthDrawalDTO){
        Withdraw withdraw = new Withdraw();
        Product prod = _product.getProduct(widthDrawalDTO.getProductId());

        if(prod.getProductType() == ProductType.RETIREMENT){
            if(prod.getInvestor().getAge() > 65){
                if(widthDrawalDTO.getAmount() < prod.getBalance()){
                    if(widthDrawalDTO.getAmount() > (0.9 * prod.getBalance())){
                        withdraw.setWithdrawAmount(widthDrawalDTO.getAmount());
                        withdraw.setWithdrawName(widthDrawalDTO.getWithdrawlName());
                        withdraw.setProduct(prod);
                        _widthdraw.addNotice(withdraw);
                        return ResponseEntity.status(HttpStatus.OK).body("Withdraw notce has been added");
                    }else{
                        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Amount cannot be 90 % of the current balance");
                    }
                }else{
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Amount cannot be more than the current balance");
                }
            }else{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Age is less than 65");
            }
        }else{
            withdraw.setWithdrawAmount(widthDrawalDTO.getAmount());
            withdraw.setWithdrawName(widthDrawalDTO.getWithdrawlName());
            withdraw.setProduct(prod);
            _widthdraw.addNotice(withdraw);
        }

        return ResponseEntity.status(HttpStatus.OK).body("Withdraw notce has been added");

    }

}
