/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_shop;

/**
 *
 * @author TOP ONE
 */
public class Admin_Powers extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Powers
     */
    public Admin_Powers() {
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

        jLabel1 = new javax.swing.JLabel();
        manage_Categories = new javax.swing.JButton();
        view_transactions = new javax.swing.JButton();
        manage_shops = new javax.swing.JButton();
        order_history = new javax.swing.JButton();
        back_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        jLabel1.setText("Admin Powers");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        manage_Categories.setBackground(new java.awt.Color(248, 248, 248));
        manage_Categories.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        manage_Categories.setText("Manage Categories");
        manage_Categories.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manage_Categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manage_CategoriesMouseClicked(evt);
            }
        });
        manage_Categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_CategoriesActionPerformed(evt);
            }
        });
        getContentPane().add(manage_Categories, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 326, 71));

        view_transactions.setBackground(new java.awt.Color(248, 248, 248));
        view_transactions.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        view_transactions.setText("View Transactions");
        view_transactions.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        view_transactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_transactionsMouseClicked(evt);
            }
        });
        getContentPane().add(view_transactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 326, 71));

        manage_shops.setBackground(new java.awt.Color(248, 248, 248));
        manage_shops.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        manage_shops.setText("Manage Shops");
        manage_shops.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manage_shops.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manage_shopsMouseClicked(evt);
            }
        });
        getContentPane().add(manage_shops, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 326, 71));

        order_history.setBackground(new java.awt.Color(248, 248, 248));
        order_history.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        order_history.setText("Shop's Order History");
        order_history.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        order_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_historyMouseClicked(evt);
            }
        });
        order_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_historyActionPerformed(evt);
            }
        });
        getContentPane().add(order_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 326, 71));

        back_Btn.setBackground(new java.awt.Color(248, 248, 248));
        back_Btn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        back_Btn.setText("< Back");
        back_Btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_BtnMouseClicked(evt);
            }
        });
        getContentPane().add(back_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 602, 163, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1030, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manage_CategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_CategoriesMouseClicked
         this.setVisible(false);
        manage_categories cat = new manage_categories();
        cat.setVisible(true);
        cat.setLocationRelativeTo(null);
    }//GEN-LAST:event_manage_CategoriesMouseClicked

    private void view_transactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_transactionsMouseClicked
         this.setVisible(false);
        All_transactions trans = new All_transactions();
        trans.setVisible(true);
        trans.setLocationRelativeTo(null);
    }//GEN-LAST:event_view_transactionsMouseClicked

    private void manage_shopsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_shopsMouseClicked
         this.setVisible(false);
        view_shops sh = new view_shops();
        sh.setVisible(true);
        sh.setLocationRelativeTo(null);
    }//GEN-LAST:event_manage_shopsMouseClicked

    private void order_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_historyMouseClicked
        this.setVisible(false);
        
        // order history code
    }//GEN-LAST:event_order_historyMouseClicked

    private void back_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_BtnMouseClicked
         this.setVisible(false);
    }//GEN-LAST:event_back_BtnMouseClicked

    private void manage_CategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_CategoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manage_CategoriesActionPerformed

    private void order_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_historyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Order_History od = new Order_History();
        od.setVisible(true);
        od.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_order_historyActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Powers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Powers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Powers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Powers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Powers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manage_Categories;
    private javax.swing.JButton manage_shops;
    private javax.swing.JButton order_history;
    private javax.swing.JButton view_transactions;
    // End of variables declaration//GEN-END:variables
}
