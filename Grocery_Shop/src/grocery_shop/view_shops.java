package grocery_shop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class view_shops extends javax.swing.JFrame {

    Admin admin = new Admin();
    DefaultTableModel model = new DefaultTableModel();
    String[] columnNames = { "ShopID", "Name", "Address", "Shop OwnerID", "CategoryID", "State" };
    List<Shop> shops = admin.getShops();
    List index = new ArrayList();
     
    public view_shops() {
  
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        view_shops = new javax.swing.JRadioButton();
        requests = new javax.swing.JRadioButton();
        remove_btn = new javax.swing.JButton();
        accept_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Manage Shops");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        view_shops.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        view_shops.setText("View Shops ");
        view_shops.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_shopsMouseClicked(evt);
            }
        });
        getContentPane().add(view_shops, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        requests.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        requests.setText("Join Requests");
        requests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestsMouseClicked(evt);
            }
        });
        getContentPane().add(requests, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        remove_btn.setBackground(new java.awt.Color(248, 248, 248));
        remove_btn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        remove_btn.setText("Remove");
        remove_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        remove_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_btnMouseClicked(evt);
            }
        });
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });
        getContentPane().add(remove_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 90, 40));

        accept_btn.setBackground(new java.awt.Color(248, 248, 248));
        accept_btn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        accept_btn.setText("Accept");
        accept_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        accept_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accept_btnMouseClicked(evt);
            }
        });
        accept_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accept_btnActionPerformed(evt);
            }
        });
        getContentPane().add(accept_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 90, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 241, -1, -1));

        jTable1.setBackground(new java.awt.Color(248, 248, 248));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jTable1.setModel(model);
        jTable1.setRowHeight(26);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 435, 419));

        back_btn.setBackground(new java.awt.Color(248, 248, 248));
        back_btn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        back_btn.setText("< Back");
        back_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 90, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1050, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_shopsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_shopsMouseClicked
       requests.setSelected(false);
       remove_btn.setEnabled(true);
       accept_btn.setEnabled(false);
        jTable1.removeAll();
        index.clear();
       model = new DefaultTableModel(columnNames,0);
        int i =0;
            while(i < admin.getShops().size()){
                Shop shop = admin.getShops().get(i); 
                
                if(shop.getState().equals( "approved")){
                    Object[] obj = new Object[] {shop.getId(),shop.getName(),shop.getAddress(),shop.getOwner_id(),shop.getCat_id(),shop.getState()};           
                    model.addRow(obj);
                    index.add(i);
                }
                i++;
            }
            
        if(jTable1 != null)
            jTable1.setModel(model);
        
        
    }//GEN-LAST:event_view_shopsMouseClicked

    private void requestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestsMouseClicked
       view_shops.setSelected(false);
       accept_btn.setEnabled(true);
       remove_btn.setEnabled(false);
       jTable1.removeAll();
       index.clear();
       model = new DefaultTableModel(columnNames,0);
       
        int i =0;
            while(i < admin.getShops().size()){
                Shop shop = admin.getShops().get(i); 
                
                if(shop.getState().equals( "pending")){
                    Object[] obj = new Object[] {shop.getId(),shop.getName(),shop.getAddress(),shop.getOwner_id(),shop.getCat_id(),shop.getState()};       
                    model.addRow(obj);
                    index.add(i);
                }
                i++;
            }
        if(jTable1 != null)
            jTable1.setModel(model);
    }//GEN-LAST:event_requestsMouseClicked

    private void remove_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_btnMouseClicked
     
       Object ind = index.get(jTable1.getSelectedRow());
       admin.removeShop(ind.hashCode());
       model.removeRow(jTable1.getSelectedRow());
          
    }//GEN-LAST:event_remove_btnMouseClicked

    private void accept_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accept_btnMouseClicked
      
        Object ind = index.get(jTable1.getSelectedRow());
        admin.acceptShops(ind.hashCode());
        model.removeRow(jTable1.getSelectedRow());
        
    }//GEN-LAST:event_accept_btnMouseClicked

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        this.setVisible(false);
        Admin_Powers ad = new Admin_Powers();
        ad.setVisible(true);
        ad.setLocationRelativeTo(null);
    }//GEN-LAST:event_back_btnMouseClicked

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remove_btnActionPerformed

    private void accept_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accept_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accept_btnActionPerformed

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
            java.util.logging.Logger.getLogger(view_shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_shops().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remove_btn;
    private javax.swing.JRadioButton requests;
    private javax.swing.JRadioButton view_shops;
    // End of variables declaration//GEN-END:variables
}
