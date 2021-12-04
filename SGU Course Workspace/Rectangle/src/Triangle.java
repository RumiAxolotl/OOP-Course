import java.util.Date;

public class Triangle extends Geometric {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, boolean filled, Date dateCreated) {
        super(color, filled, dateCreated);
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(String color, boolean filled, Date dateCreated, double side1, double side2, double side3) {
        super(color, filled, dateCreated);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double HalPerimeter = getPerimeter() / 2;
        return Math.sqrt(HalPerimeter * (HalPerimeter - side1) * (HalPerimeter - side2) * (HalPerimeter - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "} " + super.toString();
    }
}
