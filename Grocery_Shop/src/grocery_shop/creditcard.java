package grocery_shop;

 

/**
*
* @author nadafaid
*/
public class creditcard {
    private int creditcardid;
    private int cust_id;
    private int card_number;
    private int[] cvc = new int[3];
    private String cardholdername;
    private String expirationdate;

 

    public creditcard() {
    }

 

    public creditcard(int creditcardid, int cust_id,int cardNumber, String cardholdername, String expirationdate) {
        this.creditcardid=creditcardid;
        this.cust_id = cust_id;
        this.card_number=cardNumber;
        this.cardholdername = cardholdername;
        this.expirationdate = expirationdate;
    }

    public int getCreditcardid() {
        return creditcardid;
    }

    public void setCreditcardid(int creditcardid) {
        this.creditcardid = creditcardid;
    }

    public int getCust_id() {
        return cust_id;
    }

 

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }
    public int getCard_number() {
        return card_number;
    }
    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

 

    public int[] getCvc() {
        return cvc;
    }

 

    public void setCvc(int[] cvc) {
        this.cvc = cvc;
    }

 

    public String getCardholdername() {
        return cardholdername;
    }

 

    public void setCardholdername(String cardholdername) {
        this.cardholdername = cardholdername;
    }

 

    public String getExpirationdate() {
        return expirationdate;
    }

 

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }


}