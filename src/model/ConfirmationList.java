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
public class ConfirmationList extends List {
    //private ConfirmationList cl;
    private String date;
    private String user;

    public ConfirmationList(String date, String user) {
        this.date = date;
        this.user = user;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
