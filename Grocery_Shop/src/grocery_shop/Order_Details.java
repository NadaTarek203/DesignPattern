
package grocery_shop;

public class Order_Details {
  
    private String prod_name;
   private int quantity;
   private int order_id;
    private int product_id;
    private int prod_price;
    
    
 public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
    public Order_Details() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int id) {
        this.quantity = id;
    }

    public int getProd_price() {
        return prod_price;
    }

    public void setProd_price(int prod_price) {
        this.prod_price = prod_price;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    
}
