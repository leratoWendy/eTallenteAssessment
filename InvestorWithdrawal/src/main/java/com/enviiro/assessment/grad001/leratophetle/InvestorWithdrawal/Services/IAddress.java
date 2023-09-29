package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Address;

import java.util.List;

public interface IAddress {
    public List<Address> getAllAddresses(Long id);
    public void addAdrress(Address address);
    public Address updateAddress(Address address);
}
