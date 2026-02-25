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
        circle.setRadius(10);
       assertEquals(314, Math.round(circle.getArea()));
    }

    @Test
    public void testAreaWithNegativeRadius() {
        circle.setRadius(-10);
        assertEquals(0, circle.getArea());
    }

    @Test
    public void testAreaWithZeroRadius() {
        circle.setRadius(0);
        assertEquals(0, circle.getArea());
    }
    @Test
    public void testPerimeterWithPositiveRadius() {
        circle.setRadius(10);
        assertEquals(62.8, circle.getPerimeter());
    }

    @Test
    public void testPerimeterWithNegativeRadius() {
        circle.setRadius(-10);
        assertEquals(0, circle.getPerimeter());
    }

    @Test
    public void testPerimeterWithZeroRadius() {
        circle.setRadius(0);
        assertEquals(0, circle.getPerimeter());
    }
}
