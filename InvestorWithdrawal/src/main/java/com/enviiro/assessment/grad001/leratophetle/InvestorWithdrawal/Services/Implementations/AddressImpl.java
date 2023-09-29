package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.Implementations;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Address;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories.AddressRepo;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements IAddress {
    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> getAllAddresses(Long id) {
        return addressRepo.findAllByInvestorId(id);
    }

    @Override
    public void addAdrress(Address address) {
        addressRepo.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        addressRepo.saveAndFlush(address);
        return address;
    }
}
