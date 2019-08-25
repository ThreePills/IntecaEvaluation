package com.kacperwozniak.customer.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer", schema = "customer_sch")
public class Customer {
    @Id
    @Column(name = "creditID")
    private int creditId;
    @NotNull
    @Column(name = "FirstName")
    private String firstName;
    @NotNull
    @Column(name = "Surname")
    private String surname;
    @NotNull
    @Column(name = "Pesel")
    private String pesel;

    public Customer() {
    }

    public Customer(int creditId, String firstName, String surname, String pesel) {
        this.creditId = creditId;
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        if (creditId < 0)
            throw new IllegalArgumentException("CreditID must be positive number");
        this.creditId = creditId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == "" || firstName == null){
            throw new IllegalArgumentException("Name can't be null or empty");
        }
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == "" || surname == null){
            throw new IllegalArgumentException("Surname can't be null or empty");
        }
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        if (pesel == null)
            throw new IllegalArgumentException("Pesel can't be null");
        if (pesel == "")
            throw new IllegalArgumentException("Pesel can't be empty");
        if (containsOnlyNumbers(pesel))
            this.pesel = pesel;
        if (pesel.length() != 11)
            throw new IllegalArgumentException("Pesel must be 11 numbers length");
    }
    //TODO Add method to check if string is number
    private boolean containsOnlyNumbers(String stringToCheck){
        return stringToCheck.matches("[0-9]+");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "creditId=" + creditId +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
