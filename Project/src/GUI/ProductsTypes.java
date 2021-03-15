package GUI;

import Model.Access_Denied;
import Database.DB;
import Model.ProductTypeExcelReport;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ProductsTypes extends javax.swing.JFrame {

    private Main menu;
    private String user_Type;

    public ProductsTypes() {
        initComponents();
        tableSettings();
        loadTableData();
    }

    public ProductsTypes(Main mMenu, String user) {
        this();
        this.menu = mMenu;
        this.user_Type = user;
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
        btn_Export = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Export.setBackground(new java.awt.Color(179, 182, 183));
        btn_Export.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Export.setText("Export");
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
        panel.add(btn_Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 130, 35));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("New Category");
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
        panel.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 130, 35));

        jScrollPane1.setBorder(null);

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Code", "Category", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setOpaque(false);
        table.setRowHeight(25);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(2).setPreferredWidth(475);
            table.getColumnModel().getColumn(3).setPreferredWidth(350);
        }

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 1030, 450));

        searchBox.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        searchBox.setForeground(new java.awt.Color(39, 55, 70));
        searchBox.setText("  Search");
        searchBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBoxFocusLost(evt);
            }
        });
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });
        panel.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 350, 35));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 73, 94));
        jLabel1.setText("Product Categories");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 360, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
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

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager")) {

            Add_ProductType addtype = new Add_ProductType(menu, this);
            addtype.setVisible(true);

        } else if (user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void searchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBoxFocusGained
        searchBox.setText(null);
    }//GEN-LAST:event_searchBoxFocusGained

    private void searchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBoxFocusLost
        if (searchBox.getText().equals("")) {
            searchBox.setText(" Search");
        }
    }//GEN-LAST:event_searchBoxFocusLost

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            ResultSet rs = DB.search("SELECT * from product_type WHERE id like '" + searchBox.getText() + "%' OR type like '" + searchBox.getText() + "%' ");
            int rawNo = 0;
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                rawNo++;
                v.add(rawNo);
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBoxKeyReleased

    private void btn_ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportActionPerformed
        if (user_Type.equals("Admin") | user_Type.equals("Manager")) {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd__HH-mm-ss");
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Save As");
            chooser.setSelectedFile(new File("CategoryDetailsReport" + sdf.format(new Date())));
            chooser.setFileFilter(new FileNameExtensionFilter("PDF (* .pdf)", ".pdf"));
            chooser.setFileFilter(new FileNameExtensionFilter("Excel Workbook (* .xlsx)", ".xlsx"));
            int retrival = chooser.showSaveDialog(null);

            if (retrival == JFileChooser.APPROVE_OPTION) {
                menu.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                
                String saveFile = chooser.getSelectedFile().getAbsolutePath().replace("\\", "/") + ".xlsx";
                ProductTypeExcelReport.writeExcel("Product Category Details", saveFile);
                menu.setCursor(null);
            }

        } else if (user_Type.equals("Cashier") | user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_ExportActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsTypes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Export;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panel;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(center);
        table.getColumnModel().getColumn(1).setCellRenderer(center);
        table.getColumnModel().getColumn(2).setCellRenderer(center);
    }

    public void loadTableData() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            ResultSet rs = DB.search("SELECT * from product_type");
            int rawNo = 0;
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                rawNo++;
                v.add(rawNo);
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}