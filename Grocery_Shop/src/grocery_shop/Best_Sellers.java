package grocery_shop;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Best_Sellers extends javax.swing.JFrame {

    public Best_Sellers() {
        initComponents();

        //awl haga ageb el shop bta3u
        int shop_id = -1;
        int owner_id = Loggedin_User.getInstance().getId();
        List<Shop> all_shops = Data.getInstance().getShop();
        for (int i = 0; i < all_shops.size(); i++) {
            if (all_shops.get(i).getOwner_id() == owner_id) {
                shop_id = all_shops.get(i).getId();
            }
        }
        ///////// getting orders placed by this shop 
        List<Orders> all_orders = Data.getInstance().getOrder();
        List<Orders> shop_orders = new ArrayList<>();
       boolean flag=false;

        for (int i = 0; i < all_orders.size(); i++) {
            if (all_orders.get(i).getShop_id() == shop_id && all_orders.get(i).getState().equals("placed")) {
                Orders o = new Orders();
                o.setId(all_orders.get(i).getId());
                o.setCust_id(all_orders.get(i).getCust_id());
                o.setShop_id(all_orders.get(i).getShop_id());
                o.setState("placed");
                 flag=true;

                shop_orders.add(o);
            }
        }
        if(!flag)
         JOptionPane.showMessageDialog(this, "shop has no orders");
        else
        {

       // System.out.println(shop_orders.size());

        ////////getting order details of these orders
        List<Order_Details> all_order_details = Data.getInstance().getOrder_details();
        List<Order_Details> details = new ArrayList<>();
        for (int i = 0; i < shop_orders.size(); i++) {
            for (int j = 0; j < all_order_details.size(); j++) {
                if (shop_orders.get(i).getId() == all_order_details.get(j).getOrder_id()) {
                    Order_Details o = new Order_Details();
                    o.setOrder_id(all_order_details.get(j).getOrder_id());
                    o.setProduct_id(all_order_details.get(j).getProduct_id());
                    o.setQuantity(all_order_details.get(j).getQuantity());
                    o.setProduct_id(all_order_details.get(j).getProduct_id());
                    o.setProd_name(all_order_details.get(j).getProd_name());
                    details.add(o);
                }
            }
        }
        for (int i = 0; i < details.size(); i++) {
            System.out.println(details.get(i).getProduct_id());
        }

        //////applying  frequeny array to get most frequent products
        int fre[] = new int[details.size()];
        int visited = -1;
        for (int i = 0; i < details.size(); i++) {
            int count = 1;
            if(i==details.size()){
            break;
            }
            for (int j = i + 1; j < details.size(); j++) {
                
                if (details.get(i).getProduct_id() == details.get(j).getProduct_id()) {
                    count++;
                    fre[j] = visited;
                }
                
            }
            if (fre[i] != visited) {
                fre[i] = count;
            }
        }
       /* for (int i = 0; i < details.size(); i++) {
            System.out.println(details.get(i).getProduct_id() + "   " + fre[i]);
        }*/

        List<Products> all_products = Data.getInstance().getProduct();
        int num_of_best_sellers = 0;
        for (int i = 0; i < all_products.size(); i++) {
            if (all_products.get(i).getShop_id() == shop_id) {
                num_of_best_sellers++;/////////////////number of products by this shop
            }
        }
        //System.out.println(num_of_best_sellers);

        int[] maxs_IDs = new int[num_of_best_sellers];
        int[] maxs_freq = new int[num_of_best_sellers];

////////////////////getting most frequent x products
        for (int k = 0; k < num_of_best_sellers; k++) {
            int maxind = 0;
            for (int i = 0; i < details.size(); i++) {
                if (fre[i] != visited) {
                    if (fre[i] >= fre[maxind]) {
                        maxind = i;
                    }
                }
            }
            maxs_IDs[k] = details.get(maxind).getProduct_id();///////////
            maxs_freq[k] = fre[maxind];
            fre[maxind] = -1;
        }

       /* for (int i = 0; i < maxs_IDs.length; i++) {
            System.out.println(maxs_IDs[i] + "  " + maxs_freq[i]);
        }*/

        /*int IDs[]=new int[maxs_IDs.length];
      for(int i=0;i<maxs_IDs.length;i++)
         IDs[i]= details.get(maxs_IDs[i]).getProduct_id();*/
        String[] prod_names = new String[num_of_best_sellers];
//////////////////converting products IDs to names
        for (int j = 0; j < num_of_best_sellers; j++) {
            for (int i = 0; i < all_products.size(); i++) {
                if (all_products.get(i).getId() == maxs_IDs[j]) {
                    prod_names[j] = "Name : " + all_products.get(i).getName() + "     Sold : " + maxs_freq[j];
                }
            }
        }
        jList1.setModel(new DefaultComboBoxModel<>(prod_names));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setBackground(new java.awt.Color(248, 248, 248));
        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 302, 440));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLabel1.setText("Best Seller Products");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 234, 22));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/nadafaid/Desktop/51125402135_1f84a49586_b.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 960, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Best_Sellers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
