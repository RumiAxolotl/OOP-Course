import java.util.Scanner;

class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class ArrayStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien muon in ra: ");

        int age, n;
        String name;
        n = sc.nextInt();

        Student2[] students = new Student2[n];
        for (int i = 0; i < n; i++) {
            name = sc.next();
            age = sc.nextInt();
            students[i] = new Student2(name, age);
        }

        for (int i = 0; i < n; i++) {
            students[i].display();
        }
    }
}
