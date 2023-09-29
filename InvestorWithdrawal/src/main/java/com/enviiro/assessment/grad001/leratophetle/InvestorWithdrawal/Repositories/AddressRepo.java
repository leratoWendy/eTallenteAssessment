package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
    @Query(nativeQuery = true,value = "select from Address where id=?1")
    List<Address> findAllByInvestorId(Long id);
}
