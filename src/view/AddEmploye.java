/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Employe;
import model.EmployeList;
import persistence.FileManagement;

/**
 *
 * @author 1795928
 */
public class AddEmploye extends javax.swing.JFrame {

    /**
     * Creates new form AddMember
     */
    private EmployeList el;
    private Employe employe;
    private Employe eE;

    public AddEmploye(EmployeList el) {
        initComponents();
        this.el = el;
    }

    //Constructor for when editing member from member list
    public AddEmploye(Employe e, EmployeList el) {
        this.eE = e;
        this.el = el;
        initComponents();
        jbtnAddEmployee.setText("Save");
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit employe information"));
        this.jtxtFirstName.setText(e.getFistName());
        this.jtxtLastName.setText(e.getLastName());
        try {
            this.jBDate.setDate((new SimpleDateFormat("yyyy-MM-dd").parse(e.getBirthdate())));
        } catch (ParseException ex) {
            Logger.getLogger(AddEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jtxtAddress.setText(e.getAddress());
        this.jtxtCity.setText(e.getCity());
        this.jtxtPostalCode.setText(e.getPostalCode());
        this.jtxtTelephone.setText(e.getTelephone());
        this.jtxtEmail.setText(e.getEmail());
        try {
            this.jHDate.setDate((new SimpleDateFormat("yyyy-MM-dd").parse(e.getHireDate())));
        } catch (ParseException ex) {
            Logger.getLogger(AddEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jtxtUsername.setText(e.getUsername());
        this.jtxtUsername.setEditable(false);
        this.jtxtPassword.setText(e.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtFirstName = new javax.swing.JTextField();
        jtxtLastName = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtCity = new javax.swing.JTextField();
        jtxtPostalCode = new javax.swing.JTextField();
        jtxtTelephone = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBDate = new com.toedter.calendar.JDateChooser();
        jHDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JTextField();
        jbtnAddEmployee = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Employee");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Member"));

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("Birth Date:");

        jLabel4.setText("Address:");

        jLabel5.setText("City:");

        jLabel6.setText("Postal Code");

        jLabel7.setText("Telephone:");

        jLabel8.setText("E-mail:");

        jtxtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFirstNameActionPerformed(evt);
            }
        });

        jLabel9.setText("Hire Date:");

        jLabel10.setText("User name:");

        jtxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsernameActionPerformed(evt);
            }
        });

        jLabel11.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtFirstName)
                    .addComponent(jtxtLastName)
                    .addComponent(jtxtAddress)
                    .addComponent(jtxtCity)
                    .addComponent(jtxtPostalCode)
                    .addComponent(jtxtTelephone)
                    .addComponent(jtxtEmail)
                    .addComponent(jBDate, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jHDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtUsername)
                    .addComponent(jtxtPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jBDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtxtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtxtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jHDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnAddEmployee.setText("Add Employee");
        jbtnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddEmployeeActionPerformed(evt);
            }
        });

        jbtnCancel.setText("Cancel");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jbtnAddEmployee)
                .addGap(53, 53, 53)
                .addComponent(jbtnCancel)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancel)
                    .addComponent(jbtnAddEmployee))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFirstNameActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnCancelActionPerformed

    private void jbtnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddEmployeeActionPerformed

        //Create date formatter and instantiate birthDate and hireDate
        String birthDate = "";
        String hireDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthDate = sdf.format(jBDate.getCalendar().getTime());
            hireDate = sdf.format(jHDate.getCalendar().getTime());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "The Birth date and/or Hire date could not be empty!", "Add member", JOptionPane.INFORMATION_MESSAGE);

        }

        //instantiate the AddEmploye form attributes
        String fName = jtxtFirstName.getText();
        String lName = jtxtLastName.getText();
        String bDate = birthDate;
        String address = jtxtAddress.getText();
        String city = jtxtCity.getText();
        String pCode = jtxtPostalCode.getText();
        String telephone = jtxtTelephone.getText();
        String email = jtxtEmail.getText();
        String hDate = hireDate;
        String uName = jtxtUsername.getText();
        String pass = jtxtPassword.getText();
        if (jtxtFirstName.getText().isEmpty() || jtxtLastName.getText().isEmpty()
                || jtxtAddress.getText().isEmpty() || jtxtCity.getText().isEmpty()
                || jtxtPostalCode.getText().isEmpty() || jtxtTelephone.getText().isEmpty()
                || jtxtEmail.getText().isEmpty() || jtxtUsername.getText().isEmpty()
                || jtxtPassword.getText().isEmpty() || birthDate == "" || hireDate == "") {
            JOptionPane.showMessageDialog(null, "All fields must be fulfilled!", "Add member", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //check if needs to add new employe or modify the exsisting employe
            if (eE == null) {
                //check if the user name already exists in the system
                employe = el.get(uName);
                if (employe != null) {
                    JOptionPane.showMessageDialog(null, "Another user already exists in the system with the same user name!", "Add employe", JOptionPane.ERROR_MESSAGE);
                } else {
                    employe = new Employe(fName, lName, bDate, address, city, pCode, telephone, email, hDate, uName, pass);
                    //add employe inside the HashMap employe list
                    el.put(uName, employe);
                    //write new member in text file
                    FileManagement.writeFile("EmployeList.txt", employe.toString(), true);
                    //show message for add new user 
                    JOptionPane.showMessageDialog(null, "New employe added successfully!", "Add employe", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            //modify the existing employe    
            } else {
                File file = new File("EmployeList.txt");
                eE.setFistName(fName);
                eE.setLastName(lName);
                eE.setBirthdate(bDate);
                eE.setAddress(address);
                eE.setCity(city);
                eE.setPostalCode(pCode);
                eE.setTelephone(telephone);
                eE.setEmail(email);
                eE.setHireDate(hDate);
                eE.setUsername(uName);
                eE.setPassword(pass);
                file.delete();
                for (String s : el.keySet()) {
                    FileManagement.writeFile("EmployeList.txt", el.get(s).toString(), true);
                }
                JOptionPane.showMessageDialog(null, eE.getFistName() + "'s informations changed", "Employe Data", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
            
        }
    }//GEN-LAST:event_jbtnAddEmployeeActionPerformed

    private void jtxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsernameActionPerformed

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
//                new AddEmploye().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jBDate;
    private com.toedter.calendar.JDateChooser jHDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnAddEmployee;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtCity;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtLastName;
    private javax.swing.JTextField jtxtPassword;
    private javax.swing.JTextField jtxtPostalCode;
    private javax.swing.JTextField jtxtTelephone;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables
}
