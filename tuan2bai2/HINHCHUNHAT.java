package tuan2bai2;

import java.util.Scanner;

public class HINHCHUNHAT {
     private double chieuDai, chieuRong;

    // Constructor
    public HINHCHUNHAT() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    // Constructor with parameters
    public HINHCHUNHAT(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Method to input the dimensions of the rectangle
    public void nhapHinhChuNhat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieuRong = scanner.nextDouble();
    }

    // Method to output the dimensions of the rectangle
    public void xuatHinhChuNhat() {
        System.out.println("Chieu dai " + chieuDai + ", Chieu rong: " + chieuRong);
    }

    // Method to calculate the area of the rectangle
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Method to calculate the perimeter of the rectangle
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}
