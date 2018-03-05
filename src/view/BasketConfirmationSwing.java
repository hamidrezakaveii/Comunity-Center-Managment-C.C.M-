///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package view;
//
///**
// *
// * @author HAMIDREZA
// */
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//import javax.swing.event.TableModelEvent;
//import javax.swing.event.TableModelListener;
//import javax.swing.table.*;
//import model.ConfirmationList;
//import model.Member;
//import model.MemberList;
//
//public class BasketConfirmationSwing extends JFrame {
//
//    private String date;
//    private JLabel jlblDate;
//    private JLabel jlblUser;
//    private JTextField jtxtDate;
//    private JTextField jtxtUser;
//    private JTable table;
//    private JButton createButton;
//    private JButton cancelButton;
//    private JPanel mainPanel;
//    private JPanel northPanel;
//    private JPanel southPanel;
//    private JScrollPane scrollPane;
//
//    public BasketConfirmationSwing(MemberList ml, ConfirmationList cl) {
//
//        Object[] columnNames = {"Name", "Telephone", "Confirmation"};
//        Object rowData[] = new Object[3];
//
//        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//        table = new JTable(model) {
//
//            /*@Override
//            public Class getColumnClass(int column) {
//            return getValueAt(0, column).getClass();
//            }*/
//            @Override
//            public Class getColumnClass(int column) {
//                switch (column) {
//                    case 0:
//                        return String.class;
//                    case 1:
//                        return String.class;
//                    case 2:
//                        return Boolean.class;
//                    default:
//                        return String.class;
//                }
//            }
//        };
//        for (Member m : ml) {
//            rowData[0] = m.getFistName() + " " + m.getLastName();
//            rowData[1] = m.getTelephone();
//            rowData[2] = m.isChoice();
//            model.addRow(rowData);
//        }
//        model.addColumn(columnNames);
//
//        instantiate main panel
//        mainPanel = new JPanel(new BorderLayout());
//
//        instantiate scroll pane
//        scrollPane = new JScrollPane(table);
//
//        instantiate lables and textfields
//        jlblDate = new JLabel("Date: ");
//        jlblUser = new JLabel("User: ");
//        jtxtDate = new JTextField(10);
//        jtxtUser = new JTextField(15);
//
//        instantiate north panel
//        northPanel = new JPanel(new FlowLayout());
//
//        add labels and textfields to north panel
//        northPanel.add(jlblDate);
//        northPanel.add(jtxtDate);
//        northPanel.add(jlblUser);
//        northPanel.add(jtxtUser);
//
//        instantiate the buttoms
//        createButton = new JButton("Create confirm list");
//        cancelButton = new JButton("Cancel");
//
//        instantiate bottom panel
//        southPanel = new JPanel(new FlowLayout());
//
//        add buttons to bottom panel
//        southPanel.add(createButton);
//        southPanel.add(cancelButton);
//
//        add action listeners(anonymouse classes)
//        cancelButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                dispose();
//            }
//        }
//        );
//
//        createButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                for (int i = 0; i < table.getModel().getRowCount(); i++) {
//                    if((Boolean) table.getModel().getValueAt(i, 2)){
//                        ml.get(i).setChoice(true);
//                        cl.add(ml.get(i));
//                    }
//            }
//                
//                for(Member m: cl){
//                    System.out.println(m.getFistName()+" "+m.getLastName());
//                }
//
//            }
//        }
//        );
//
//
//
//        
//        mainPanel.add(northPanel, BorderLayout.NORTH);
//        mainPanel.add(scrollPane, BorderLayout.CENTER);
//        mainPanel.add(southPanel, BorderLayout.SOUTH);
//        getContentPane().add(mainPanel);
//
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                BasketConfirmationSwing frame = new BasketConfirmationSwing();
//                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//                frame.pack();
//                frame.setLocation(150, 150);
//                frame.setVisible(true);
//            }
//        });
//    }
//}
