package tuan2bai4;

import java.util.Scanner;

public class SINHVIEN {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private double diemMon1, diemMon2, diemMon3;

    // Default constructor
    public SINHVIEN() {
        this.maSinhVien = "";
        this.hoTen = "";
        this.lop = "";
        this.diemMon1 = 0;
        this.diemMon2 = 0;
        this.diemMon3 = 0;
    }

    // Constructor with parameters
    public SINHVIEN(String maSinhVien, String hoTen, String lop, double diemMon1, double diemMon2, double diemMon3) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    // Method to input student information and grades
    public void nhapSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap lop: ");
        lop = scanner.nextLine();
        System.out.print("Nhap diem mon 1: ");
        diemMon1 = scanner.nextDouble();
        System.out.print("Nhap diem mon 2: ");
        diemMon2 = scanner.nextDouble();
        System.out.print("Nhap diem mon 3: ");
        diemMon3 = scanner.nextDouble();
    }

    // Method to output student information and grades
    public void xuatSinhVien() {
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Diem mon 1: " + diemMon1);
        System.out.println("Diem mon 2: " + diemMon2);
        System.out.println("Diem mon 3: " + diemMon3);
        System.out.println("Diem trung binh: " + tinhDiemTrungBinh());
        System.out.println("Xep loai: " + xepLoai());
    }

    // Method to calculate the average score
    public double tinhDiemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3) / 3;
    }

    // Method to classify students based on average score
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
}
