
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhieuBaoHanh {
    Scanner sc=new Scanner(System.in);
    static int dem=1;
    private int stt;
    private String maPBH;
    private String maKH;
    private String diachiBH;
    private String thoihanBH;
    private String tinhtrangBH;
    public PhieuBaoHanh()
    {
        stt=dem++;
        maPBH=null;
        maKH=null;
        diachiBH=null;
        thoihanBH=null;
        tinhtrangBH=null;
    }

    public String getMaPBH() 
    {
        return maPBH;
    }

    public void setMaPBH(String maPBH) 
    {
        this.maPBH = maPBH;
    }

    public String getMaKH() 
    {
        return maKH;
    }

    public void setMaKH(String maKH) 
    {
        this.maKH = maKH;
    }

    public String getDiachiBH() 
    {
        return diachiBH;
    }

    public void setDiachiBH(String diachiBH) 
    {
        this.diachiBH = diachiBH;
    }

    public String getThoihanBH() 
    {
        
        return thoihanBH;
    }

    public void setThoihanBH(String thoihanBH) 
    {
        this.thoihanBH = thoihanBH;
    }

    public String getTinhtrangBH() 
    {
        return tinhtrangBH;
    }

    public void setTinhtrangBH(String tinhtrangBH) 
    {
        this.tinhtrangBH = tinhtrangBH;
    }

    
    public void nhapPBH()
    {
        Matcher c;
        do
        {
            System.out.println("Nhap ma phieu bao hanh: ");
            maPBH=sc.nextLine();
            String check="^PBH[0-9]{2}$"; 
            Pattern a= Pattern.compile(check);
            c= a.matcher(maPBH);
        }
        while(c.find()==false);
        
        do
        {
            System.out.println("Nhap ma khach hang: ");
            maKH=sc.nextLine();
            String check="^KH[0-9]{2}$";
            Pattern a= Pattern.compile(check);
            c= a.matcher(maKH);
        }
        while(c.find()==false);
        
        System.out.println("Nhap dia chi bao hanh: ");
        diachiBH=sc.nextLine();
        
        do{
            System.out.println("Thoi gian bao hanh: ");
            thoihanBH=sc.nextLine();
            String check="^[0-9]+\\s+years$";
            Pattern b = Pattern.compile(check);
            c = b.matcher(thoihanBH);
        }
        while(c.find()==false);
        
        System.out.println("Nhap tinh trang bao hanh: ");
        tinhtrangBH=sc.nextLine();
        
    }
    public void xuatPBH()
    {
        System.out.printf("%-10s %-20s %-15s %-30s %-20s %-20s\n"
        ,stt,maPBH,maKH,diachiBH,thoihanBH,tinhtrangBH);
    }
    public void xuly(String a)
    {
        String []chrt=a.split(";");
        maPBH=chrt[0];
        maKH=chrt[1];
        diachiBH=chrt[2];
        thoihanBH=chrt[3];
        tinhtrangBH=chrt[4];
    }
    public String xylyLuu()
    {
        return maPBH+";"+maKH+";"+diachiBH+";"+thoihanBH+";"+tinhtrangBH+"\n";
    }
}
