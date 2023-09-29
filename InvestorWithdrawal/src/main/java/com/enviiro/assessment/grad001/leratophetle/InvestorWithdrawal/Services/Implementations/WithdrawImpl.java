package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.Implementations;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Withdraw;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories.WithDrawRepo;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IWithdraw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WithdrawImpl implements IWithdraw {
    @Autowired
    private WithDrawRepo withDrawRepo;

    @Override
    public List<Withdraw> getAllNoticies(Long id) {
        return withDrawRepo.findAll();
    }

    @Override
    public Withdraw getNotice(Long InvestorId, Long NoticeId) {
        return withDrawRepo.getReferenceById(NoticeId);
    }

    @Override
    public void addNotice(Withdraw withdrawNotice) {
        withDrawRepo.save(withdrawNotice);
    }

    @Override
    public void updateNotice(Long id) {
       withDrawRepo.saveAndFlush(withDrawRepo.getReferenceById(id));
    }
}
