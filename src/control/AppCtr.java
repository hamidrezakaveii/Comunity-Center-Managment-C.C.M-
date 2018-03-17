package control;

import java.util.ArrayList;
import model.Member;
import model.MemberList;
import persistence.FileManagement;
import tools.CreateMember;
import tools.Utility;
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
        ArrayList<String> list = new ArrayList<>();
        String memberList = "MemberList.txt";
        FileManagement.readFile(memberList, true, list);
        for(String s: list){
          mList.add(CreateMember.splitLine(s));
        };

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow(mList).setVisible(true);
            }
        });
        
        Utility.confirmedByFolder();

    }

}
