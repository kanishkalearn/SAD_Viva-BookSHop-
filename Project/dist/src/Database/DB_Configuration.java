package Database;

import GUI.Main;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DB_Configuration extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private Main menu;

    public DB_Configuration() {

        initComponents();
        load_propertie();
    }

    public DB_Configuration(Main menu) {
        this();
        this.menu = menu;
        this.menu.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_serverPath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dbIPaddress = new javax.swing.JTextField();
        dbPort = new javax.swing.JTextField();
        dataBaseName = new javax.swing.JTextField();
        dbUserName = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        dbPassword = new javax.swing.JPasswordField();
        btn_Exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_Save = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setText("Settings");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, -1));

        jSeparator1.setForeground(new java.awt.Color(41, 128, 185));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 660, 10));

        txt_serverPath.setEditable(false);
        txt_serverPath.setBackground(new java.awt.Color(255, 255, 255));
        txt_serverPath.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_serverPath.setText("C:/Program Files/MySQL/MySQL Server 5.7/bin");
        txt_serverPath.setToolTipText("mySQL server installation path");
        jPanel1.add(txt_serverPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 380, 25));

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel2.setText("Database Configuration");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Installantion Path");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Port");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Database Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("User Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 120, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 120, 30));

        dbIPaddress.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(dbIPaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 380, 30));

        dbPort.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(dbPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 380, 30));

        dataBaseName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(dataBaseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 380, 30));

        dbUserName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(dbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 380, 30));

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setToolTipText("View the Password");
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, 30));

        dbPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(dbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 350, 30));

        btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_1.png"))); // NOI18N
        btn_Exit.setBorder(null);
        btn_Exit.setBorderPainted(false);
        btn_Exit.setContentAreaFilled(false);
        btn_Exit.setFocusPainted(false);
        btn_Exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close_2.png"))); // NOI18N
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 1, 34, 25));

        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        btn_Save.setBackground(new java.awt.Color(41, 128, 185));
        btn_Save.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
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
        jPanel1.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 100, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 73, 73));
        jLabel9.setText("IP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        dbPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dbPassword.setEchoChar((char) 42);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel8MouseDragged

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

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed

        try {
            String serverLocation = txt_serverPath.getText().trim();
            String IP = dbIPaddress.getText().trim();
            String port = dbPort.getText().trim();
            String database = dataBaseName.getText().trim();
            String username = dbUserName.getText().trim();
            String password = new String(dbPassword.getPassword()).trim();

            FileWriter fw = new FileWriter("dbconfig.properties");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("***************************Chamara Book Shop***************************");
            bw.newLine();
            bw.newLine();
            bw.newLine();
            bw.write("Server_Ip = " + IP.trim());//IP
            bw.newLine();
            bw.write("Port = " + port.trim());//port
            bw.newLine();
            bw.write("Database_Name = " + database.trim());//database
            bw.newLine();
            bw.write("User_Name = " + username.trim());//username
            bw.newLine();
            bw.write("Password = " + password.trim());//password
            bw.newLine();
            bw.write("mySqlDumpPath = " + serverLocation.trim() + "/mysqldump.exe");//server dump path
            bw.newLine();
            bw.write("mySqlExePath = " + serverLocation.trim() + "/mysql.exe");//sever exe path
            bw.newLine();
            bw.flush();
            bw.close();

            JOptionPane.showMessageDialog(this, "File Successfully created", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(DB_Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DB_Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DB_Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DB_Configuration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DB_Configuration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Save;
    private javax.swing.JTextField dataBaseName;
    private javax.swing.JTextField dbIPaddress;
    private javax.swing.JPasswordField dbPassword;
    private javax.swing.JTextField dbPort;
    private javax.swing.JTextField dbUserName;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_serverPath;
    // End of variables declaration//GEN-END:variables

    private void load_propertie() {

        try {
            Properties p = new Properties();
            FileReader fr = new FileReader("dbconfig.properties");
            p.load(fr);

            dbIPaddress.setText(p.getProperty("Server_Ip"));
            dbPort.setText(p.getProperty("Port"));
            dataBaseName.setText(p.getProperty("Database_Name"));
            dbUserName.setText(p.getProperty("User_Name"));
            dbPassword.setText(p.getProperty("Password"));
            txt_serverPath.setText(p.getProperty("mySqlDumpPath").split("/mysqldump.exe")[0]);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException x) {
            x.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
