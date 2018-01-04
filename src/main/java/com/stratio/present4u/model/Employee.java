package com.stratio.present4u.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "customers")
public class Employee {

    @Id
    @NotNull
    @ApiParam(required = true)
    private Long customerid;

    private String firstname;
    private String lastname1;
    private String lastname2;
    private String vatnumber;//DNI
    private String gender;
    private String pmastore;
    private String nationality;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Card> cards = new ArrayList<>();


    @OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customerinvoices_id")
    private List<CustomerInvoice> customerInvoices = new ArrayList<>();

    public Employee() {
    }

    public Employee(Long customerid, String firstname, String lastname1, String lastname2, String vatnumber, String gender, String pmastore, String nationality, List<Card> cards, List<CustomerInvoice> customerInvoices) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.vatnumber = vatnumber;
        this.gender = gender;
        this.pmastore = pmastore;
        this.nationality = nationality;
        this.cards = cards;
        this.customerInvoices = customerInvoices;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<CustomerInvoice> getCustomerInvoices() {
        return customerInvoices;
    }

    public void setCustomerInvoices(List<CustomerInvoice> customerInvoices) {
        this.customerInvoices = customerInvoices;
    }

    public void addCustomerInvoices(CustomerInvoice customerInvoice) {
        this.customerInvoices.add(customerInvoice);
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getVatnumber() {
        return vatnumber;
    }

    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPmastore() {
        return pmastore;
    }

    public void setPmastore(String pmastore) {
        this.pmastore = pmastore;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return String.format("Employee[id=%d, firstName='%s', lastName='%s']", customerid, firstname, lastname1);
    }


}

