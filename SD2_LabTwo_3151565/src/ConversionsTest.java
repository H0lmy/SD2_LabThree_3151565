// Maksym Shtymak 3151565

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
    public void euroToDollarFractionalValue() {
        double result = c.euroToDollar(1.50);
        assertEquals(1.65, result, 0.001);
    }


    @Test
    public void dollarToEuroDefaultValue() {
        double result = c.dollarToEuro(100);
        assertEquals(90, result, 0.001);
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

    @Test
    public void dollarToEuroFractionalValue() {
        double result = c.dollarToEuro(1.50);
        assertEquals(1.35, result, 0.001);
    }


    @Test
    public void stringToIntegerDefaultValue() {
        int result = c.stringToInteger("100");
        assertEquals(100, result);
    }

    @Test
    public void stringToIntegerNullValue() {
        int result = c.stringToInteger(null);
        assertEquals(0, result);
    }

    @Test
    public void stringToIntegerEmptyValue() {
        int result = c.stringToInteger("");
        assertEquals(0, result);
    }

    @Test
    public void stringToIntegerNegativeValue() {
        int result = c.stringToInteger("-50");
        assertEquals(-50, result);
    }

    @Test
    public void stringToIntegerInvalidValue() {
        assertThrows(NumberFormatException.class, () -> c.stringToInteger("abc"));
    }

    @Test
    public void integerToStringDefaultValue() {
        String result = c.integerToString(100);
        assertEquals("100", result);
    }

    @Test
    public void integerToStringZeroValue() {
        String result = c.integerToString(0);
        assertEquals("0", result);
    }

    @Test
    public void integerToStringNegativeValue() {
        String result = c.integerToString(-100);
        assertEquals("-100", result);
    }


    @Test
    public void switchCaseLowercaseValue() {
        String val = "default";
        String result = c.switchCase(val);
        assertEquals("DEFAULT", result);
    }

    @Test
    public void switchCaseUppercaseValue() {
        String val = "DEFAULT";
        String result = c.switchCase(val);
        assertEquals("default", result);
    }

    @Test
    public void switchCaseMixedCaseValue() {
        String result = c.switchCase("HeLLo");
        assertEquals("hEllO", result);
    }

    @Test
    public void switchCaseWithNonLetterCharacters() {
        String result = c.switchCase("Hello 123!");
        assertEquals("hELLO 123!", result);
    }

    @Test
    public void switchCaseEmptyValue() {
        String result = c.switchCase("");
        assertEquals("", result);
    }

    @Test
    public void switchCaseNullValue() {
        String result = c.switchCase(null);
        assertNull(result);
    }


}
