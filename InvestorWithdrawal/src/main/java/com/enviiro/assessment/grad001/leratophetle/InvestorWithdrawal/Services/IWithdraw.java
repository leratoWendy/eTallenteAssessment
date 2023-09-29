package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Withdraw;

import java.util.List;

public interface IWithdraw {
    public List<Withdraw> getAllNoticies(Long id);
    public Withdraw getNotice(Long InvestorId,Long NoticeId);
    public void addNotice(Withdraw withdrawNotice);
    public void updateNotice(Long id);
}
