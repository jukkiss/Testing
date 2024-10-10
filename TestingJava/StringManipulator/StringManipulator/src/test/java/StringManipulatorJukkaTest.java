import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringManipulatorJukkaTest {

    private StringManipulatorJukka manipulator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After");
    }

    @Before
    public void setUp() {
        manipulator = new StringManipulatorJukka(); // Initialize before each test
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void testReverse() {
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, manipulator.reverse(input));
        System.out.println("Reverse method");
    }

    @Test
    public void testCapitalize() {
        String input = "hello";
        String expected = "Hello";
        assertEquals(expected, manipulator.capitalize(input));
        System.out.println("Capitalize method");
    }
}
