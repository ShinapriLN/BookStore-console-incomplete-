import bookstore.book.Book;
import bookstore.book.InventoryManager;
import bookstore.customer.*;

import java.util.ArrayList;
import java.util.Scanner;

class controlFlow {
    ArrayList<Book> books;

    controlFlow(String input, ArrayList<Book> books) {
        this.books = books;
        switch (input) {
            case "1":
                listBooks(books);
                break;
            case "2":
                profileSetting();
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("resource")
    void listBooks(ArrayList<Book> books) {
        int temp = 1;
        int input;
        System.out.println("*****************************************");
        System.out.println("Our available book now!");
        for (Book book : books) {
            System.out.println(String.format("%d. %s", temp, book.getTitle()));
            System.out.println(String.format("  Author: %s Price: %d.", book.getAuthor(), book.getPrice()));
            temp++;
        }
        System.out.println("*****************************************");
        System.out.println("0. Back");
        System.out.print(">: ");//(new Scanner(System.in)).nextLine()
        input = Integer.parseInt((new Scanner(System.in)).nextLine());
        if(input == 0){
            System.out.println("This condition");
        }else if(input > books.size()){
            System.out.println("There is no such a book!!\nPlease choose another...");
            listBooks(books);
        }else{
            if(books.get(input-1).getStockQuantity() != 0){
                Book buyingBook = books.get(input-1);
                InventoryManager manager = new InventoryManager(buyingBook);
                manager.removeBook(1);
                System.out.println("*****************************************");
                System.out.println(String.format("You have bought %s wrote by %s in price %d", buyingBook.getTitle(), buyingBook.getAuthor(), buyingBook.getPrice()));
                System.out.println("1: Continue to buy");
                System.out.println("0: Back to menu");
                System.out.println("*****************************************");
                input = Integer.parseInt((new Scanner(System.in)).nextLine());
                switch (input) {
                    case 0:
                        Main main = new Main();
                        Main.main(null);
                        break;
                    case 1:
                        listBooks(books);
                        break;
                    default:
                        Main.main(null);
                        break;
                }
            }else{
                System.out.println("The book is out of stock!!\nPlease choose another...");
                listBooks(books);
            }
        }
    }
    void profileSetting(){
        int input;
        System.out.println("*****************************************");
        System.out.println("Profile setting");
        System.out.println("Hello %s what do you want to change?");
        System.out.println("    1. Name:");
        System.out.println("    2. Email:");
        System.out.println("    3. Address:");
        System.out.println("*****************************************");
        System.out.print(">:");
        input = Integer.parseInt((new Scanner(System.in)).nextLine());
        switch (input) {
            case 1:
                System.out.println("*****************************************");
                System.out.println("Changing name > Type your new name");
                System.out.println("new name > ");
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        
            default:
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(0, "Charlie", "charlie@mail.co", "553 Eden st. Mountdriver");
        SpecialCustomer c2 = new SpecialCustomer(1, "Tennyson", "tennesy@test.th", "Mount Toronto");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Hamtayo", "Peter John", "1024", 299, 26));
        books.add(new Book("Fight! Masamune", "Robert Scheme", "4302", 325, 43));
        books.add(new Book("How can I be there", "Mark Robinson", "4329", 195, 73));

        String input;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select from menu:");
        System.out.println("    1. Order books:");
        System.out.println("    2. Profile setting:");
        System.out.print(">:");
        input = scanner.nextLine();
        new controlFlow(input, books);

    }
}
