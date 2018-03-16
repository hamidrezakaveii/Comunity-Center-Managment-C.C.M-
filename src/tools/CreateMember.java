/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import model.Member;

/**
 *
 * @author HAMIDREZA
 */
public class CreateMember {
        
    public static Member splitLine(String line){
        
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
        String rDate = parts[8];
        Boolean choice = Boolean.getBoolean(parts[9]);
        
        return new Member(fName, lName, bDate, adress, city, pCode, telephone, email, rDate, choice);
        
    }
}
