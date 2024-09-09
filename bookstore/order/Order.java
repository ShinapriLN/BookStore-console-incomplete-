package bookstore.order;
import java.util.List;

import bookstore.book.Book;
import bookstore.customer.Customer;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Book> books;
    private int totalAmount;
    Order(){
        
    }
}
