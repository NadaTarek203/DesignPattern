
package grocery_shop;

import java.util.List;
import javax.swing.JOptionPane;

public class Purchase extends javax.swing.JFrame {

   
    public Purchase() { //facade
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DoneButton = new javax.swing.JButton();
        Number = new javax.swing.JTextField();
        CardName = new javax.swing.JTextField();
        Cvc = new javax.swing.JTextField();
        Edata = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(248, 248, 248));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Card Number:");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 106, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("CVC:");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 188, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Holder Name");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 273, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Expired Date");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 365, -1, 22));

        DoneButton.setBackground(new java.awt.Color(248, 248, 248));
        DoneButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        DoneButton.setText("Done");
        DoneButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 423, 174, 58));

        Number.setBackground(new java.awt.Color(248, 248, 248));
        Number.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberActionPerformed(evt);
            }
        });
        getContentPane().add(Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 96, 255, 45));

        CardName.setBackground(new java.awt.Color(248, 248, 248));
        CardName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(CardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 263, 255, 45));

        Cvc.setBackground(new java.awt.Color(248, 248, 248));
        Cvc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CvcActionPerformed(evt);
            }
        });
        getContentPane().add(Cvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 178, 255, 45));

        Edata.setBackground(new java.awt.Color(248, 248, 248));
        Edata.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Edata, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 354, 255, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1020, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberActionPerformed

    private void CvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CvcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CvcActionPerformed

    private void DoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseClicked
       Order_Details o=new Order_Details();
        o.setProd_name(ProductsView.prod_name);
        o.setProduct_id(ProductsView.prod_id);
        creditcard c=new creditcard();
        c.setCard_number(Integer.parseInt(Number.getText()));
        CreateOrder(o,c);
    }//GEN-LAST:event_DoneButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }
    public  boolean CreateOrder(Order_Details order,creditcard cardNum)
   {
       List<Order_Details>cart;
       List<Products> prod;
       List<creditcard>Cards;
       cart=Data.getInstance().getOrder_details();
       prod=Data.getInstance().getProduct();
       Cards=Data.getInstance().getCreditCard();
       CheckStock Stock=new CheckStock();
       CheckCreditCard check=new CheckCreditCard();
       boolean Purchased=true;
       boolean isAvailable=true;
       boolean isCorrect=true;
       
       isCorrect=check.CheckCredit(Integer.parseInt(Number.getText()), login.cust_id);
           
      
       for(int i=0;i<cart.size();i++)
       {
       isAvailable= Stock.CheckStockAvailability(cart.get(i).getProduct_id(), cart.get(i).getQuantity());
    
       if(isAvailable==true)
       {
           System.err.println("YourItem Is Available");
           int id=ProductsView.prod_id;
           int q= prod.get(id).getQuantity() ;
           //q -= cart.get(i).getQuantity();
           prod.get(id).setQuantity(q);
           //System.out.println(prod.get(id).getQuantity() );
           if(isCorrect==true)
           {
               JOptionPane.showMessageDialog(this, "Order Confirmed");
               break;
           }
           else
           {
                JOptionPane.showMessageDialog(this, "Invalid Data");
           }
          
       }    
       else{
           JOptionPane.showMessageDialog(this, "Your Item is Un Available");
       }
       
       }
       if(isAvailable==true && isCorrect==true)
       {
           Purchased=true;
       }
       else{
           Purchased=false;
       }
       return Purchased;
      
   }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CardName;
    private javax.swing.JTextField Cvc;
    private javax.swing.JButton DoneButton;
    private javax.swing.JTextField Edata;
    private javax.swing.JTextField Number;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
