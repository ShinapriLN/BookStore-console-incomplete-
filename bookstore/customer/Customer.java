package bookstore.customer;
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String address;
    public Customer(int customerId, String name, String email, String address){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    //getter
    public int getCustomerId(){
        return this.customerId;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }
    //setter
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
