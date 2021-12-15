import java.util.Calendar;
import java.util.Scanner;

public class dsHocSinh {
    private Hoctap[] hs;
    private int n;

    public void input() {
        System.out.print("Xin moi nhap vo so luong ptu trong danh sach: ");
        n = Integer.parseInt(new Scanner(System.in).nextLine());
        hs = new Hoctap[n];

        System.out.println("\n======================================================================================");
        System.out.println("Nhap thong tin cua Hoc sinh !");
        for(int i=0;i<n;i++) {
            hs[i] = new Hoctap();
            hs[i].input();
        }
    }

    public void output() {
        System.out.println("\nDanh Sach Hoc Sinh");
        System.out.format("%-15s %-10s %-15s %-10s %-10s %-10s %-10s",
                "HoTen", "Tuoi", "QueQuan", "Diem", "Lop", "KhoaHoc", "HocKi");
        System.out.println("\n======================================================================================");
        for(Hoctap i : hs) {
            i.output();
        }
    }

    public int getYearofBirth(int age) {
        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
        return CurrentYear - age;
    }

    public void count() {
        int count = 0;
        for(int i=0;i<n;i++) {
            if(hs[i].getQueQuanTTCN().equals("Nghe An") && getYearofBirth(hs[i].getAgeTTCN()) == 1986) count++;
        }
        System.out.printf("\nSo luong hoc sinh co que Quan o Nghe an va co nam sinh 1986: %d\n", count);
    }

    public void search() {
        int count = 0;
        boolean check = false;
        Hoctap[] temp = new Hoctap[100];
        System.out.println("\nDanh Sach Hoc Sinh Sinh Nam 1986");
        System.out.format("%-15s %-10s %-15s %-10s %-10s %-10s %-10s",
                "HoTen", "Tuoi", "QueQuan", "Diem", "Lop", "KhoaHoc", "HocKi");
        System.out.println("\n======================================================================================");

        for(int i=0;i<n;i++) {
            if(getYearofBirth(hs[i].getAgeTTCN()) == 1986) {
                temp[count] = hs[i];
                temp[count].output();
                check = true;
                count++;
            }
        }
        if(!check) System.out.println("Khong co hoc sinh nao sinh nam 1986 !");
    }


    public void sort() {
        System.out.println("\nDanh Sach Hoc Sinh Theo Diem Giam Dan");
        System.out.format("%-15s %-10s %-15s %-10s %-10s %-10s %-10s",
                "HoTen", "Tuoi", "QueQuan", "Diem", "Lop", "KhoaHoc", "HocKi");
        System.out.println("\n======================================================================================");
        // bubble sort
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(hs[j].getDiemTTCN() < hs[j+1].getDiemTTCN()) {
                    Hoctap temp = hs[j];
                    hs[j] = hs[j+1];
                    hs[j+1] = temp;

                }
            }
        }

        // in ra màn hình
        for(Hoctap i : hs) {
            i.output();
        }
    }

    public static void main(String[] args) {
        dsHocSinh dshs = new dsHocSinh();
        dshs.input(); // Nhập vào 1 danh sách gồm n học sinh (n nhập từ bàn phím)
        dshs.output(); // Hiển thị danh sách các học sinh đã nhập
        dshs.search(); // Tìm xem có học sinh nào sinh 1986 hay không? Nếu có hiện các thông tin của học sinh đó.
        // Nếu không hiện thông báo không có
        dshs.count(); // Cho biết có bao nhiêu học sinh sinh năm 1985 và có quê ở Nghệ An.
        dshs.sort(); // Sắp xếp danh sách theo chiều giảm dần của điểm
    }
}
