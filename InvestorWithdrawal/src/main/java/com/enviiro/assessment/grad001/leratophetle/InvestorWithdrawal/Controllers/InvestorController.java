package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Controllers;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IInvestor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "investor")
public class InvestorController {
    @Autowired
    private IInvestor _invetstor;

    @GetMapping("/information/{id}")
    public ResponseEntity<Investor> getInformation(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(_invetstor.getInvestor(id));
    }

    @GetMapping("/add")
    public ResponseEntity<String> addInvestor(@RequestBody Investor investor){
        _invetstor.addInvestor(investor);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Investor added");
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<String> updateInvestor(@PathVariable Long id,@RequestBody Investor investor){
        _invetstor.updateInvestor(investor);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Investor updated");
    }

    @PatchMapping("/delete/{id}")
    public ResponseEntity<String> updateInvestor(@PathVariable Long id){
        _invetstor.deleteInvestor(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Investor deleted");
    }
}
