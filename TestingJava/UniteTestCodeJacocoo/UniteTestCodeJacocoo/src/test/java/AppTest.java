import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import java.util.List;

public class AppTest {

    @Test
    public void testAddAndListBooks() {
        App library = new App();
        library.addBook("The Great Gatsby");
        List<String> books = library.listBooks();
        assertEquals("There should be 1 book in the library",1, books.size());
        assertEquals("The Great Gatsby", books.get(0), "The Great Gatsby");
    }

    @Test
    public void testRemoveBook() {
        App library = new App();
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.listBooks();
        assertEquals("There should be no books in the library",0, books.size());
    }
}
