import java.util.Scanner;

public class EntryVehicle {
    public static void Menu() {
        System.out.println("1. Nhap thong tin");
        System.out.println("2. Xuat ra bang thong ke");
        System.out.println("3. Thoat chuong trinh");
    }

    public static void main(String[] args) {
        System.out.print("Nhap so luong doi tuong: ");
        int num = new Scanner(System.in).nextInt();
        Vehicle[] arr = new Vehicle[num];

        int choiceNumber;

        while(true) {
            Menu();
            do {
                System.out.print("Nhap lua chon: 1 / 2 / 3: ");
                choiceNumber = Integer.parseInt(new Scanner(System.in).nextLine());
            }while(choiceNumber < 1 || choiceNumber > 3);

            switch(choiceNumber) {
                case 1:
                    System.out.println("Nhap thong tin !");
                    for(int i=0;i<num;i++) {
                        arr[i] = new Vehicle();
                        arr[i].input();
                    }
                    break;

                case 2:
                    String st = String.format("%-25s%-20s%10s%15s%15s%15s", "Ten chu xe","Loai xe","Dung tich",
                            "Tri gia","Thue phai nop", "TongTien");
                    System.out.println(st);
                    for(Vehicle i : arr) {
                        i.output();
                    }
                    break;

                case 3:
                    System.out.println("Ban da chon thoat chuong trinh !");
                    System.exit(0);
                    break;
            }
        }
    }
}
