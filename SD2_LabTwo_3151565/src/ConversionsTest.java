import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ConversionsTest {
    private static Conversions c;
    @BeforeAll
    public static void setup() {
        c = new Conversions();
    }


    @Test
    public void euroToDollarDefaultValue() {
        double result = c.euroToDollar(100);
        assertEquals(110, result, 0.001);
    }

    @Test
    public void euroToDollarNegativeValue() {
        double result = c.euroToDollar(-100);
        assertEquals(0, result);
    }

    @Test
    public void euroToDollarZeroValue() {
        double result = c.euroToDollar(0);
        assertEquals(0, result);
    }


    @Test
    public void dollarToEuroDefaultValue() {
        double result = c.dollarToEuro(100);
        assertEquals(90.91, result);
    }

    @Test
    public void dollarToEuroNegativeValue() {
        double result = c.dollarToEuro(-100);
        assertEquals(0, result);
    }

    @Test
    public void dollarToEuroZeroValue() {
        double result = c.dollarToEuro(0);
        assertEquals(0, result);
    }




}
