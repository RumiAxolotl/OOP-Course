interface IShapeClass {
    double getArea();
    double getPerimeter();
}

public class IShape {
    public static void main(String[] args) {
        IShapeClass[] shapes = new IShapeClass[3];
        shapes[0] = new RectangleClass(3.4, 5.3);
        shapes[1] = new CircleClass(5.5);
        shapes[2] = new RectangleClass(7.4, 4.3);
        for (int i = 0; i < 3; i++) {
            System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
        }
    }
}

