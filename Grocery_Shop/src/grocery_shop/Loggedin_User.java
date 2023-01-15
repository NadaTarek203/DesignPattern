
package grocery_shop;


public class Loggedin_User {
    private int id=-1;
    private String username;
    private String pass;
    private String address;

    private Loggedin_User() {
    }
    
    private static Loggedin_User user;
    public static Loggedin_User getInstance()
    {
        if(user==null)
            user= new Loggedin_User();
        return user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
