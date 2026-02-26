// Maksym Shtymak 3151565
public class Rhombus extends Shape {
    // basic variables
    private double side;
    private double height;

    // constructor
    public Rhombus(double side, double height) {
        super("Rhombus");
        this.side = side;
        this.height = height;
    }

    // getters and setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //methods for area and perimeter which are adjusted to particular figure
    @Override
    public double getArea() {
        return getSide() > 0 && getHeight() > 0 ? side * height : 0;
    }

    @Override
    public double getPerimeter() {
        return getSide() > 0 ? 4 * side : 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Side: " + side + " Height: " + height;
    }
}
