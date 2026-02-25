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
       return 0;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return  super.toString() + " Radius: " + radius;
    }



}
