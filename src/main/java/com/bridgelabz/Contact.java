package com.bridgelabz;

import java.util.Comparator;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    String phoneNo;
    String mailId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }


    @Override
    public String toString() {
        return
                "firstName= " + firstName +
                ", lastName= " + lastName +
                ", address= " + address +
                ", city= " + city +
                ", state= " + state +
                ", zip= " + zip +
                ", phoneNo= " + phoneNo +
                ", mailId= " + mailId ;
        }

}

