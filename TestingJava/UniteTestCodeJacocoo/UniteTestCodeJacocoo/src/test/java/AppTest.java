import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import java.util.List;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testAddAndListBooks() {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        List<String> books = library.listBooks();
        assertEquals(1, books.size());
        assertEquals("The Great Gatsby", books.get(0), "The Great Gatsby");
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.listBooks();
        assertEquals(0, books.size());
    }
}
