/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grocery_shop;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nadafaid
 */
public class register extends javax.swing.JFrame {

    Data d= Data.getInstance();
    /**
     * Creates new form register
     */
    public register() {
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

        usernamer = new javax.swing.JTextField();
        passwordr = new javax.swing.JTextField();
        addressr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registerbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernamer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamerActionPerformed(evt);
            }
        });
        getContentPane().add(usernamer, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 91, 369, 45));

        passwordr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordrActionPerformed(evt);
            }
        });
        getContentPane().add(passwordr, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 168, 374, 45));

        addressr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(addressr, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 255, 375, 45));

        jLabel1.setBackground(new java.awt.Color(248, 248, 248));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 103, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel2.setText("password");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel3.setText("address");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 267, -1, -1));

        registerbutton.setBackground(new java.awt.Color(248, 248, 248));
        registerbutton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        registerbutton.setText("Register");
        registerbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 347, 181, 47));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Register as a Shop Owner ");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Login");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 59, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1000, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamerActionPerformed

    private void registerbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbuttonMouseClicked
        // TODO add your handling code here:
        String username=usernamer.getText();
        String password =passwordr.getText();
        String address= addressr.getText();
        boolean flag=true;
        List<Customer> customers = d.getCust();
        for (int i=0 ;i<customers.size();i++)
        {
            if(username.equals(customers.get(i).getUsername()))
            {
                flag=false;
                JOptionPane.showMessageDialog(this,"this user name already taken");
                break;
            }
        }
       if(flag)
       {
           d.setCust(username, password, address);
           //ProductsView p = new ProductsView();
          // p.show();
          login l =new login();
          l.show();
       }
    }//GEN-LAST:event_registerbuttonMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Register_Owner r = new Register_Owner();
        r.show();
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        login l= new login();
        l.show();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void passwordrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordrActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField passwordr;
    private javax.swing.JButton registerbutton;
    private javax.swing.JTextField usernamer;
    // End of variables declaration//GEN-END:variables
}
