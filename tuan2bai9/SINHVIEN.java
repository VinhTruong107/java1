package tuan2bai9;
import java.util.Scanner;

// Class SinhVien representing a student
class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;

    // Default constructor
    public SinhVien() {
        this.maSinhVien = "";
        this.hoTen = "";
        this.lop = "";
    }

    // Constructor with parameters
    public SinhVien(String maSinhVien, String hoTen, String lop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    // Method to input student information
    public void nhapSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap lop: ");
        lop = scanner.nextLine();
    }

    // Method to display student information
    public void xuatSinhVien() {
        System.out.println("Ma sinh vien: " + maSinhVien + ", Ho ten: " + hoTen + ", Lop: " + lop);
    }

    // Getter for maSinhVien
    public String getMaSinhVien() {
        return maSinhVien;
    }
}

