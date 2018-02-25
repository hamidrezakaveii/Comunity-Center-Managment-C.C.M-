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

    public Employe(String hireDate, String username, String password, String fistName, String lastName, String birthdate, String address, String city, String postalCode, String telephone, String email) {
        super(fistName, lastName, birthdate, address, city, postalCode, telephone, email);
        this.hireDate = hireDate;
        this.username = username;
        this.password = password;
    }




    
    
}
