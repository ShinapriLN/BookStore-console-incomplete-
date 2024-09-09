package bookstore.customer;

import bookstore.order.Discountable;

public class SpecialCustomer extends Customer implements Discountable {
    public SpecialCustomer(int customerId, String name, String email, String address) {
        super(customerId, name, email, address);
        //TODO Auto-generated constructor stub
    }

    public void applyDiscount(double amount){

    }
}
