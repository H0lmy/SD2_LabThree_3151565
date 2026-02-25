public class RightAngledTriangle extends Shape {
    private double hypotenuse;
    private double opposite;
    private double adjacent;

    public RightAngledTriangle(double hypotenuse, double opposite, double adjacent) {
        super("RightAngledTriangle");
        this.hypotenuse = hypotenuse;
        this.opposite = opposite;
        this.adjacent = adjacent;
    }

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
    @Override
    public double getArea() {
        if( getHypotenuse() > 0 && getOpposite() > 0 && getAdjacent() > 0 && getHypotenuse() > getOpposite() && getHypotenuse() > getAdjacent()) {
            return 0.5 * getOpposite() * getAdjacent();
        }else {
            return 0;
        }
    }
    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + " Hypotenuse: " + hypotenuse + " Opposite: " + opposite + " Adjacent: " + adjacent;
    }




}
