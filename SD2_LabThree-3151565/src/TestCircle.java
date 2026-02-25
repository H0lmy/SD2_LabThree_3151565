import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCircle {
    private static Circle circle;
    @BeforeAll
    static void setup() {
        circle = new Circle( 10);
    }

    @Test
    public void testAreaWithPositiveRadius() {
       assertEquals(314, circle.getArea());
    }

    @Test
    public void testAreaWithNegativeRadius() {
        assertEquals(0, circle.getArea());
    }

    @Test
    public void testAreaWithZeroRadius() {
        assertEquals(0, circle.getArea());
    }
    @Test
    public void testPerimeterWithPositiveRadius() {
        assertEquals(62.8, circle.getArea());
    }

    @Test
    public void testPerimeterWithNegativeRadius() {
        assertEquals(0, circle.getArea());
    }

    @Test
    public void testPerimeterWithZeroRadius() {
        assertEquals(0, circle.getArea());
    }
}
