package bookstore.book;
public class Book{
    private String title;
    private String author;
    private String ISBN;
    private int price;
    private int stockQuantity;
    public Book(String title, String author, String ISBN, int price, int stockQuantity){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    //getter
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public int getPrice(){
        return this.price;
    }
    public int getStockQuantity(){
        return this.stockQuantity;
    }

    //setter
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setStockQuantity(int stockQuantity){
        this.stockQuantity = stockQuantity;
    }
}