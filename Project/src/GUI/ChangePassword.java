package GUI;

import Database.DB;
import Model.Save;
import java.awt.Color;
import java.sql.ResultSet;

public class ChangePassword extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private Main menu;
    private boolean checkCurrentPassword;

    public ChangePassword() {
        initComponents();
        currentPassword.grabFocus();
    }

    public ChangePassword(Main menu, String username) {
        this();
        this.userName.setText(username);
        this.menu = menu;
        this.menu.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        warningMsg = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        currentPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        reTypePassword = new javax.swing.JPasswordField();
        btn_Cancel = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(250, 251, 250));
        jLabel2.setOpaque(true);
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 550, 25));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setIconTextGap(0);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 1, 30, 25));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Change  Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 25, 580, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Current Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 30));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("New Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 30));

        warningMsg.setBackground(new java.awt.Color(102, 102, 102));
        warningMsg.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        warningMsg.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(warningMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 270, 30));

        userName.setBackground(new java.awt.Color(102, 102, 102));
        userName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 340, 30));

        currentPassword.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        currentPassword.setForeground(new java.awt.Color(39, 55, 70));
        currentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPasswordActionPerformed(evt);
            }
        });
        currentPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                currentPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(currentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 340, 30));

        newPassword.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        newPassword.setForeground(new java.awt.Color(39, 55, 70));
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 340, 30));

        reTypePassword.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        reTypePassword.setForeground(new java.awt.Color(39, 55, 70));
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
        jPanel1.add(reTypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 340, 30));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 90, 30));

        btn_Save.setBackground(new java.awt.Color(41, 128, 185));
        btn_Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save.setText("Save");
        btn_Save.setBorder(null);
        btn_Save.setBorderPainted(false);
        btn_Save.setContentAreaFilled(false);
        btn_Save.setFocusPainted(false);
        btn_Save.setOpaque(true);
        btn_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_SaveMouseReleased(evt);
            }
        });
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 90, 30));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 73, 73));
        jLabel8.setText("User Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 30));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("Re-Enter Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void btn_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseEntered
        btn_Save.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_SaveMouseEntered

    private void btn_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseExited
        btn_Save.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_SaveMouseExited

    private void btn_SaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMousePressed
        btn_Save.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_SaveMousePressed

    private void btn_SaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SaveMouseReleased
        btn_Save.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_SaveMouseReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void currentPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentPasswordKeyReleased
        try {
            String pass = new String(currentPassword.getPassword());
            ResultSet rs = DB.search("SELECT password FROM user WHERE user_name='" + userName.getText() + "'");
            if (rs.next()) {
                checkCurrentPassword = pass.equals(rs.getString("password"));
                warningMsg.setText(null);
            } else {
                if (!checkCurrentPassword) {
                    warningMsg.setText("Password is wrong, Try again");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_currentPasswordKeyReleased

    private void reTypePasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reTypePasswordKeyReleased
        String pw = new String(newPassword.getPassword());
        String pw2 = new String(reTypePassword.getPassword());
        if (pw2.equals(pw)) {
            warningMsg.setText(null);
        } else {
            warningMsg.setText("Password Not Match");
        }
    }//GEN-LAST:event_reTypePasswordKeyReleased

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        if (checkCurrentPassword) {
            if (new String(reTypePassword.getPassword()).equals(new String(newPassword.getPassword()))) {
                try {

                    DB.iud("UPDATE user SET password='" + new String(reTypePassword.getPassword()) + "' WHERE user_name='" + userName.getText() + "' ");
                    new Save().setVisible(true);
                    menu.setEnabled(true);
                    this.dispose();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void currentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPasswordActionPerformed
        newPassword.grabFocus();
    }//GEN-LAST:event_currentPasswordActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        reTypePassword.grabFocus();
    }//GEN-LAST:event_newPasswordActionPerformed

    private void reTypePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reTypePasswordActionPerformed
        btn_Save.grabFocus();
    }//GEN-LAST:event_reTypePasswordActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Save;
    private javax.swing.JPasswordField currentPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField reTypePassword;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel warningMsg;
    // End of variables declaration//GEN-END:variables
}