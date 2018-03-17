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
public class Employe extends Person {
    private String hireDate;
    private String username;
    private String password;

    public Employe(String fistName, String lastName, String birthdate, String address, String city, String postalCode, String telephone, String email, String hireDate, String username, String password) {
        super(fistName, lastName, birthdate, address, city, postalCode, telephone, email);
        this.hireDate = hireDate;
        this.username = username;
        this.password = password;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.getFistName()+";"+this.getLastName()+";"+this.getBirthdate()
                +";"+this.getAddress()+";"+this.getCity()+";"+this.getPostalCode()
                +";"+this.getTelephone()+";"+this.getEmail()+";"+this.getHireDate()
                +";"+this.getUsername()+";"+this.getPassword();
    }


    
    
}
