package com.ironhack.Homework3.models;

import com.sun.xml.bind.annotation.OverrideAnnotationOf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Contact extends Lead{

    @OneToMany (targetEntity=Contact.class, mappedBy="id", fetch=FetchType.LAZY)
    private List<Contact> contactList;

    @ManyToOne
    @JoinColumn(name = "id_company")
    private Company company;

    public Contact(String name, Company company, String email, String phoneNumber) {
      setEmail(email);
      setName(name);
      setPhoneNumber(phoneNumber);
      setCompany(company);
    }
}

