public class Rhombus extends Shape {
    private double side;
    private double height;

    public Rhombus(double side, double height) {
        super("Rhombus");
        this.side = side;
        this.height = height;
    }

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
    @Override
    public double getArea() {
        return getSide() > 0 && getHeight() > 0 ? side * height: 0;
    }
    @Override
    public double getPerimeter() {
        return getSide() > 0 ? 4 * side: 0;
    }
    @Override
    public String toString() {
        return super.toString() + " Side: " + side + " Height: " + height;
    }
}
