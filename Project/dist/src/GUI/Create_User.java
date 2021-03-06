package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Create_User extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private Main menu;
    private Users uzer;
    private String userPassword;

    public Create_User() {
        initComponents();
        loadEmpID();
    }

    public Create_User(Main mMenu, Users us) {
        this();
        this.menu = mMenu;
        this.uzer = us;
        menu.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        empID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        reTypePassword = new javax.swing.JPasswordField();
        btn_Cancel = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        admin = new javax.swing.JRadioButton();
        manager = new javax.swing.JRadioButton();
        cashier = new javax.swing.JRadioButton();
        dataEntry = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        empName = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        msg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 665, 40));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 73, 94));
        jLabel3.setText("New User");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 50));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit1.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 1, 28, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Employee ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, 30));

        empID.setEditable(true);
        empID.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        empID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -" }));
        empID.setFocusable(false);
        empID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDActionPerformed(evt);
            }
        });
        jPanel1.add(empID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 170, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("User Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 30));

        userName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameKeyTyped(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 220, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, 30));

        password.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 220, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Re-Type Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 225, 130, 30));

        reTypePassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        reTypePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reTypePasswordActionPerformed(evt);
            }
        });
        reTypePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reTypePasswordKeyReleased(evt);
            }
        });
        jPanel1.add(reTypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 225, 220, 30));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.setBorder(null);
        btn_Cancel.setBorderPainted(false);
        btn_Cancel.setContentAreaFilled(false);
        btn_Cancel.setFocusPainted(false);
        btn_Cancel.setOpaque(true);
        btn_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_CancelMouseReleased(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 100, 30));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add");
        btn_Add.setBorder(null);
        btn_Add.setBorderPainted(false);
        btn_Add.setContentAreaFilled(false);
        btn_Add.setFocusPainted(false);
        btn_Add.setOpaque(true);
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AddMouseReleased(evt);
            }
        });
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 100, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("User Role");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 80, 20));

        admin.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(admin);
        admin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        admin.setText("   Admin");
        admin.setBorder(null);
        admin.setContentAreaFilled(false);
        admin.setFocusPainted(false);
        admin.setFocusable(false);
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 110, -1));

        manager.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(manager);
        manager.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        manager.setText("   Manager");
        manager.setBorder(null);
        manager.setContentAreaFilled(false);
        manager.setFocusPainted(false);
        manager.setFocusable(false);
        jPanel1.add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 110, -1));

        cashier.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cashier);
        cashier.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cashier.setText("   Cashier");
        cashier.setBorder(null);
        cashier.setContentAreaFilled(false);
        cashier.setFocusPainted(false);
        cashier.setFocusable(false);
        jPanel1.add(cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 110, -1));

        dataEntry.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(dataEntry);
        dataEntry.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dataEntry.setText("   Data Entry");
        dataEntry.setBorder(null);
        dataEntry.setContentAreaFilled(false);
        dataEntry.setFocusPainted(false);
        dataEntry.setFocusable(false);
        jPanel1.add(dataEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 110, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 10, 190));

        empName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(empName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 390, 20));

        msg.setForeground(new java.awt.Color(255, 0, 0));
        msg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 162, 220, 15));

        msg2.setForeground(new java.awt.Color(255, 0, 0));
        msg2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(msg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 265, 220, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseEntered

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        btn_Cancel.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        btn_Cancel.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_CancelMousePressed

    private void btn_CancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseReleased
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseReleased

    private void btn_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseEntered
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseEntered

    private void btn_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseExited
        btn_Add.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddMouseExited

    private void btn_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMousePressed
        btn_Add.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddMousePressed

    private void btn_AddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseReleased
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseReleased

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        menu.setEnabled(true);
        uzer.loadUsers();
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void empIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDActionPerformed
        try {
            ResultSet rs = DB.search(" SELECT fname,lname FROM employee WHERE id_employee='" + empID.getSelectedItem().toString().trim() + "' ");
            if (rs.next()) {
                empName.setText(rs.getString(1) + " " + rs.getString(2));
            } else {
                empName.setText(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_empIDActionPerformed

    private void userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyTyped
        Validation.setLength(evt, userName.getText(), 10);

    }//GEN-LAST:event_userNameKeyTyped

    private void userNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyReleased
        try {
            ResultSet rs = DB.search("SELECT user_name FROM user WHERE user_name = '" + userName.getText() + "'");
            if (rs.next()) {
                msg.setText(" Already used this user name");
                userName.setForeground(Color.red);
            } else {
                userName.setForeground(Color.BLACK);
                msg.setText(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_userNameKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        String pw = new String(password.getPassword());
        if (pw.length() < 6) {
            password.setForeground(Color.red);
        } else {
            password.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_passwordKeyReleased

    private void reTypePasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reTypePasswordKeyReleased
        String pw = new String(password.getPassword());
        String pw2 = new String(reTypePassword.getPassword());
        if (pw2.equals(pw)) {
            msg2.setText(null);
            try {
                userPassword = pw2;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        } else {
            msg2.setText("Password Not Match");
            userPassword = null;
        }

    }//GEN-LAST:event_reTypePasswordKeyReleased

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        String pw = new String(password.getPassword());
        String pw2 = new String(reTypePassword.getPassword());

        if (empID.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Plaese Select employee", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (userName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the user name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (msg.getText() != null) {
                    JOptionPane.showMessageDialog(this, "Plaese enter a valid user name", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (pw.isEmpty() | pw2.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Plaese enter a password", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (pw.length() < 6) {
                            JOptionPane.showMessageDialog(this, "Password minimum length should be 6 charactors..", "Warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            if (!pw2.equals(pw)) {
                                JOptionPane.showMessageDialog(this, "Password does not match, try again", "Warning", JOptionPane.WARNING_MESSAGE);
                            } else {
                                if (admin.isSelected() | manager.isSelected() | cashier.isSelected() | dataEntry.isSelected()) {
                                    String user_type;
                                    if (admin.isSelected()) {
                                        user_type = "Admin";
                                    } else if (manager.isSelected()) {
                                        user_type = "Manager";
                                    } else if (cashier.isSelected()) {
                                        user_type = "Cashier";
                                    } else {
                                        user_type = "Data Entry";
                                    }
                                    try {
                                        DB.iud("INSERT INTO user (id_employee, user_name, password, user_type, state) VALUES('" + empID.getSelectedItem().toString().trim()
                                                + "','" + userName.getText() + "','" + userPassword + "','" + user_type + "','1')");
                                        new Save().setVisible(true);
                                        clear();
                                        uzer.loadUsers();
                                    } catch (Exception e) {
                                        JOptionPane.showConfirmDialog(this, e);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Please select the user role", "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        password.grabFocus();
    }//GEN-LAST:event_userNameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        reTypePassword.grabFocus();
    }//GEN-LAST:event_passwordActionPerformed

    private void reTypePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reTypePasswordActionPerformed
        btn_Add.grabFocus();
    }//GEN-LAST:event_reTypePasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cashier;
    private javax.swing.JRadioButton dataEntry;
    private javax.swing.JComboBox<String> empID;
    private javax.swing.JLabel empName;
    private javax.swing.JButton exit;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton manager;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg2;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField reTypePassword;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables

    private void loadEmpID() {
        try {
            ResultSet rs = DB.search("SELECT id_employee FROM employee");
            while (rs.next()) {
                empID.addItem(" " + rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        empName.setText(null);
        empID.setSelectedIndex(0);
        userName.setText(null);
        password.setText(null);
        reTypePassword.setText(null);
        msg.setText(null);
        msg2.setText(null);
        admin.setSelected(false);
        manager.setSelected(false);
        cashier.setSelected(false);
        dataEntry.setSelected(false);
    }
}
