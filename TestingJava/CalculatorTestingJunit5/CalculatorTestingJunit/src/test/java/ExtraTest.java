
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.fail;

import laskin.Laskin;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExtraTest extends AbstractParent {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos(), "Nollaus ei onnistunut");
    }

    @ParameterizedTest(name = "Luvun {0} neliö on {1}")
    @CsvSource({ "2, 4", "4, 16", "5, 25" })
    public void testNelio(double luku, double tulos) {
        laskin.nelio(luku);
        assertEquals(tulos, laskin.annaTulos(), "Neliöön korotus ei nyt kyllä skulaa");
    }

    @ParameterizedTest(name = "Luvun {0} neliöjuuri on {1}")
    @CsvSource({ "2, 1.414", "4, 2", "9, 3" })
    public void testNeliojuuri(double luku, double tulos) {
        laskin.neliojuuri(luku);
        assertEquals(tulos, laskin.annaTulos(), DELTA, "Neliöjuuri ei toimi oikein");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        IllegalArgumentException poikkeus = assertThrows(IllegalArgumentException.class, () -> laskin.neliojuuri(-1));
        assertEquals("Negative value", poikkeus.getMessage(), "Negatiivisen luvun neliöjuuri ei toimi oikein");
    }
}