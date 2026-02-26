// Maksym Shtymak 3151565

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TestShapeList {
    private static ArrayList<Shape> shapes;

    // initialize the arraylist with different shapes before testing
    @BeforeAll
    static void setup() {
        shapes = new ArrayList<>();
        // Two Circle instances
        shapes.add(new Circle(5));
        shapes.add(new Circle(10));
        // Two Rhombus instances
        shapes.add(new Rhombus(6, 4));
        shapes.add(new Rhombus(10, 5));
        // Two RightAngledTriangle instances
        shapes.add(new RightAngledTriangle(5, 3, 4));
        shapes.add(new RightAngledTriangle(10, 6, 8));
    }

    @Test
    public void testGetAreaForAllShapes() {
        // expected areas for each shape in the arraylist
        double[] expectedAreas = {
                Math.PI * 5 * 5,
                Math.PI * 10 * 10,
                6 * 4,
                10 * 5,
                0.5 * 3 * 4,
                0.5 * 6 * 8
        };
        for (int i = 0; i < shapes.size(); i++) {
            assertEquals(expectedAreas[i], shapes.get(i).getArea(), 0.01);

        }
    }

    @Test
    public void testGetPerimeterForAllShapes() {
        // expected perimeters for each shape in the arraylist
        double[] expectedPerimeters = {
                2 * Math.PI * 5,
                2 * Math.PI * 10,
                4 * 6,
                4 * 10,
                5 + 3 + 4,
                10 + 6 + 8
        };
        for (int i = 0; i < shapes.size(); i++) {
            assertEquals(expectedPerimeters[i], shapes.get(i).getPerimeter(), 0.01);

        }
    }
}
