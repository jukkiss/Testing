import java.util.List;
import java.util.ArrayList;

public class Library {

    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " is added to library.");
    }

    public void removeBook(String book) {
        if (books.remove(book)) {
        System.out.println(book + " has removed from library"); }
        else {
            System.out.println("Book not found.");
        }
    }
    public List<String> listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\nBooks in the library:");
            for (String book : books) {
                System.out.println(book);
            }
        }
        return null;
    }



}
