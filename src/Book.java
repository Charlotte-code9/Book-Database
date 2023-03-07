import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDatabase bookDatabase = BookDatabase.getInstance();

        System.out.println("Before adding book:");
        System.out.println("LIST OF AVAILABLE BOOKS");
        System.out.println("========================================");
        bookDatabase.viewBooks();

        bookDatabase.addBook("The Lord of the Rings");
        bookDatabase.addBook("Catcher in the Rye");
        bookDatabase.addBook("Da Vinci Code");

        System.out.println("\nAfter adding book:");
        System.out.println("LIST OF AVAILABLE BOOKS");
        System.out.println("========================================");
        bookDatabase.viewBooks();
        System.out.println("========================================");


        int bookIdToRemove = 3;

        System.out.println("\nBook ID to remove: "+bookIdToRemove);
        String bookNameToRemove = bookDatabase.removeBook(bookIdToRemove);
        if (bookNameToRemove == null) {
            System.out.println("No book with ID " + bookIdToRemove + " found in the library.\n");
        } else {
            System.out.println("Removing................................");
            System.out.println("The " + bookNameToRemove + " book has been removed.\n");
        }


        System.out.println("UPDATED LIST OF AVAILABLE BOOKS");
        System.out.println("========================================");
        bookDatabase.viewBooks();
    }
}