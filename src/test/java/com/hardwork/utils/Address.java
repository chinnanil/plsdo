package com.hardwork.utils;

public class Address {
    private String fName,lName,streetAddress,townOrCity,emailAddress;
    private String zipCode;
    public Address(){};
    public Address(String fName,String lName,String streetAddress,String townOrCity,String zipCode,String emailAddress){
            this.fName=fName;
            this.lName=lName;
            this.streetAddress=streetAddress;
            this.townOrCity=townOrCity;
            this.zipCode=zipCode;
            this.emailAddress=emailAddress;
    }
    public String getfName() {
        return fName;
    }
    public Address setfName(String fName) {
        this.fName = fName;
        return this;
    }
    public String getlName() {
        return lName;
    }
    public Address setlName(String lName) {
        this.lName = lName;
        return this;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public Address setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }
    public String getTownOrCity() {
        return townOrCity;
    }
    public Address setTownOrCity(String townOrCity) {
        this.townOrCity = townOrCity;
        return this;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public Address setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getZipCode() {
        return zipCode;
    }
    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
}
