class CircleClass {
    private double radius;

    public CircleClass(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 3.14 * 2 * radius;
    }
}
public class Circle {
    public static void main(String[] args) {
        CircleClass c = new CircleClass(7);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
