/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Member;
import model.MemberList;
//import model.MembersTableModel;
import persistence.FileManagement;


/**
 *
 * @author jvict
 */
public class MembersInfo extends javax.swing.JFrame {

    private MemberList ml;
//Testing custom table model
//    private MembersTableModel tableModel = new MembersTableModel();

    /**
     * Creates new form MemberManagement
     */
    public MembersInfo(MemberList ml) {
        initComponents();
        this.ml = ml;
        DefaultTableModel tbModel = (DefaultTableModel) jtMl.getModel();
        //Filling the table with members information
        Object rowData[] = new Object[3];
        for (Member m : ml) {
            rowData[0] = m.getFistName() + " " + m.getLastName();
            rowData[1] = m.getTelephone();
            //Seting third column as false as if we don't do that the value of the box is going to be null
            rowData[2] = false;
            tbModel.addRow(rowData);
        }
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
        jtMl = new javax.swing.JTable();
        jbAddMember = new javax.swing.JButton();
        jbDeleteMembers = new javax.swing.JButton();
        jbMainMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Members List");
        setResizable(false);

        jtMl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Telephone", "Remove Member"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMlMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMl);

        jbAddMember.setText("Add New Member");
        jbAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddMemberActionPerformed(evt);
            }
        });

        jbDeleteMembers.setText("Delete Selected Members");
        jbDeleteMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteMembersActionPerformed(evt);
            }
        });

        jbMainMenu.setText("Main Menu");
        jbMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMainMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Edit Member: Double Click to edit selected member informations");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Delete Member: Select member(s) and click Delete Selected Members bellow");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jbAddMember)
                                .addGap(57, 57, 57)
                                .addComponent(jbDeleteMembers)
                                .addGap(64, 64, 64)
                                .addComponent(jbMainMenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDeleteMembers)
                    .addComponent(jbMainMenu)
                    .addComponent(jbAddMember))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddMemberActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddManagement(ml).setVisible(true);
            }
        });
    }//GEN-LAST:event_jbAddMemberActionPerformed

    private void jbDeleteMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteMembersActionPerformed
        DefaultTableModel dtmTable = (DefaultTableModel) jtMl.getModel();
        //Getting selected members and deleting then
        for (int i = 0; i < dtmTable.getRowCount(); i++) {
            Boolean checked = (Boolean) dtmTable.getValueAt(i, 2);
            if (checked != null && checked) {
                dtmTable.removeRow(i);
                ml.remove(i);
                File file = new File("MemberList.txt");
                //Deleting file to create new MemberList
                file.delete();
                for (Member m : ml) {
                    FileManagement.writeFile("MemberList.txt", m.toString(), true);
                }
                i--;
            }
        }


    }//GEN-LAST:event_jbDeleteMembersActionPerformed

    private void jtMlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMlMouseClicked
        //Open member to edit when double click
        if (evt.getClickCount() == 2) {
            JTable target = (JTable) evt.getSource();
            //int row = target.getSelectedRow();
            //int column = target.getSelectedColumn();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new AddManagement(ml.get(target.getSelectedRow()), ml).setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_jtMlMouseClicked

    private void jbMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMainMenuActionPerformed
                dispose();
    }//GEN-LAST:event_jbMainMenuActionPerformed

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
//            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MemberManagement().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAddMember;
    private javax.swing.JButton jbDeleteMembers;
    private javax.swing.JButton jbMainMenu;
    private javax.swing.JTable jtMl;
    // End of variables declaration//GEN-END:variables
}
