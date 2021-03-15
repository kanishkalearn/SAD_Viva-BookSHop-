package GUI;

import Database.DB;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class SupplierPaymentsView extends javax.swing.JFrame {

    private Main menu;
    private String user_Type;
    private final DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

    public SupplierPaymentsView() {
        initComponents();
        tableSettings();
    }

    public SupplierPaymentsView(Main me, String user, String id) {
        this();
        this.menu = me;
        this.user_Type = user;
        loadPaymentData(id);
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
        panel = new javax.swing.JPanel();
        voucherNo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        supplierID = new javax.swing.JTextField();
        btn_Cash = new javax.swing.JRadioButton();
        btn_Cheque = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_Previous = new javax.swing.JButton();
        btn_Next = new javax.swing.JButton();
        payMethod = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        label33 = new javax.swing.JLabel();
        txt_ChqNo = new javax.swing.JTextField();
        label44 = new javax.swing.JLabel();
        txt_bankName = new javax.swing.JTextField();
        txt_ChqDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        supplierName = new javax.swing.JLabel();
        voucherValue = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_New = new javax.swing.JButton();
        date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1170, 710));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voucherNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        voucherNo.setForeground(new java.awt.Color(66, 73, 73));
        panel.add(voucherNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 230, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Supplier");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Date");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, 25));

        supplierID.setEditable(false);
        supplierID.setBackground(new java.awt.Color(255, 255, 255));
        supplierID.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        panel.add(supplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, 30));

        btn_Cash.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_Cash);
        btn_Cash.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn_Cash.setForeground(new java.awt.Color(66, 73, 73));
        btn_Cash.setText("Cash");
        btn_Cash.setContentAreaFilled(false);
        btn_Cash.setFocusPainted(false);
        btn_Cash.setFocusable(false);
        btn_Cash.setOpaque(false);
        panel.add(btn_Cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 70, -1));

        btn_Cheque.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_Cheque);
        btn_Cheque.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn_Cheque.setForeground(new java.awt.Color(66, 73, 73));
        btn_Cheque.setText("Cheque");
        btn_Cheque.setContentAreaFilled(false);
        btn_Cheque.setFocusPainted(false);
        btn_Cheque.setFocusable(false);
        btn_Cheque.setOpaque(false);
        panel.add(btn_Cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 80, -1));

        table.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "GRN No", "GRN Date", "GRN Value", "Paid Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(25);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(250);
            table.getColumnModel().getColumn(2).setPreferredWidth(225);
            table.getColumnModel().getColumn(3).setPreferredWidth(250);
            table.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 1030, 260));

        btn_Previous.setBackground(new java.awt.Color(204, 204, 204));
        btn_Previous.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Previous.setText("Previous");
        btn_Previous.setBorder(null);
        btn_Previous.setBorderPainted(false);
        btn_Previous.setContentAreaFilled(false);
        btn_Previous.setFocusPainted(false);
        btn_Previous.setOpaque(true);
        btn_Previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PreviousMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PreviousMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_PreviousMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_PreviousMouseReleased(evt);
            }
        });
        btn_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PreviousActionPerformed(evt);
            }
        });
        panel.add(btn_Previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 90, 30));

        btn_Next.setBackground(new java.awt.Color(204, 204, 204));
        btn_Next.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Next.setText("Next");
        btn_Next.setBorder(null);
        btn_Next.setBorderPainted(false);
        btn_Next.setContentAreaFilled(false);
        btn_Next.setFocusPainted(false);
        btn_Next.setOpaque(true);
        btn_Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_NextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_NextMouseReleased(evt);
            }
        });
        btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextActionPerformed(evt);
            }
        });
        panel.add(btn_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 90, 30));

        payMethod.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(66, 73, 73));
        jLabel9.setText("Bank");

        label33.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        label33.setForeground(new java.awt.Color(66, 73, 73));
        label33.setText("Cheque No");

        txt_ChqNo.setEditable(false);
        txt_ChqNo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txt_ChqNo.setOpaque(false);

        label44.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        label44.setForeground(new java.awt.Color(66, 73, 73));
        label44.setText("Cheque Date");

        txt_bankName.setEditable(false);
        txt_bankName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txt_bankName.setOpaque(false);

        txt_ChqDate.setEditable(false);
        txt_ChqDate.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txt_ChqDate.setOpaque(false);

        javax.swing.GroupLayout payMethodLayout = new javax.swing.GroupLayout(payMethod);
        payMethod.setLayout(payMethodLayout);
        payMethodLayout.setHorizontalGroup(
            payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payMethodLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payMethodLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_bankName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(payMethodLayout.createSequentialGroup()
                        .addGroup(payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ChqNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ChqDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        payMethodLayout.setVerticalGroup(
            payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payMethodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bankName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ChqNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(payMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payMethodLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(payMethodLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_ChqDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panel.add(payMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 350, 140));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(52, 73, 94));
        jLabel7.setText("Supplier Payments");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 360, 50));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(66, 73, 73));
        jLabel10.setText("Voucher No");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 25));

        supplierName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        supplierName.setForeground(new java.awt.Color(66, 73, 73));
        panel.add(supplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 380, 25));

        voucherValue.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        voucherValue.setForeground(new java.awt.Color(0, 0, 102));
        voucherValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        voucherValue.setText("0,000.00");
        panel.add(voucherValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 180, 25));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel11.setText("Total Voucher Value");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 600, 150, 25));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(66, 73, 73));
        jLabel12.setText("Payment Method");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 25));

        btn_New.setBackground(new java.awt.Color(41, 128, 185));
        btn_New.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_New.setForeground(new java.awt.Color(255, 255, 255));
        btn_New.setText("New ");
        btn_New.setBorder(null);
        btn_New.setBorderPainted(false);
        btn_New.setContentAreaFilled(false);
        btn_New.setFocusPainted(false);
        btn_New.setOpaque(true);
        btn_New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_NewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_NewMouseReleased(evt);
            }
        });
        btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewActionPerformed(evt);
            }
        });
        panel.add(btn_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 120, 30));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        date.setOpaque(false);
        panel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 200, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PreviousMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PreviousMouseEntered
        btn_Previous.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_PreviousMouseEntered

    private void btn_PreviousMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PreviousMouseExited
        btn_Previous.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btn_PreviousMouseExited

    private void btn_PreviousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PreviousMousePressed
        btn_Previous.setBackground(new Color(123, 125, 125));
    }//GEN-LAST:event_btn_PreviousMousePressed

    private void btn_PreviousMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PreviousMouseReleased
        btn_Previous.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_PreviousMouseReleased

    private void btn_NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NextMouseEntered
        btn_Next.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_NextMouseEntered

    private void btn_NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NextMouseExited
        btn_Next.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btn_NextMouseExited

    private void btn_NextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NextMousePressed
        btn_Next.setBackground(new Color(123, 125, 125));
    }//GEN-LAST:event_btn_NextMousePressed

    private void btn_NextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NextMouseReleased
        btn_Next.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_NextMouseReleased

    private void btn_NewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewMouseEntered
        btn_New.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_NewMouseEntered

    private void btn_NewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewMouseExited
        btn_New.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_NewMouseExited

    private void btn_NewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewMousePressed
        btn_New.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_NewMousePressed

    private void btn_NewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewMouseReleased
        btn_New.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_NewMouseReleased

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        Supplier_Payments suppPay = new Supplier_Payments(menu, user_Type);
        menu.view.removeAll();
        menu.view.revalidate();
        menu.view.repaint();
        menu.view.add((JPanel) suppPay.panel);
    }//GEN-LAST:event_btn_NewActionPerformed

    private void btn_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PreviousActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        String id = null;
        try {
            ResultSet rs = DB.search("SELECT supplier_payment.id_payment,supplier_payment.id_supplier,CONCAT(supplier.fname,' ',supplier.lname,' ',supplier.company) AS suplier,"
                    + "supplier_payment.`date`,supplier_payment.payment_method,supplier_payment.`value`,cheque_payment.bank,"
                    + "cheque_payment.chq_no,cheque_payment.chq_date FROM supplier INNER JOIN supplier_payment "
                    + "ON supplier.id_supplier=supplier_payment.id_supplier INNER JOIN cheque_payment "
                    + "ON supplier_payment.id_payment=cheque_payment.id_payment "
                    + "WHERE supplier_payment.id_payment < '" + voucherNo.getText() + "' ORDER BY supplier_payment.id_payment DESC LIMIT 1");
            if (rs.next()) {
                id = rs.getString(1);
                voucherNo.setText(rs.getString(1));
                supplierID.setText(rs.getString(2));
                supplierName.setText(rs.getString(3));
                date.setText(rs.getString(4));
                if (rs.getString(5).equals("Cheque")) {
                    btn_Cheque.setSelected(true);
                    txt_bankName.setText(rs.getString(7));
                    txt_ChqNo.setText(rs.getString(8));
                    txt_ChqDate.setText(rs.getString(9));
                }
                voucherValue.setText(decimalFormat.format(rs.getDouble(6)));
            }
            if (id != null) {
                ResultSet rs2 = DB.search("SELECT grn.grn_no, grn.`date`, grn.`value`,payment_items.paid_amount FROM payment_items INNER JOIN grn ON payment_items.id_grn=grn.grn_no WHERE payment_items.id_payment='" + id + "'");
                int rowNo = 0;
                dtm.setRowCount(0);

                while (rs2.next()) {
                    rowNo++;
                    Vector v = new Vector();
                    v.add(rowNo);
                    v.add(rs2.getString("grn_no"));
                    v.add(rs2.getString("date"));
                    v.add(decimalFormat.format(rs2.getDouble("value")));
                    v.add(decimalFormat.format(rs2.getDouble("paid_amount")));
                    dtm.addRow(v);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_PreviousActionPerformed

    private void btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        String id = null;
        try {
            ResultSet rs = DB.search("SELECT supplier_payment.id_payment,supplier_payment.id_supplier,CONCAT(supplier.fname,' ',supplier.lname,' ',supplier.company) AS suplier,"
                    + "supplier_payment.`date`,supplier_payment.payment_method,supplier_payment.`value`,cheque_payment.bank,"
                    + "cheque_payment.chq_no,cheque_payment.chq_date FROM supplier INNER JOIN supplier_payment "
                    + "ON supplier.id_supplier=supplier_payment.id_supplier INNER JOIN cheque_payment "
                    + "ON supplier_payment.id_payment=cheque_payment.id_payment "
                    + "WHERE supplier_payment.id_payment > '" + voucherNo.getText() + "' ORDER BY supplier_payment.id_payment ASC LIMIT 1");

            if (rs.next()) {
                id = rs.getString(1);
                voucherNo.setText(rs.getString(1));
                supplierID.setText(rs.getString(2));
                supplierName.setText(rs.getString(3));
                date.setText(rs.getString(4));
                if (rs.getString(5).equals("Cheque")) {
                    btn_Cheque.setSelected(true);
                    txt_bankName.setText(rs.getString(7));
                    txt_ChqNo.setText(rs.getString(8));
                    txt_ChqDate.setText(rs.getString(9));
                }
                voucherValue.setText(decimalFormat.format(rs.getDouble(6)));

                if (id != null) {
                    ResultSet rs2 = DB.search("SELECT grn.grn_no, grn.`date`, grn.`value`,payment_items.paid_amount FROM payment_items INNER JOIN grn ON payment_items.id_grn=grn.grn_no WHERE payment_items.id_payment='" + id + "'");
                    int rowNo = 0;
                    dtm.setRowCount(0);

                    while (rs2.next()) {
                        rowNo++;
                        Vector v = new Vector();
                        v.add(rowNo);
                        v.add(rs2.getString("grn_no"));
                        v.add(rs2.getString("date"));
                        v.add(decimalFormat.format(rs2.getDouble("value")));
                        v.add(decimalFormat.format(rs2.getDouble("paid_amount")));
                        dtm.addRow(v);
                    }
                }
            } else { // if No next rows 
                Supplier_Payments suppPay = new Supplier_Payments(menu, user_Type);
                menu.view.removeAll();
                menu.view.revalidate();
                menu.view.repaint();
                menu.view.add((JPanel) suppPay.panel);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_NextActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierPaymentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierPaymentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierPaymentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierPaymentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierPaymentsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_Cash;
    private javax.swing.JRadioButton btn_Cheque;
    private javax.swing.JButton btn_New;
    private javax.swing.JButton btn_Next;
    private javax.swing.JButton btn_Previous;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label33;
    private javax.swing.JLabel label44;
    public javax.swing.JPanel panel;
    private javax.swing.JPanel payMethod;
    private javax.swing.JTextField supplierID;
    private javax.swing.JLabel supplierName;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_ChqDate;
    private javax.swing.JTextField txt_ChqNo;
    private javax.swing.JTextField txt_bankName;
    private javax.swing.JLabel voucherNo;
    private javax.swing.JLabel voucherValue;
    // End of variables declaration//GEN-END:variables

    private void tableSettings() {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 14));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.RIGHT);

        table.getColumnModel().getColumn(0).setCellRenderer(center);
        table.getColumnModel().getColumn(1).setCellRenderer(center);
        table.getColumnModel().getColumn(2).setCellRenderer(center);
        table.getColumnModel().getColumn(3).setCellRenderer(right);
        table.getColumnModel().getColumn(4).setCellRenderer(right);
    }

    private void loadPaymentData(String id) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        try {
            ResultSet rs = DB.search("SELECT supplier_payment.id_payment,supplier_payment.id_supplier,CONCAT(supplier.fname,' ',supplier.lname,' ',supplier.company) AS suplier,supplier_payment.`date`,"
                    + "supplier_payment.payment_method,supplier_payment.`value`,cheque_payment.bank,cheque_payment.chq_no,cheque_payment.chq_date FROM supplier "
                    + "INNER JOIN supplier_payment ON supplier.id_supplier=supplier_payment.id_supplier INNER JOIN cheque_payment ON supplier_payment.id_payment=cheque_payment.id_payment "
                    + "WHERE supplier_payment.id_payment='" + id + "'");

            if (rs.next()) {
                voucherNo.setText(rs.getString(1));
                supplierID.setText(rs.getString(2));
                supplierName.setText(rs.getString(3));
                date.setText(rs.getString(4));
                if (rs.getString(5).equals("Cheque")) {
                    btn_Cheque.setSelected(true);
                    txt_bankName.setText(rs.getString(7));
                    txt_ChqNo.setText(rs.getString(8));
                    txt_ChqDate.setText(rs.getString(9));
                }
                voucherValue.setText(decimalFormat.format(rs.getDouble(6)));
            }

            ResultSet rs2 = DB.search("SELECT grn.grn_no,grn.`date`,grn.`value`,payment_items.paid_amount FROM payment_items INNER JOIN grn ON payment_items.id_grn=grn.grn_no WHERE payment_items.id_payment='" + id + "'");
            int rowNo = 0;
            dtm.setRowCount(0);

            while (rs2.next()) {
                rowNo++;
                Vector v = new Vector();
                v.add(rowNo);
                v.add(rs2.getString("grn_no"));
                v.add(rs2.getString("date"));
                v.add(decimalFormat.format(rs2.getDouble("value")));
                v.add(decimalFormat.format(rs2.getDouble("paid_amount")));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
