// Maksym Shtymak 3151565
public abstract class Shape {
    private String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract methods for area and perimeter
    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape: " + name;
    }
}
