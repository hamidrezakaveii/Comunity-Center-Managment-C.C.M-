/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HAMIDREZA
 */
public class ConfirmationList extends ArrayList<Member> {
    //private ConfirmationList cl;
    private String date;
    private String user;

    public ConfirmationList(String date, String user) {
        this.date = date;
        this.user = user;

    }
    
    
    public void addMember(Member m){
        this.add(m);
    }
}
