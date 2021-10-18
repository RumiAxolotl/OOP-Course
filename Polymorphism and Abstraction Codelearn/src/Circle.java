class CircleClass implements IShapeClass{
    private double radius;

    public CircleClass(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
