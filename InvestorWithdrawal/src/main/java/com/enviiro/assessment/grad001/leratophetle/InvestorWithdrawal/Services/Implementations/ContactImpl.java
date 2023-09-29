package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.Implementations;

import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Address;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Contact;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Repositories.ContactRepo;
import com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Services.IContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactImpl implements IContact {
    @Autowired
    private ContactRepo contactRepo;

    @Override
    public List<Contact> getAllContact(Long id) {
        return contactRepo.findAllContactsByInvestorId(id);
    }

    @Override
    public void addContact(Contact contact) {
        contactRepo.save(contact);
    }

    @Override
    public Contact updateAddress(Contact contact) {
        contactRepo.saveAndFlush(contact);
        return contact;
    }
}
