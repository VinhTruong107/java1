package tuan2bai3;

import java.util.Scanner;

public class HINHTRON {
    
 private double banKinh;

    // Constructor
    public HINHTRON() {
        this.banKinh = 0;
    }

    // Constructor with parameters
    public HINHTRON(double banKinh) {
        this.banKinh = banKinh;
    }

    // Method to input the radius of the circle
    public void nhapHinhTron() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = scanner.nextDouble();
    }

    // Method to output the radius of the circle
    public void xuatHinhTron() {
        System.out.println("Ban kinh hinh tron: " + banKinh);
    }

    // Method to calculate the area of the circle
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Method to calculate the perimeter of the circle
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}

