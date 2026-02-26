// Maksym Shtymak 3151565
public class RightAngledTriangle extends Shape {
    //basic variables
    private double hypotenuse;
    private double opposite;
    private double adjacent;

    //constructor
    public RightAngledTriangle(double hypotenuse, double opposite, double adjacent) {
        super("RightAngledTriangle");
        this.hypotenuse = hypotenuse;
        this.opposite = opposite;
        this.adjacent = adjacent;
    }

    //getters and setters
    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getOpposite() {
        return opposite;
    }

    public void setOpposite(double opposite) {
        this.opposite = opposite;
    }

    public double getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(double adjacent) {
        this.adjacent = adjacent;
    }

    //methods for area and perimeter which are adjusted to particular figure
    @Override
    public double getArea() {
        if (getHypotenuse() > 0 && getOpposite() > 0 && getAdjacent() > 0 && getHypotenuse() > getOpposite() && getHypotenuse() > getAdjacent()) {
            return 0.5 * getOpposite() * getAdjacent();
        } else {
            return 0;
        }
    }

    @Override
    public double getPerimeter() {
        if (getHypotenuse() > 0 && getOpposite() > 0 && getAdjacent() > 0 && getHypotenuse() > getOpposite() && getHypotenuse() > getAdjacent()) {
            return getHypotenuse() + getOpposite() + getAdjacent();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Hypotenuse: " + hypotenuse + " Opposite: " + opposite + " Adjacent: " + adjacent;
    }


}
