package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor;

import java.util.List;

public interface IInvestor {
    public List<Investor> getAllInvestors();
    public void addInvestor(Investor investor);
    public void deleteInvestor(Long id);
    public void updateInvestor(Investor investor);

    public boolean exists(Long id);

    Investor getInvestor(Long id);

}
