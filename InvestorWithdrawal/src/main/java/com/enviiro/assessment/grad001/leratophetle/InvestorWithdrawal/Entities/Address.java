package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities;

import javax.persistence.*;

@Table
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AddressId;
    @Column
    private int houseNumber;
    @Column
    private String streetName;
    @Column
    private String surburb;
    @Column
    private String city;
    @Column
    private int PostalCode;
    @Column
    private String Country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id")
    private Investor Investor;

    public Address() {
    }

    public Address(Long id, int houseNumber, String streetName, String surburb, String city, int postalCode, String country, com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor investor) {
        AddressId = id;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.surburb = surburb;
        this.city = city;
        PostalCode = postalCode;
        Country = country;
        Investor = investor;
    }

    public Long getAddressId() {
        return AddressId;
    }

    public void setAddressId(Long id) {
        AddressId = id;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getSurburb() {
        return surburb;
    }

    public void setSurburb(String surburb) {
        this.surburb = surburb;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor getInvestor() {
        return Investor;
    }

    public void setInvestor(com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities.Investor investor) {
        Investor = investor;
    }
}
