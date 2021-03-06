/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MemberList;
import persistence.FileManagement;

/**
 *
 * @author 1795545
 */
public class ShowConfirmationList extends javax.swing.JFrame {

    /**
     * Creates new form ShowConfirmationList
     */
    ArrayList<String> list = null;

    //Constructor populating table with existing filenames
    public ShowConfirmationList() {
        initComponents();

        Object[] rowData = new Object[2];
        list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) jtblShow.getModel();
        FileManagement.readFile("confirmedFile.txt", true, list);

        for (String s : list) {
            String[] parts = s.split("_");
            rowData[0] = parts[0];
            rowData[1] = parts[1];
            model.addRow(rowData);
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblShow = new javax.swing.JTable();
        jbtnShow = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();
        jbtDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Show Confirmed List");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "User"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblShow);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbtnShow.setText("Show");
        jbtnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnShowActionPerformed(evt);
            }
        });

        jbtnCancel.setText("Cancel");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });

        jbtDelete.setText("Delete");
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jbtnShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtDelete)
                .addGap(31, 31, 31)
                .addComponent(jbtnCancel)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnShow)
                    .addComponent(jbtnCancel)
                    .addComponent(jbtDelete))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Show button, opens de selected date to work with the delivery
    private void jbtnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnShowActionPerformed
        String fileName;
        int row = -1;
        row = jtblShow.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "You needed to select one list", "Selection error", JOptionPane.ERROR_MESSAGE);
        } else {

            String select = list.get(row);
            String[] parts = select.split("_");
            String date = parts[0];
            String user = parts[1];
            fileName = "confirmations\\" + date + "_" + user + ".txt";

            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new BasketDeliveryManagement(fileName, date, user).setVisible(true);
                }
            });

            dispose();
        }
    }//GEN-LAST:event_jbtnShowActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnCancelActionPerformed
//Deleting selected confirmation list
    private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtblShow.getModel();
        String fileName;
        int row = -1;
        row = jtblShow.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "You needed to select one list", "Selection error", JOptionPane.ERROR_MESSAGE);
        } else {
            String select = list.get(row);
            String[] parts = select.split("_");
            String date = parts[0];
            String user = parts[1];
            fileName = "confirmations\\" + date + "_" + user + ".txt";
            File file = new File(fileName);
            file.delete();
            model.removeRow(row);
            FileManagement.updateCFile();
        }
    }//GEN-LAST:event_jbtDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
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
//            java.util.logging.Logger.getLogger(ShowConfirmationList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShowConfirmationList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShowConfirmationList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShowConfirmationList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowConfirmationList().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JButton jbtnShow;
    private javax.swing.JTable jtblShow;
    // End of variables declaration//GEN-END:variables
}
