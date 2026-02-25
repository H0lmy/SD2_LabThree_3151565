public class Circle extends Shape {
    private double radius;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getRadius() > 0 ? Math.PI * radius * radius: 0;
    }
    @Override
    public double getPerimeter() {
        return getRadius() > 0 ? 2 * Math.PI * radius: 0;
    }

    @Override
    public String toString() {
        return  super.toString() + " Radius: " + radius;
    }



}
