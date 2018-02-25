/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author 1795928
 */
public abstract class Person {
    private String fistName;
    private String lastName;
    private String birthdate;
    private String address;
    private String city;
    private String postalCode;
    private String telephone;
    private String email;

    public Person(String fistName, String lastName, String birthdate, String address, String city, String postalCode, String telephone, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.telephone = telephone;
        this.email = email;
    }


    
    

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
