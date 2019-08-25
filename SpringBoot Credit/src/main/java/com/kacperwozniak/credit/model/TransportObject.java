package com.kacperwozniak.credit.model;

/**
 * Model class for transport informations about Credit, Customer and Product during createCustomers()
 */
public class TransportObject {
    private String firstName, surname,pesel, productName, creditName;
    private int value;

    public TransportObject(String firstName, String surname, String pesel, String productName, String creditName, int value) {
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
        this.productName = productName;
        this.creditName = creditName;
        this.value = value;
    }

    public TransportObject() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public String getProductName() {
        return productName;
    }

    public String getCreditName() {
        return creditName;
    }

    public int getValue() {
        return value;
    }

}
