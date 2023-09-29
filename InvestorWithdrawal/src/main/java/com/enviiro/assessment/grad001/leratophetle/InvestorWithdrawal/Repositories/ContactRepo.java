package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepo extends JpaRepository<Contact,Long> {
    @Query(nativeQuery = true,value = "select from Contact where id=?1")
    List<Contact> findAllContactsByInvestorId(Long id);
}
