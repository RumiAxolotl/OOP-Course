import java.util.Scanner;

class Rectangle{
    double length;
    double width;

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    public double getArea () {
        return width * length ;
    }

    public double getPermeter() {
        return (width + length)*2;
    }

    public void display () {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPermeter());
    }
}

public class AreaPerimeter {
    public static void main(String[]args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.display();
    }
}
