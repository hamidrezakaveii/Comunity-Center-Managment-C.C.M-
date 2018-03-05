package control;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.SwingUtilities;
import model.ConfirmationList;
import model.MemberList;
import persistence.FileManagement;
import view.AddMember;
import view.BasketConfirmation;
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
//        String memberList = "MemberList.txt";
//        ManipulationFichier.lireFichier(fichierInput);
//        
//        String FichierOutput = "dataout.txt";
//        String ligne = "La sortie est aussi facile que l`entreé!";
//        ManipulationFichier.ecrireFichier(FichierOutput, ligne);

//        String fichierInput2 = "datain.txt";
//        ManipulationFichier.lireFichier(memberList, true);

//        String FichierOutput = "dataout2.txt";
//        String data = "La sortie est aussi facile que l`entreé!";
//        FileManagement.writeFile(memberList, data, true);
        
        // Create member list object
        MemberList mList = new MemberList();
        String memberList = "MemberList.txt";
        FileManagement.readFile(memberList, true, mList);
        
        //create Confirmation list object
  //      ConfirmationList cList = new ConfirmationList();
        
//        MemberList addlist = new MemberList();


//add member main()
//                /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddMember(list).setVisible(true);
//            }
//        });

//confirmation list main()
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BasketConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasketConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasketConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasketConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasketConfirmation(mList).setVisible(true);
            }
        });

//        SwingUtilities.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                BasketConfirmationSwing frame = new BasketConfirmationSwing(mList, cList);
//                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//                frame.pack();
//                frame.setLocation(150, 150);
//                frame.setVisible(true);
//            }
//        });
        
        //thus is for github commit test





    }

}
