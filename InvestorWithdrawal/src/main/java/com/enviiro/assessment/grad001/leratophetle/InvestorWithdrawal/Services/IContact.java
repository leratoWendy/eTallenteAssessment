package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Address;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Contact;

import java.util.List;

public interface IContact {
    public List<Contact> getAllContact(Long id);
    public void addContact(Contact contact);
    public Contact updateAddress(Contact contact);
}
