package bookstore.book;

public class InventoryManager {
    Book book;
    public InventoryManager(Book book){
        this.book = book;
    }
    public void addBook(int quantity){
        int addingAmount = book.getStockQuantity();
        updateStock(addingAmount);
        
    }
    public void removeBook(int quantity){
        int removingAmount = -book.getStockQuantity();
        updateStock(removingAmount);
    }
    private void updateStock(int quantity){
        int finalAmount = book.getStockQuantity() + quantity;
        book.setStockQuantity(finalAmount);
    }
}
