import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceCalculatorTest {

    @Test
    public void testCalculateDistance() {
        double result = DistanceCalculator.calculateDistance(0, 0, 3, 4);
        assertEquals(5.0, result, 0.001);
    }
}