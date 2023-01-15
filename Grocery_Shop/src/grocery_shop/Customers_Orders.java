
package grocery_shop;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Customers_Orders extends javax.swing.JFrame {

  
   List<Integer> cust_orders;
    public Customers_Orders() {
        initComponents();
        
        int shop_id=-1;
        int owner_id=Loggedin_User.getInstance().getId();
        List<Shop> all_shops = Data.getInstance().getShop();
        for(int i=0;i<all_shops.size();i++)
        {
            if(all_shops.get(i).getOwner_id()==owner_id)
            {
                shop_id=all_shops.get(i).getId();
            }
        }
        
        
        List<Orders> all_orders=Data.getInstance().getOrder();
        List<Orders> shop_orders=new ArrayList<>();

        for(int i=0;i<all_orders.size();i++)
        {
         if(all_orders.get(i).getShop_id()==shop_id && all_orders.get(i).getState().equals("placed"))
         {
             Orders o = new Orders();
             o.setId(all_orders.get(i).getId());
             o.setCust_id(all_orders.get(i).getCust_id());
             o.setShop_id(shop_id);
             o.setState(all_orders.get(i).getState());
             shop_orders.add(o);
         }
        }        
        
        //List<Orders> orders=Data.getInstance().getOrder();
        List<Customer> all_customers=Data.getInstance().getCust();
         cust_orders=new ArrayList<>();
        List<String> cust_names = new ArrayList<>();
        
        
        for(int i=0;i<shop_orders.size();i++)
        {
            for(int j=0;j<all_customers.size();j++)
            {
                if(shop_orders.get(i).getCust_id()==all_customers.get(j).getId())
                {
                    cust_names.add(all_customers.get(j).getUsername());
                    cust_orders.add(shop_orders.get(i).getId());
                }
            }
        }
        String[] s = new String[cust_names.size()];
        for(int i=0;i<cust_names.size();i++)
            s[i]=cust_names.get(i);
        jList2.setModel(new DefaultComboBoxModel<>(s));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setBackground(new java.awt.Color(248, 248, 248));
        jList2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 179, 490));

        jList3.setBackground(new java.awt.Color(248, 248, 248));
        jList3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(jList3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 79, 327, 490));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Orders:");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Details:");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 43, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1030, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        // TODO add your handling code here:
        JList list = (JList)evt.getSource();
        int index= jList2.locationToIndex(evt.getPoint());
        int order_id=cust_orders.get(index);
        System.out.println(order_id);
        List<Order_Details>details =Data.getInstance().getOrder_details();
        List<Integer> prod_id = new ArrayList<>();
        List<Integer> quantity= new ArrayList<>();
        for(int i=0;i<details.size();i++)
        {
            if(details.get(i).getOrder_id()==order_id)
            {
                prod_id.add(details.get(i).getProduct_id());
                quantity.add(details.get(i).getQuantity());
            }
        }
        List<Products> all_products= Data.getInstance().getProduct();
       List<Products> order_products=new ArrayList<>();

        for(int i=0;i<all_products.size();i++)
        {
            for(int j=0;j<prod_id.size();j++)
            {
                if(all_products.get(i).getId()==prod_id.get(j))
                {
                    Products p = new Products();
                    p.setPrice(all_products.get(i).getPrice());
                    p.setName(all_products.get(i).getName());
                    order_products.add(p);
                }
            }
        }
        String []final_Order_details=new String[order_products.size()];
        for(int i=0;i<order_products.size();i++)
        {
            final_Order_details[i]=order_products.get(i).getName()+"   quantity: "+quantity.get(i)+" Kg "+
                    "   price: "+order_products.get(i).getPrice()+" $";
        }
        jList3.setModel(new DefaultComboBoxModel<>(final_Order_details));

    }//GEN-LAST:event_jList2MouseClicked

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
            java.util.logging.Logger.getLogger(Customers_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers_Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
