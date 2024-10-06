package tuan3bai3;

import java.util.Scanner;

public class HinhTron {
     private double banKinh;

    // Constructor không tham số
    public HinhTron() {
        this.banKinh = 0;
    }

    // Constructor có tham số
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    // Getter và Setter cho bán kính
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Phương thức nhập dữ liệu
    public void nhapBanKinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        this.banKinh = scanner.nextDouble();
    }

    // Phương thức xuất thông tin
    public void xuatThongTin() {
        System.out.println("Bán kính: " + this.banKinh);
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return Math.PI * this.banKinh * this.banKinh;
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * Math.PI * this.banKinh;
    }
}
