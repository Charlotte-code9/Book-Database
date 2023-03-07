import java.util.HashMap;
import java.util.Map;

public class BookDatabase {
    private static BookDatabase instance;
    private Map<Integer, String> bookMap;
    private int bookId;

    private BookDatabase() {
        bookMap = new HashMap<>();
        bookId = 1;
    }

    public static BookDatabase getInstance() {
        if (instance == null) {
            instance = new BookDatabase();
        }
        return instance;
    }

    public void addBook(String name) {
        bookMap.put(bookId++, name);
    }

    public String removeBook(int id) {
        String bookName = bookMap.remove(id);
        return bookName;

    }

    public void viewBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
                System.out.println("Book (ID:"+ entry.getKey() + "): " + entry.getValue());
            }
        }
    }

}
