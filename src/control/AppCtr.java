package control;

import java.util.ArrayList;
import model.Employe;
import model.EmployeList;
import model.Member;
import model.MemberList;
import persistence.FileManagement;
import tools.CreateEmploye;
import tools.CreateMember;
import tools.Utility;
import view.LoginPage;
import view.MainWindow;
import view.ShowConfirmationList;
//import view.BasketConfirmationSwing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1795928
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create member list object
        MemberList mList = new MemberList();
        ArrayList<String> listReadMember = new ArrayList<>();
        String memberList = "MemberList.txt";
        FileManagement.readFile(memberList, true, listReadMember);
        for(String s: listReadMember){
          mList.add(CreateMember.splitLine(s));
        };
        
        // Create employe list object
        EmployeList eList = new EmployeList();
        ArrayList<String> listReadEmploye = new ArrayList<>();
        String employeList = "EmployeList.txt";
        FileManagement.readFile(employeList, true, listReadEmploye);
        for(String s: listReadEmploye){
            Employe tmp = CreateEmploye.splitLine(s);
          eList.put(tmp.getUsername(),tmp);
        };
        
        //run LoginPage window
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage(mList, eList).setVisible(true);
            }
        });
        
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainWindow(mList, eList).setVisible(true);
//            }
//        });
        
        Utility.confirmedByFolder();

    }

}
