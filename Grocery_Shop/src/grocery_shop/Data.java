
package grocery_shop;
import java.util.*;
public class Data {
    
    private List<Customer> cust= new ArrayList<>();
    private List<Category> cat = new ArrayList<>();
    private List<Products> product= new ArrayList<>();
    private List<Shop> shop= new ArrayList<>();
    private List<Orders> order= new ArrayList<>();
    private List<Shop_Owner> shop_owner= new ArrayList<>();
    private List<Order_Details> order_details= new ArrayList<>();
    private List<creditcard>creditcard= new ArrayList<>();
    private int cust_id=0;
    private int cat_id=0;
    private int prod_id=0;
    private int shop_id=0;
    private int order_id=0;
    private int shop_owner_id=0;
    private int creditcardid=0;
    int CopyCustId=0;
    
    
    

    private Data() 
    {}
    private static Data d;
    public static Data getInstance()
    {
        if(d==null)
        {d=new Data();
        }
        return d;
    }
    public void setCreditCard(int cust_id, int card_number, int[] cvc, String cardholdername, String expirationdate)
    { creditcard card = new creditcard();
      card.setCreditcardid(creditcardid++);
      card.setCard_number(card_number);
      card.setCust_id(CopyCustId);
      card.setCvc(cvc);
      card.setCardholdername(cardholdername);
      card.setExpirationdate(expirationdate);
      this.creditcard.add(card);
    }
    
     public List<creditcard> getCreditCard() {
        return creditcard;
    }
    
     
    public  void setCust(String name,String pass,String address) {
         Customer customer=new Customer();
         CopyCustId=cust_id;
         customer.setId(cust_id);
         customer.setUsername(name);
         customer.setPass(pass);
         customer.setAddress(address);
         cust_id++;
         this.cust.add(customer); //add to customer arraylist
    }
     
    

 

    
    public List<Customer> getCust() { //return the whole list
        return cust;
    }

   public  List<Category> getCat() {
        return cat;
    }
    public  void setCat( String cat_name) {
         Category cat=new Category();
         cat.setId(cat_id++);
         cat.setCategoryname(cat_name);
        this.cat.add(cat) ;
    }

    public List<Products> getProduct() {
        return product;
    }
    public void setProduct(String name,int quantity,int price ,int shop_id) {
        
         Products prod=new Products();
         prod.setId(prod_id++);
         prod.setName(name);
         prod.setPrice(price);
         prod.setQuantity(quantity);
         prod.setShop_id(shop_id);
        this.product.add(prod);
    }
     public void setProductwithcat(String name,int quantity,int price ,int shop_id, String category) {
        
         Products prod=new Products();
         prod.setId(prod_id++);
         prod.setName(name);
         prod.setPrice(price);
         prod.setQuantity(quantity);
         prod.setShop_id(shop_id);
         prod.setCategory(category);
        this.product.add(prod);
    }
     
     

    public List<Shop> getShop() {
        return shop;
    }

    public void setShop(String name,String address,int owner_id,int cat_id,String state) {
        
        Shop shop=new Shop();
         shop.setId(shop_id++);
         shop.setName(name);
         shop.setAddress(address);
         shop.setCat_id(cat_id);
         shop.setOwner_id(owner_id);
         shop.setState(state);
        this.shop.add(shop);
    }

    public List<Orders> getOrder() {
        return order;
    }
    

    public void setOrder(int cust_id,int shop_id,String state) {
        order_id++;
        Orders order=new Orders();
         order.setId(order_id);
         order.setCust_id(cust_id);
         order.setShop_id(shop_id);
         order.setState(state);
         this.order.add(order);
    }

    public List<Shop_Owner> getShop_owner() {
        return shop_owner;
    }

    public void setShop_owner( String name,String pass) {
        
        Shop_Owner shop_owner  =new Shop_Owner();
         shop_owner.setId(shop_owner_id++);
         shop_owner.setName(name);
         shop_owner.setPass(pass);
        this.shop_owner .add(shop_owner) ;
    }

    public List<Order_Details> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(int quantity,int order_id,int prod_id,String prodName,int prod_price)
    {
        Order_Details order_details   =new Order_Details();
         order_details.setQuantity(quantity);
         order_details.setOrder_id(order_id);
         order_details.setProduct_id(prod_id);
         order_details.setProd_name(prodName);
         order_details.setProd_price(prod_price);
        this.order_details.add(order_details);
        
    }
   
    
    
    public void Update_order(List<Orders> order){
      this.order=order;
    }
     public void Update_orderDetails(List<Order_Details> order_details){
      this.order_details=order_details;
    }
    
}
