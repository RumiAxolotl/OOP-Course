import java.util.Scanner;

public class Btap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 chu: ");

        String input = sc.nextLine();
        char c = input.toLowerCase().charAt(0);
        int number = 0 ;

        // kiem tra ch co phai la chu hay ko
        if(Character.isLetter(c)) {
            if (c >= 'w'){
                number = 9;
            } else if (c >= 't'){
                number = 8;
            } else if (c >= 'p'){
                number = 7;
            } else if (c >= 'm'){
                number = 6;
            } else if (c >= 'j'){
                number = 5;
            } else if (c >= 'g'){
                number = 4;
            } else if (c >= 'd'){
                number = 3;
            } else if (c >= 'a'){
                number = 2;
            }
            System.out.println("Chuyen ra man hinh: " + number);
        }else {
            System.out.println("error");
        }
    }
}
