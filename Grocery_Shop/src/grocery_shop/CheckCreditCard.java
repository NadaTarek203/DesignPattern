/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grocery_shop;

import java.util.List;

/**
 *
 * @author NADA
 */
public class CheckCreditCard {
      Data d=Data.getInstance();
      List<creditcard> Card=d.getCreditCard();
      List<Customer> cust=d.getCust();
      boolean CorrectID=false;
  
public boolean CheckCredit(int CardNumber,int CustID)
{
   
    for(int i=0;i<Card.size();i++){
    
     if(Card.get(i).getCard_number()==CardNumber)  
     {
        if(Card.get(i).getCust_id()==CustID)
        {
            CorrectID=true;
            break;
        }  
     }
    }
     return CorrectID;
    
}
}