/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grocery_shop;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author nadafaid
 */
public class ProductsView extends javax.swing.JFrame {
Data d= Data.getInstance();
public static int prod_id,prod_quantity;
public static String prod_name;
int shop_id=getShopId();
Authentication auth= new Authentication ();

    /**
     * Creates new form ProductsView
     */
    public ProductsView() {
        initComponents();
        fillProducts();
        //fillPrices(); 
        //fillCategory();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        price = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list3 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        selecteditem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list1.setBackground(new java.awt.Color(248, 248, 248));
        list1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 94, 145, 331));

        price.setBackground(new java.awt.Color(248, 248, 248));
        jScrollPane2.setViewportView(price);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 94, 151, 337));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Product Name");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 58, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Price");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 58, -1, -1));

        list3.setBackground(new java.awt.Color(248, 248, 248));
        jScrollPane3.setViewportView(list3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 94, 151, 331));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("category");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 58, -1, -1));

        quantity.setBackground(new java.awt.Color(248, 248, 248));
        quantity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 578, 119, 32));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 581, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("kg");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 581, -1, -1));

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("Add to Cart");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 467, 632, 43));

        selecteditem.setBackground(new java.awt.Color(248, 248, 248));
        selecteditem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selecteditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecteditemActionPerformed(evt);
            }
        });
        getContentPane().add(selecteditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 520, 119, 32));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 870, -1, -1));

        id.setBackground(new java.awt.Color(248, 248, 248));
        id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 467, 119, 32));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setText("selected item");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 523, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 470, -1, -1));

        jButton2.setBackground(new java.awt.Color(248, 248, 248));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setText("My Cart");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 6, 154, 46));

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecteditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecteditemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecteditemActionPerformed

    private void list1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list1ValueChanged
        // TODO add your handling code here:
        
        String ss = list1.getSelectedValue();
        String[] arr= ss.split(" ");
        selecteditem.setText(arr[1]);
        id.setText(arr[0]);
        
        
    }//GEN-LAST:event_list1ValueChanged

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        List<Orders>all_orders=Data.getInstance().getOrder();
         int order_id=-1;
        for(int i=0;i<all_orders.size();i++)
            if(all_orders.get(i).getShop_id()==shop_id && all_orders.get(i).getCust_id()==login.cust_id)
                 order_id=all_orders.get(i).getId();
        prod_id=Integer.parseInt(id.getText().toString()) ;
        
        
        prod_quantity=Integer.parseInt(quantity.getText().toString());
       
        prod_name=selecteditem.getText();
        
        if(auth.verified()){
       d.setOrder(login.cust_id, shop_id,"pending");
        
        d.setOrder_details(prod_quantity,order_id,prod_id,prod_name,getPrice(prod_id));
        List<Orders>test2 = d.getOrder();
        
        List<Order_Details> test= d.getOrder_details();
        JOptionPane.showMessageDialog(this, "added successfully");
        }else{
        JOptionPane.showMessageDialog(this, "addition to cart failed");}
        
      
        
        
        
        
        //proxy 

      /*  if(auth.verified()){
        d.setOrder(login.cust_id, shop_id);
        
        d.setOrder_details(prod_quantity,prod_id,prod_name,getPrice(prod_id));
        List<Orders>test2 = d.getOrder();
        
        List<Order_Details> test= d.getOrder_details();
        JOptionPane.showMessageDialog(this, "added successfully");
       }else{
        JOptionPane.showMessageDialog(this, "you must login first");
        }*/
      //CartView c= new CartView();
      
      //c.show();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        CartView c = new CartView();
        c.show();
    }//GEN-LAST:event_jButton2MouseClicked

    public int getShopId(){
        int shop_id=-1;
    List<Products> prod= new ArrayList();
    prod=d.getProduct();
    for(int i=0 ;i<prod.size();i++){
        if(prod_id==prod.get(i).getId()){
            shop_id=prod.get(i).getShop_id();
        }
    }
    return shop_id;
    }
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
            java.util.logging.Logger.getLogger(ProductsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsView().setVisible(true);
            }
        });
    }
             public void test(){
        
        
        }
    public void fillProducts(){
    
        List<Products> data = d.getProduct();
        int[] prod= new int[data.size()];
        String[] prod1= new String[data.size()];
        String[] prod2= new String[data.size()];
        String[] prices= new String[data.size()];
        String[] cat= new String[data.size()];
        
        System.out.println("Selected shop id in products  "+shopView.selected_shop_id);
        for(int i=0; i<data.size(); i++)
        {
            
            if(data.get(i).getShop_id()==shopView.selected_shop_id){
            prices[i]= data.get(i).getPrice()+" LE";
            cat[i]= data.get(i).getCategory();
            prod[i]= data.get(i).getId();
            prod1[i]= data.get(i).getName();
            prod2[i]= prod[i]+" "+prod1[i];}
            
                    
        }
        list1.setModel(new DefaultComboBoxModel<>(prod2));
        price.setModel(new DefaultComboBoxModel<>(prices));
        list3.setModel(new DefaultComboBoxModel<>(cat));
        
    }
   /* public void fillPrices(){
        
        List<String>store=new ArrayList<String>();
       
        List<Products> data = d.getProduct();
        
        for(int i=0;i<data.size();i++){
        store.add(data.get(i).getName());
        }
        String[] prod= new String[store.size()];
        for(int i=0; i<store.size(); i++)
        {
            prod[i]= data.get(i).getPrice()+" LE";
                    
        }
        price.setModel(new DefaultComboBoxModel<>(prod));
    }
    */
    public int getPrice(int id){
    
       int pr=0;
        List<Products> data = d.getProduct();
        for(int i=0; i<data.size(); i++)
        {
            if(data.get(i).getId()==id){
            pr=data.get(i).getPrice();
            break;
            }
                    
        }
    return pr;
    
    }
    /*public void fillCategory(){
    
        List<String>store=new ArrayList<String>();
       
        List<Products> data = d.getProduct();
        
        for(int i=0;i<data.size();i++){
        store.add(data.get(i).getName());
        }
        String[] prod= new String[store.size()];
       
        for(int i=0; i<store.size(); i++)
        {
            prod[i]= data.get(i).getCategory();
            
        }
        list3.setModel(new DefaultComboBoxModel<>(prod));
        
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> list1;
    private javax.swing.JList<String> list3;
    private javax.swing.JList<String> price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField selecteditem;
    // End of variables declaration//GEN-END:variables
}