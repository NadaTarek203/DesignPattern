package grocery_shop;

import java.util.List;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public static int cust_id = -1;
    public static int owner_id = -1;
    public static String User_name = null;
    public static String User_password = null;
    public static int Oid;

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernamef = new javax.swing.JTextField();
        passwordf = new javax.swing.JTextField();
        loginbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernamef.setBackground(new java.awt.Color(248, 248, 248));
        usernamef.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(usernamef, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 85, 343, 44));

        passwordf.setBackground(new java.awt.Color(248, 248, 248));
        passwordf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(passwordf, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 173, 343, 43));

        loginbutton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbuttonMouseClicked(evt);
            }
        });
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, 60));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 97, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 173, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel4.setText("Password");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 185, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1020, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void loginbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbuttonMouseClicked
        User_name = null;
        User_password = null;
        boolean flag = false;

        String username = usernamef.getText();
        String password = passwordf.getText();
        if(username.equals("admin") && password.equals("123"))
        {

            Admin_Powers a =new Admin_Powers();
            a.show();
            return;
        }
        System.out.println(username + password);
        if(username.equals("admin") && password.equals("123"))
        {
                            flag = true;

            Admin_Powers a =new Admin_Powers();
            a.show();
        }
        
        List<Customer> customers = Data.getInstance().getCust();
        for (int i = 0; i < customers.size(); i++) {
            if (username.equals(customers.get(i).getUsername())) {
                flag = true;
            }
            if (username.equals(customers.get(i).getUsername()) && password.equals(customers.get(i).getPass())) {
                cust_id = customers.get(i).getId();
                User_name = customers.get(i).getUsername();
                User_password = customers.get(i).getPass();

            }
        }
        if (flag) {
            ProxyCustomer c = new ProxyCustomer();
            c.show();
            return;
        }
        List<Shop_Owner> all_owners = Data.getInstance().getShop_owner();
        for (int i = 0; i < all_owners.size(); i++) {
            if ((all_owners.get(i).getName().equals(username))
                    && (all_owners.get(i).getPass().equals(password))) {
                User_name = all_owners.get(i).getName();
                User_password = all_owners.get(i).getPass();
                Oid = all_owners.get(i).getId();

            }
        }
        ProxyOwner o = new ProxyOwner();
        o.show();
        return;
    }//GEN-LAST:event_loginbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginbutton;
    private javax.swing.JTextField passwordf;
    private javax.swing.JTextField usernamef;
    // End of variables declaration//GEN-END:variables
}
