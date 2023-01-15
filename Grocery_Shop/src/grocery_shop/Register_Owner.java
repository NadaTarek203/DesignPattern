/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grocery_shop;

import java.util.List;
import javax.swing.DefaultComboBoxModel;


public class Register_Owner extends javax.swing.JFrame {

   
    public Register_Owner() {
        initComponents();
        
        List<Category> categories =Data.getInstance().getCat();
        String[] cat_names=new String[categories.size()];
        for(int i=0;i<categories.size();i++)
            cat_names[i]=categories.get(i).getCategoryname();
        jComboBox1.setModel(new DefaultComboBoxModel<>(cat_names));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 67, 288, 40));

        jTextField2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 206, 288, 40));

        jTextField3.setBackground(new java.awt.Color(248, 248, 248));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 67, 296, 40));

        jTextField4.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 206, 296, 40));

        jComboBox1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 348, 279, 40));

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("Join");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 464, 190, 54));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 42, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel2.setText("Password");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 175, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel3.setText("Shop Name");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 42, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel4.setText("Shop Address");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 175, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel5.setText("Shop Category");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 311, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1030, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        String pass =jTextField2.getText();
        Data.getInstance().setShop_owner(name, pass);
        List <Shop_Owner> owner =Data.getInstance().getShop_owner();
       // for(int i=0;i<owner.size();i++)
        //{
          //  System.out.println(owner.get(0).getName());
       // }
        int id=-1;
        for(int i=0;i<owner.size();i++)
        {
            if(owner.get(i).getName().equals(name)&&owner.get(i).getPass().equals(pass))
            {
                id=owner.get(i).getId();
            }
        }
        int cat_num = jComboBox1.getSelectedIndex();
        Data.getInstance().setShop(jTextField3.getText(), jTextField4.getText(),id , cat_num,"pending" );
          //  System.out.println(id);
            login l = new login();
            l.show();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
