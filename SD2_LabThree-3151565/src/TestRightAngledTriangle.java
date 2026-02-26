// Maksym Shtymak 3151565

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestRightAngledTriangle {
    // initialize the right angled triangle before  testing
    private static RightAngledTriangle rightAngledTriangle;

    @BeforeAll
    static void setup() {
        rightAngledTriangle = new RightAngledTriangle(5, 3, 4);
    }

    @Test
    public void testAreaWithPositiveSides() {
        rightAngledTriangle.setOpposite(5);
        rightAngledTriangle.setAdjacent(3);
        rightAngledTriangle.setHypotenuse(8);
        assertEquals(7.5, rightAngledTriangle.getArea());
    }

    @Test
    public void testAreaWithNegativeSide() {
        rightAngledTriangle.setOpposite(-5);
        rightAngledTriangle.setAdjacent(3);
        rightAngledTriangle.setHypotenuse(8);
        assertEquals(0, rightAngledTriangle.getArea());
    }

    @Test
    public void testAreaWithZeroSide() {
        rightAngledTriangle.setOpposite(0);
        rightAngledTriangle.setAdjacent(3);
        rightAngledTriangle.setHypotenuse(8);
        assertEquals(0, rightAngledTriangle.getArea());
    }

    @Test
    public void testAreaWithSideGreaterThanHypotenuse() {
        rightAngledTriangle.setHypotenuse(5);
        rightAngledTriangle.setOpposite(6);
        rightAngledTriangle.setAdjacent(4);
        assertEquals(0, rightAngledTriangle.getArea());
    }

    @Test
    public void testPerimeterWithPositiveSides() {
        rightAngledTriangle.setHypotenuse(5);
        rightAngledTriangle.setOpposite(3);
        rightAngledTriangle.setAdjacent(4);
        assertEquals(12, rightAngledTriangle.getPerimeter());
    }

    @Test
    public void testPerimeterWithNegativeSide() {
        rightAngledTriangle.setHypotenuse(-5);
        rightAngledTriangle.setOpposite(3);
        rightAngledTriangle.setAdjacent(4);
        assertEquals(0, rightAngledTriangle.getPerimeter());
    }

    @Test
    public void testPerimeterWithZeroSide() {
        rightAngledTriangle.setHypotenuse(0);
        rightAngledTriangle.setOpposite(3);
        rightAngledTriangle.setAdjacent(4);
        assertEquals(0, rightAngledTriangle.getPerimeter());
    }

    @Test
    public void testPerimeterWithSideGreaterThanHypotenuse() {
        rightAngledTriangle.setHypotenuse(5);
        rightAngledTriangle.setOpposite(6);
        rightAngledTriangle.setAdjacent(4);
        assertEquals(0, rightAngledTriangle.getPerimeter());
    }

    @Test
    public void testToString() {
        rightAngledTriangle.setHypotenuse(5);
        rightAngledTriangle.setOpposite(3);
        rightAngledTriangle.setAdjacent(4);
        assertEquals("Shape: RightAngledTriangle Hypotenuse: 5.0 Opposite: 3.0 Adjacent: 4.0", rightAngledTriangle.toString());
    }


}
