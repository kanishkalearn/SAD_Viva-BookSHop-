package GUI;

import Database.DB_Configuration;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Settings extends javax.swing.JFrame {

    private Main menu;
    private String backupfilePath;
    private String restorefilePath;

    public Settings() {
        initComponents();
    }

    public Settings(Main aThis) {
        this();
        this.menu = aThis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Export = new javax.swing.JButton();
        btn_Restore = new javax.swing.JButton();
        fileChooserRestore = new javax.swing.JButton();
        restoreMessage = new javax.swing.JLabel();
        txt_RestorePath = new javax.swing.JLabel();
        btn_Backup = new javax.swing.JButton();
        fileChooserBackup = new javax.swing.JButton();
        txt_BackupPath = new javax.swing.JLabel();
        backupMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1170, 715));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dba.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, 450));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 73, 94));
        jLabel2.setText("Settings");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 50));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 128, 185));
        jLabel3.setText("Database Backup & Restore");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 240, 35));

        btn_Export.setBackground(new java.awt.Color(179, 182, 183));
        btn_Export.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Export.setForeground(new java.awt.Color(51, 51, 51));
        btn_Export.setText("Database Configuration");
        btn_Export.setToolTipText("Edit your Datbase configurations");
        btn_Export.setBorder(null);
        btn_Export.setBorderPainted(false);
        btn_Export.setContentAreaFilled(false);
        btn_Export.setFocusPainted(false);
        btn_Export.setOpaque(true);
        btn_Export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ExportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ExportMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ExportMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ExportMouseReleased(evt);
            }
        });
        btn_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportActionPerformed(evt);
            }
        });
        panel.add(btn_Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 220, 35));

        btn_Restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/restore1.png"))); // NOI18N
        btn_Restore.setToolTipText("Restore backuped sql file");
        btn_Restore.setBorder(null);
        btn_Restore.setContentAreaFilled(false);
        btn_Restore.setFocusPainted(false);
        btn_Restore.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/restore3.png"))); // NOI18N
        btn_Restore.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/restore2.png"))); // NOI18N
        btn_Restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestoreActionPerformed(evt);
            }
        });
        panel.add(btn_Restore, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 415, 300, 40));

        fileChooserRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fileChooser1.png"))); // NOI18N
        fileChooserRestore.setToolTipText("Browse File");
        fileChooserRestore.setBorder(null);
        fileChooserRestore.setBorderPainted(false);
        fileChooserRestore.setContentAreaFilled(false);
        fileChooserRestore.setFocusPainted(false);
        fileChooserRestore.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fileChooser3.png"))); // NOI18N
        fileChooserRestore.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fileChooser2.png"))); // NOI18N
        fileChooserRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserRestoreActionPerformed(evt);
            }
        });
        panel.add(fileChooserRestore, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 415, 45, 42));

        restoreMessage.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        restoreMessage.setForeground(new java.awt.Color(39, 174, 96));
        panel.add(restoreMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 415, 220, 40));

        txt_RestorePath.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panel.add(txt_RestorePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 465, 510, 30));

        btn_Backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/crdb1.png"))); // NOI18N
        btn_Backup.setToolTipText("Backup your Databse");
        btn_Backup.setBorder(null);
        btn_Backup.setContentAreaFilled(false);
        btn_Backup.setFocusPainted(false);
        btn_Backup.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/crdb3.png"))); // NOI18N
        btn_Backup.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/crdb2.png"))); // NOI18N
        btn_Backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackupActionPerformed(evt);
            }
        });
        panel.add(btn_Backup, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 300, 40));

        fileChooserBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fileChooser1.png"))); // NOI18N
        fileChooserBackup.setToolTipText("Browse File");
        fileChooserBackup.setBorder(null);
        fileChooserBackup.setBorderPainted(false);
        fileChooserBackup.setContentAreaFilled(false);
        fileChooserBackup.setFocusPainted(false);
        fileChooserBackup.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fileChooser3.png"))); // NOI18N
        fileChooserBackup.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fileChooser2.png"))); // NOI18N
        fileChooserBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserBackupActionPerformed(evt);
            }
        });
        panel.add(fileChooserBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 178, 45, 42));

        txt_BackupPath.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        panel.add(txt_BackupPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 510, 30));

        backupMessage.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backupMessage.setForeground(new java.awt.Color(39, 174, 96));
        panel.add(backupMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseEntered
        btn_Export.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_ExportMouseEntered

    private void btn_ExportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseExited
        btn_Export.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_ExportMouseExited

    private void btn_ExportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMousePressed
        btn_Export.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_ExportMousePressed

    private void btn_ExportMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExportMouseReleased
        btn_Export.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_ExportMouseReleased

    private void btn_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportActionPerformed
        DB_Configuration config = new DB_Configuration(menu);
        config.setVisible(true);
    }//GEN-LAST:event_btn_ExportActionPerformed

    private void fileChooserBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserBackupActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save As");
        chooser.setSelectedFile(new File("backup_" + LocalDate.now()));
        chooser.setFileFilter(new FileNameExtensionFilter("SQL File ( .sql)", "sql"));
        int option = chooser.showSaveDialog(menu);

        if (option == JFileChooser.APPROVE_OPTION) {
            backupfilePath = chooser.getSelectedFile().getAbsolutePath().replace("\\", "/") + ".sql";
            txt_BackupPath.setText(backupfilePath);
        }
    }//GEN-LAST:event_fileChooserBackupActionPerformed

    private void fileChooserRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserRestoreActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Open File");
        chooser.setFileFilter(new FileNameExtensionFilter("SQL File ( .sql)", "sql"));
        int option = chooser.showOpenDialog(menu);

        if (option == JFileChooser.APPROVE_OPTION) {
            restorefilePath = chooser.getSelectedFile().getAbsolutePath().replace("\\", "/");
            txt_RestorePath.setText(restorefilePath);
        }
    }//GEN-LAST:event_fileChooserRestoreActionPerformed

    private void btn_BackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackupActionPerformed

        if (backupfilePath == null) {
            //backupDatabase("C:/Users/" + System.getProperty("user.name") + "/Desktop/backup.sql");
            JOptionPane.showMessageDialog(menu, "First set file name & location", "Select a file location", JOptionPane.INFORMATION_MESSAGE);
        } else {
            backupDatabase(backupfilePath);
        }
    }//GEN-LAST:event_btn_BackupActionPerformed

    private void btn_RestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestoreActionPerformed
        if (restorefilePath == null) {
            JOptionPane.showMessageDialog(this, "Before retore, choose a (.sql) backup file", "Choose the backup file", JOptionPane.ERROR_MESSAGE);
        } else {
            databaseRestore(restorefilePath);
        }
    }//GEN-LAST:event_btn_RestoreActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backupMessage;
    private javax.swing.JButton btn_Backup;
    private javax.swing.JButton btn_Export;
    private javax.swing.JButton btn_Restore;
    private javax.swing.JButton fileChooserBackup;
    private javax.swing.JButton fileChooserRestore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel panel;
    private javax.swing.JLabel restoreMessage;
    private javax.swing.JLabel txt_BackupPath;
    private javax.swing.JLabel txt_RestorePath;
    // End of variables declaration//GEN-END:variables

    private void backupDatabase(String filePath) {

        FileReader fr = null;
        try {
            menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Properties p = new Properties();
            fr = new FileReader("dbconfig.properties");
            p.load(fr);
            String dbName = p.getProperty("Database_Name");
            String dbUserName = p.getProperty("User_Name");
            String dbPassword = p.getProperty("Password");
            String mySqlDump = p.getProperty("mySqlDumpPath");
            String executeCmd = mySqlDump + " -u " + dbUserName + " -p" + dbPassword + " --add-drop-database -B " + dbName + " -r" + filePath;

            Process runtimeProcess;
            try {
                runtimeProcess = Runtime.getRuntime().exec(executeCmd);
                int processComplete = runtimeProcess.waitFor();

                if (processComplete == 0) {
                    backupMessage.setForeground(new Color(39, 174, 96));
                    backupMessage.setText("Backup Done !");
                } else {
                    backupMessage.setForeground(Color.red);
                    backupMessage.setText("Cannot Backup");
                }

            } catch (IOException | InterruptedException ex) {
                System.out.println(ex);
            }
            menu.setCursor(null);

            clearTextFields();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void databaseRestore(String source) {
        FileReader fr = null;
        try {
            menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Properties p = new Properties();
            fr = new FileReader("dbconfig.properties");
            p.load(fr);
            String dbUserName = p.getProperty("User_Name");
            String dbPassword = p.getProperty("Password");
            String mySqlExePath = p.getProperty("mySqlExePath");

            String[] restoreCmd = new String[]{mySqlExePath, "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + source};
            Process runtimeProcess;
            try {
                runtimeProcess = Runtime.getRuntime().exec(restoreCmd);
                int processComplete = runtimeProcess.waitFor();

                if (processComplete == 0) {
                    restoreMessage.setForeground(new Color(39, 174, 96));
                    restoreMessage.setText("Restore Done !");
                } else {
                    restoreMessage.setForeground(Color.red);
                    restoreMessage.setText("Cannot Restored");
                }

            } catch (IOException | InterruptedException ex) {
                System.out.println(ex);
            }
            menu.setCursor(null);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void clearTextFields() {
        Timer t = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_BackupPath.setText(null);
                txt_RestorePath.setText(null);
                backupMessage.setText(null);
                restoreMessage.setText(null);
            }
        });
        t.start();
    }

}