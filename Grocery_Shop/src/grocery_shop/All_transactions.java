
package grocery_shop;

import javax.swing.table.DefaultTableModel;


public class All_transactions extends javax.swing.JFrame {

    Admin admin = new Admin();
    DefaultTableModel model = new DefaultTableModel();
    String[] columnNames = { "OrderID", "CustomerID", "ShopID", "Order State" };
 
    public All_transactions() {
        model.setColumnCount(4);
        model.setColumnIdentifiers(columnNames);
        
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pending = new javax.swing.JRadioButton();
        placed = new javax.swing.JRadioButton();
        back_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(248, 248, 248));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jTable1.setModel(model);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(26);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 460, 470));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        jLabel1.setText("All Transactions");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 44, -1, -1));

        pending.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        pending.setText("Pending");
        pending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingMouseClicked(evt);
            }
        });
        getContentPane().add(pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 47, -1, -1));

        placed.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        placed.setText("Placed");
        placed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placedMouseClicked(evt);
            }
        });
        getContentPane().add(placed, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 47, -1, -1));

        back_btn.setBackground(new java.awt.Color(248, 248, 248));
        back_btn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        back_btn.setText("< Back");
        back_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 546, 134, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1030, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingMouseClicked
        placed.setSelected(false);
        model = new DefaultTableModel(columnNames, 0);
        jTable1.removeAll();
        int i =0;
        while(i < admin.viewTransactions().size()){
            Orders order = admin.viewTransactions().get(i); 
            if(order.getState() == "pending"){
                Object[] obj = new Object[] {order.getId(),order.getCust_id(),order.getShop_id(),order.getState()};           
                model.addRow(obj);
            }
            i++;
        }
        if(jTable1 != null)
            jTable1.setModel(model);
        
    }//GEN-LAST:event_pendingMouseClicked

    private void placedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placedMouseClicked
       pending.setSelected(false);
        model = new DefaultTableModel(columnNames, 0);
        jTable1.removeAll();
        int i =0;
        while(i < admin.viewTransactions().size()){
            Orders order = admin.viewTransactions().get(i); 
            if(order.getState() == "placed"){
                Object[] obj = new Object[] {order.getId(),order.getCust_id(),order.getShop_id(),order.getState()};           
                model.addRow(obj);
            }
            i++;
        }
        if(jTable1 != null)
            jTable1.setModel(model);
    }//GEN-LAST:event_placedMouseClicked

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        this.setVisible(false);
        Admin_Powers ad = new Admin_Powers();
        ad.setVisible(true);
        ad.setLocationRelativeTo(null);
    }//GEN-LAST:event_back_btnMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(All_transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(All_transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(All_transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(All_transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new All_transactions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton pending;
    private javax.swing.JRadioButton placed;
    // End of variables declaration//GEN-END:variables
}