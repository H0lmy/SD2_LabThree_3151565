import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestRhombus {
    private static Rhombus rhombus;
    @BeforeAll
    static void setup() {
        rhombus = new Rhombus(10, 5);
    }

    @Test
    public void testAreaWithPositiveSidesAndHeight() {
        rhombus.setSide(10);
        rhombus.setHeight(5);
        assertEquals(50, rhombus.getArea());
    }

    @Test
    public void testAreaWithNegativeSide() {
        rhombus.setSide(-10);
        rhombus.setHeight(5);
        assertEquals(0, rhombus.getArea());
    }

    @Test
    public void testAreaWithNegativeHeight() {
        rhombus.setSide(10);
        rhombus.setHeight(-5);
        assertEquals(0, rhombus.getArea());
    }

    @Test
    public void testAreaWithZeroSide() {
        rhombus.setSide(0);
        rhombus.setHeight(5);
        assertEquals(0, rhombus.getArea());
    }

    @Test
    public void testAreaWithZeroHeight() {
        rhombus.setSide(10);
        rhombus.setHeight(0);
        assertEquals(0, rhombus.getArea());
    }


    @Test
    public void testPerimeterWithPositiveSides() {
        rhombus.setSide(10);
        assertEquals(40, rhombus.getPerimeter());
    }

    @Test
    public void testPerimeterWithNegativeSide() {
        rhombus.setSide(-10);
        assertEquals(0, rhombus.getPerimeter());
    }

    @Test
    public void testPerimeterWithZeroSide() {
        rhombus.setSide(0);
        assertEquals(0, rhombus.getPerimeter());
    }
}
