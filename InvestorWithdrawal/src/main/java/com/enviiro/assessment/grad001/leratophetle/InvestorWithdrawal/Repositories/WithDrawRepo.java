package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Withdraw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithDrawRepo extends JpaRepository<Withdraw,Long> {
}
