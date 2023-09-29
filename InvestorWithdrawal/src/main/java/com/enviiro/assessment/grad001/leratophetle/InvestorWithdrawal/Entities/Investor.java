package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Entities;

import javax.persistence.*;

@Table
@Entity
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String Name;
    @Column
    private String Surname;
    @Column
    private int Age;

    public Investor() {
    }

    public Investor(Long id, String name, String surname, int age) {
        Id = id;
        Name = name;
        Surname = surname;
        Age = age;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
