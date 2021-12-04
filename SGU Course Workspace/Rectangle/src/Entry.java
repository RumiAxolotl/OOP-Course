import java.util.Date;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Date date = new Date();

//        Triangle tri1 = new Triangle("red", true, date);
//        System.out.println(tri1);

        Triangle tri2 = new Triangle("red", true, date, 3, 3, 3);
        System.out.println(tri2);
        System.out.println(tri2.getPerimeter());
        System.out.println(tri2.getArea());


//        tri2.setColor("blue");
//        System.out.println(tri2);
    }
}
