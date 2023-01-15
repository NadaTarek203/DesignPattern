/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grocery_shop;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 7
 */
public class Manage_Products extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Products
     */int shop_id=-1;
      int product_num=-1;
      List<Products>all_products;
      List<Products> shop_products;
    public Manage_Products() {
        initComponents();
        
        //int shop_id=-1;
        int owner_id=Loggedin_User.getInstance().getId();
        List<Shop> all_shops = Data.getInstance().getShop();
        for(int i=0;i<all_shops.size();i++)
        {
            if(all_shops.get(i).getOwner_id()==owner_id)
            {
                shop_id=all_shops.get(i).getId();
            }
        }
        
       all_products=Data.getInstance().getProduct();
       shop_products = new ArrayList<>();
        for (int i=0;i<all_products.size();i++)
        {
            if(all_products.get(i).getShop_id()==shop_id)   
            { 
                Products p1 = new Products();
                p1.setId(all_products.get(i).getId());
                p1.setPrice(all_products.get(i).getPrice());
                p1.setName(all_products.get(i).getName());
                p1.setQuantity(all_products.get(i).getQuantity());
                p1.setShop_id(shop_id);
                shop_products.add(p1);
            }
        } //for (int i=0;i<shop_products.size();i++)
              //  System.out.println(shop_products.get(i).getName());

         String[]prod_names= new String[shop_products.size()];
         for (int i=0;i<shop_products.size();i++)
            prod_names[i]=shop_products.get(i).getName();
        jComboBox1.setModel(new DefaultComboBoxModel<>(prod_names));
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Choose a product");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 79, -1, -1));

        jComboBox1.setAutoscrolls(true);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, 188, 35));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 79, -1, -1));

        jTextField5.setBackground(new java.awt.Color(248, 248, 248));
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 120, 204, 35));

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setText("Edit");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 468, 103, 32));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 181, -1, -1));

        jTextField2.setBackground(new java.awt.Color(248, 248, 248));
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 217, 188, 36));

        jButton2.setBackground(new java.awt.Color(248, 248, 248));
        jButton2.setText("Delete");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 468, 107, 32));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 181, -1, -1));

        jTextField3.setBackground(new java.awt.Color(248, 248, 248));
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 217, 204, 36));

        jButton3.setBackground(new java.awt.Color(248, 248, 248));
        jButton3.setText("Add");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 468, 107, 32));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Product Image");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel6.setBackground(new java.awt.Color(248, 248, 248));
        jLabel6.setText("image");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 204, 96));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("Category");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 284, -1, -1));

        cat.setBackground(new java.awt.Color(248, 248, 248));
        cat.setActionCommand("<Not Set>");
        cat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });
        jPanel1.add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 326, 188, 37));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -3, 1030, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        product_num = jComboBox1.getSelectedIndex();

        jTextField5.setText(shop_products.get(product_num).getName());
        jTextField2.setText(String.valueOf(shop_products.get(product_num).getQuantity()));
        jTextField3.setText(String.valueOf(shop_products.get(product_num).getPrice()));
        System.out.println(product_num);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id = shop_products.get(product_num).getId();
        for(int i=0;i<all_products.size();i++)
        if(all_products.get(i).getId()==id)
        {
            all_products.get(i).setName(jTextField5.getText());
            all_products.get(i).setPrice(Integer.parseInt(jTextField3.getText()));
            all_products.get(i).setQuantity(Integer.parseInt(jTextField2.getText()));
        }
        Manage_Products s= new Manage_Products();
        s.dispose();
        s.setVisible(true);
        s.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int id = shop_products.get(product_num).getId();
        for(int i=0;i<all_products.size();i++)
        if(all_products.get(i).getId()==id)
        all_products.remove(i);
        Manage_Products s= new Manage_Products();
        s.dispose();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        // int last_id=all_products.get(all_products.size()-1).getId()+1;
        //Loggedin_User.getInstance().getId();
        //List<>
     /*   Data.getInstance().setProductwithcat(jTextField5.getText(),
            Integer.parseInt(jTextField2.getText()),Integer.parseInt(jTextField3.getText()), shop_id, "vegetables");
        Manage_Products s= new Manage_Products();
        s.dispose();
        s.setVisible(true);
        s.setLocationRelativeTo(null);*/

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
         Data.getInstance().setProductwithcat(jTextField5.getText().toString(),
         Integer.parseInt(jTextField2.getText()),Integer.parseInt(jTextField3.getText()), shop_id, cat.getText().toString());
//         Manage_Products s= new Manage_Products();
//         s.dispose();
//         s.setVisible(true);
//         s.setLocationRelativeTo(null);
         List<Products>p= Data.getInstance().getProduct();
         List<Shop_Owner>l=Data.getInstance().getShop_owner();
         List<Customer>c=Data.getInstance().getCust();
         List<Shop>sh=Data.getInstance().getShop();
         List<Category>ca=Data.getInstance().getCat();
         List<Orders> ord= Data.getInstance().getOrder();
         List<Order_Details>ord_=Data.getInstance().getOrder_details();
         System.out.println("products");
         for(int i=0;i<p.size();i++){
             System.out.println(p.get(i).getId()+" "+p.get(i).getName()+" "+p.get(i).getCategory());
         }
         System.out.println("shop owner");
         for(int i=0;i<l.size();i++){
             System.out.println(l.get(i).getId()+" "+l.get(i).getName());
         }
         
         System.out.println("cat");
         for(int i=0;i<ca.size();i++){
             System.out.println(ca.get(i).getId()+" "+ca.get(i).getCategoryname());
         }
         System.out.println("shop");
         for(int i=0;i<sh.size();i++){
             System.out.println(sh.get(i).getId()+" "+sh.get(i).getName()+" owner"+sh.get(i).getOwner_id());
         }
         System.out.println("orders");
         for(int i=0;i<ord.size();i++){
             System.out.println(ord.get(i).getId()+" "+ord.get(i).getCust_id()+" shop"+ord.get(i).getShop_id());
         }
         
          System.out.println("orders details");
         for(int i=0;i<ord_.size();i++){
             System.out.println(ord_.get(i).getOrder_id()+" prod id "+ord_.get(i).getProduct_id());
         }
         
         
    }//GEN-LAST:event_jButton3MouseClicked

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

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
            java.util.logging.Logger.getLogger(Manage_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
