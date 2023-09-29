package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.Implementations;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories.InvestorRepo;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IInvestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorImpl implements IInvestor {
    private InvestorRepo investorRepo;

    @Autowired
    public InvestorImpl(InvestorRepo investorRepo) {
        this.investorRepo = investorRepo;
    }

    @Override
    public List<Investor> getAllInvestors() {
        return investorRepo.findAll();
    }

    @Override
    public void addInvestor(Investor investor) {
        investorRepo.save(investor);
    }

    @Override
    public void deleteInvestor(Long id) {
        investorRepo.deleteById(id);
    }

    @Override
    public void updateInvestor(Investor investor) {
        investorRepo.saveAndFlush(investor);
    }

    @Override
    public boolean exists(Long id) {
        return investorRepo.existsById(id);
    }

    @Override
    public Investor getInvestor(Long id) {
        return investorRepo.findById(id).get();
    }
}
