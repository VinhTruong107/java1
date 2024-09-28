import java.util.Scanner;

class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    // Constructor khong tham so
    public SinhVien() {}

    // Constructor co tham so
    public SinhVien(String maSinhVien, String hoTen, String lop, double diemMon1, double diemMon2, double diemMon3) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    // Phuong thuc nhap thong tin sinh vien
    public void nhapThongTinSinhVien() {
        Scanner sc = new Scanner(System.in);
    
        try {
            System.out.print("Nhap ma sinh vien: ");
            maSinhVien = sc.nextLine();
            
            System.out.print("Nhap ho ten sinh vien: ");
            hoTen = sc.nextLine();
            
            System.out.print("Nhap lop: ");
            lop = sc.nextLine();
            
            System.out.print("Nhap diem mon 1: ");
            diemMon1 = sc.nextDouble();
            
            System.out.print("Nhap diem mon 2: ");
            diemMon2 = sc.nextDouble();
            
            System.out.print("Nhap diem mon 3: ");
            diemMon3 = sc.nextDouble();
        } finally {
            // Dam bao dong Scanner sau khi su dung
            sc.close();
        }
    }
    

    // Phuong thuc xuat thong tin sinh vien
    public void xuatThongTinSinhVien() {
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Diem mon 1: " + diemMon1);
        System.out.println("Diem mon 2: " + diemMon2);
        System.out.println("Diem mon 3: " + diemMon3);
        System.out.println("Diem trung binh: " + tinhDiemTrungBinh());
        System.out.println("Xep loai: " + xepLoai());
    }

    // Phuong thuc tinh diem trung binh
    public double tinhDiemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3) / 3;
    }

    // Phuong thuc xep loai sinh vien
    public String xepLoai() {
        double diemTB = tinhDiemTrungBinh();
        if (diemTB >= 8) {
            return "Gioi";
        } else if (diemTB >= 6.5) {
            return "Kha";
        } else if (diemTB >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    // Cac phuong thuc get va set
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(double diemMon3) {
        this.diemMon3 = diemMon3;
    }
}

public class SinhVienRun {
    public static void main(String[] args) {
        // Khoi tao doi tuong SinhVien
        SinhVien sinhVien = new SinhVien();
        
        // Nhap thong tin sinh vien
        sinhVien.nhapThongTinSinhVien();
        
        // Xuat thong tin sinh vien
        sinhVien.xuatThongTinSinhVien();
    }
}


