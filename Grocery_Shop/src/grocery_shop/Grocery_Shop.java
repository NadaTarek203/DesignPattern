package grocery_shop;

public class Grocery_Shop {

    public static void main(String[] args) {
        int arr[]={1};

        Data d = Data.getInstance();

        d.setCat("fruits");
        d.setCat("vegetables");
        d.setCat("herbs");
        
      
        d.setShop_owner("mohamed22", "123");//0
        d.setShop_owner("hamed", "123");//1
        d.setShop_owner("mona", "123");//2
        d.setShop_owner("alaa", "123");
        
         d.setShop( "fruits shop", "cairo", 0, 0, "approved");
        d.setShop( "fruits shop 2", "alex", 1, 0, "approved");
        d.setShop( "vegs shop", "sharm", 2, 1, "approved");
        d.setShop( "vegs shop 2", "giza", 3, 1, "approved");
        d.setShop( "fruits shop 3", "cairo", 4, 0, "pending");
        
        d.setProduct( "Zucchini", 5, 15, 2);//0
        d.setProduct( "Okra", 3, 10, 2);//1
        d.setProduct( "apple", 2, 15, 0);//2
        d.setProduct( "orange", 5, 15, 0);//3
        d.setProduct( "herbs", 5, 5, 3);//4
        d.setProduct( "bananas", 5, 15, 1);//5
        d.setProduct( "pinaple", 5, 15, 1);//6
        d.setProduct( "tomato", 5, 7, 3);//7

        d.setCust("mariem", "123", "cairo");
        d.setCreditCard(1, 1, arr, "mariem", "xx/xx/xx");
        d.setCust("mohamed2", "123", "cairo");
        d.setCreditCard(2, 2, arr, "mohamed2", "xx/xx/xx");
        d.setCust("ali", "123", "cairo");
        d.setCreditCard(3, 123, arr, "ali", "xx/xx/xx");
        d.setCust("nora", "123", "cairo");
        d.setCreditCard(4, 122, arr, "nora", "xx/xx/xx");   
      



d.setCreditCard(1, 1, arr, "mariem", "xx/xx/xx");
d.setCreditCard(2, 2, arr, "mohamed2", "xx/xx/xx");
d.setCreditCard(3, 123, arr, "ali", "xx/xx/xx");
d.setCreditCard(4, 122, arr, "nora", "xx/xx/xx");

        
        d.setOrder( 0, 0,"placed");//0
        d.setOrder( 1, 1,"placed");//1
        d.setOrder( 2, 0,"pending");//2
        d.setOrder( 3, 2,"placed");//3
        d.setOrder( 3, 0,"placed");//4
      
      // setOrder_details(int quantity,int prod_id,String prodName,int prod_price)
        d.setOrder_details(5, 0,2,"apple", 5);//0 1
        d.setOrder_details(5, 0,3,"orange",2);//1 3
        
        d.setOrder_details(5, 1,5,"bananas", 2);//2 2
        d.setOrder_details(5, 1,6,"pinaple", 2);//2 2

        d.setOrder_details(5, 2,2,"apple", 2);//3 3
        d.setOrder_details(5, 2,3,"orange", 3);//4 1

        d.setOrder_details(5, 3,0,"kosa", 3);//5 1
        d.setOrder_details(5, 3,1,"bamia", 4);//6 1
        
        d.setOrder_details(5, 4,2,"apple", 5);//7 1

       /* d.setOrder_details(5, 3,"orange", 3);
        d.setOrder_details(5, 3,"orange", 6);
        d.setOrder_details(5, 3,"orange", 7);
        d.setOrder_details(5, 3,"orange", 1);
        d.setOrder_details(5, 3,"orange", 2);
        
         d.setOrder_details(5, 0, 2);//0 1
        d.setOrder_details(5, 0, 3);//1 3
        
        d.setOrder_details(5, 1, 5);//3 3 ///////placed////bananas pinaole
        d.setOrder_details(5, 1, 6);//4 1
        
        d.setOrder_details(5, 2, 3);//5 1
        d.setOrder_details(5, 2, 2);//6 1
        
        d.setOrder_details(5, 3, 0);
        d.setOrder_details(5, 3, 1);
        
        d.setOrder_details(5, 4, 2);
        */
        
       /* d.setOrder_details(5, 0, 2);//0 1
        d.setOrder_details(5, 0, 3);//1 3
        
        d.setOrder_details(5, 1, 5);//3 3 
        d.setOrder_details(5, 1, 6);//4 1
        
        d.setOrder_details(5, 2, 3);//5 1
        d.setOrder_details(5, 2, 2);//6 1
        
        d.setOrder_details(5, 3, 0);
        d.setOrder_details(5, 3, 1);
        
        d.setOrder_details(5, 4, 2);*/

        /*d.setShop( "fruits shop", "cairo", 1, 1, "pending");
        d.setShop( "fruits shop 2", "alex", 2, 1, "pending");
        d.setShop( "vegs shop", "sharm", 3, 2, "pending");
        d.setShop( "vegs shop 2", "giza", 4, 2, "pending");*/
      /*  d.setProductwithcat("kosa", 5, 15, 3, "veg");
        d.setProductwithcat("bamia", 3, 10, 3, "veg");
        d.setProductwithcat("apple", 2, 15, 0, "fruit");//mafrod dol 3nd awl wahed
        d.setProductwithcat("orange", 5, 15, 0, "fruit");
        d.setProductwithcat("herbs", 5, 5, 4, "herbs");
        d.setProductwithcat("kosa", 5, 15, 2, "fruit");
        d.setProductwithcat("bamia", 5, 15, 2, "fruit");
        d.setProductwithcat("tomato", 5, 7, 4, "veg");
        d.setCust("mareim", "123", "cairo");
        d.setCust("mohamed", "123", "cairo");
        d.setCust("ali", "123", "cairo");
        d.setCust("nora", "123", "cairo");*/

//for(int i=0;i<d.getCust().size();i++)
        //          System.out.println(d.getCust().get(i).getId());
        login c = new login();
        c.show();

        //System.out.println(d.getProduct().size());
    }

}
