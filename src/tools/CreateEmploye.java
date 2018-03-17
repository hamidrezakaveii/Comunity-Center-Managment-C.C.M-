/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import model.Employe;
import model.Member;

/**
 *
 * @author HAMIDREZA
 */
public class CreateEmploye {
        
    public static Employe splitLine(String line){
        
        String string = line;
        String[] parts = string.split(";");
        String fName = parts[0];
        String lName = parts[1];
        String bDate = parts[2];
        String adress = parts[3];
        String city = parts[4];
        String pCode = parts[5];
        String telephone = parts[6];
        String email = parts[7];
        String hDate = parts[8];
        String uName = parts[9];
        String pass = parts[10];
        
        return new Employe(fName, lName, bDate, adress, city, pCode, telephone, email, hDate, uName, pass);
        
    }
}
