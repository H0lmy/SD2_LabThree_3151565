import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ConversionsTest {
    private static Conversions c;
    @BeforeAll
    public static void setup() {
        c = new Conversions();
    }


    @Test
    public void euroToDollarDefaultValue() {
        double result = c.euroToDollar(100);
        assert(result==110);
    }

    @Test
    public void euroToDollarNegativeValue() {
        double result = c.euroToDollar(-100);
        assert(result==0);
    }

    @Test
    public void euroToDollarZeroValue() {
        double result = c.euroToDollar(0);
        assert(result==0);
    }


}
