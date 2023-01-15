/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grocery_shop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NADA
 */

public class CheckStock {
    
   
    Data d=Data.getInstance();
    List<Products> prod=d.getProduct();
    boolean inStock=false;
    public boolean CheckStockAvailability(int ItemID,int Quantity)
    {
        System.out.println("d5l hna bardo");
        if(Quantity<=prod.get(ItemID).getQuantity()){
            inStock=true;
        }
        else
            inStock=false;
        return inStock;
    }
}
