package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities;

import javax.persistence.*;

@Table
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ContactId;
    @Column
    private String email;
    @Column
    private String mobileNumber;
    @Column
    private String telephoneNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id")
    private Investor Investor;

    public Contact() {
    }

    public Contact(Long id, String email, String mobileNumber, String telephoneNumber, com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor investor) {
        ContactId = id;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.telephoneNumber = telephoneNumber;
        Investor = investor;
    }

    public Long getId() {
        return ContactId;
    }

    public void setId(Long id) {
        ContactId = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor getInvestor() {
        return Investor;
    }

    public void setInvestor(com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor investor) {
        Investor = investor;
    }
}
