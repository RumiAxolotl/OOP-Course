class RectangleClass implements IShapeClass{
    private double length;
    private double width;

    public RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
}
