package tuan3bai2;

import java.util.Scanner;

public class HinhChuNhat {
     private double chieuDai;
    private double chieuRong;

    // Constructor không tham số
    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    // Constructor có tham số
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Getter và Setter cho chiều dài và chiều rộng
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // Phương thức nhập dữ liệu
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        this.chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        this.chieuRong = scanner.nextDouble();
    }

    // Phương thức xuất thông tin
    public void xuatThongTin() {
        System.out.println("Chiều dài: " + this.chieuDai);
        System.out.println("Chiều rộng: " + this.chieuRong);
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * (this.chieuDai + this.chieuRong);
    }
}
