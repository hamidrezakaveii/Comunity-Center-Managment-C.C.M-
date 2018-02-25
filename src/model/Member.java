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
public class Member extends Person {
    private String registrationDate;
    private boolean choice;

    public Member(String fistName, String lastName, String birthdate, String address, String city, String postalCode, String telephone, String email, String registrationDate) {
        super(fistName, lastName, birthdate, address, city, postalCode, telephone, email);
        this.registrationDate = registrationDate;
        choice= false;
    }

    public boolean isChoice() {
        return choice;
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    @Override
    public String toString() {
        return this.getFistName()+";"+this.getLastName()+";"+this.getBirthdate()
                +";"+this.getAddress()+";"+this.getCity()+";"+this.getPostalCode()
                +";"+this.getTelephone()+";"+this.getEmail()+";"+this.getRegistrationDate();
    }




    
    
    
}
