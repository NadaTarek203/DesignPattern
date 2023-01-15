package grocery_shop;

import java.util.List;

public class Admin {
   Data data = Data.getInstance();
   
   
   public void addCategory(String Cat_name){
       data.setCat(Cat_name);
   }
   
   public void editCategory(int index, String old_name, String new_name){
        data.getCat().get(index).setCategoryname(new_name);
   }
   
   public List<Orders> viewTransactions(){     
       return data.getOrder();
   }
   
   public List<Shop> getShops(){
       return data.getShop();
   }
   
   public void removeShop(int index){
        data.getShop().remove(index);
   }
   
   public void acceptShops(int index){
       data.getShop().get(index).setState("approved");
   }
 }
