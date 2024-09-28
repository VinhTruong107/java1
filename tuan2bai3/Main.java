package tuan2bai3;

public class Main {
    public static void main(String[] args) {
        // Creating an object of HINHTRON
        HINHTRON hinhTron = new HINHTRON();

        // Input the circle's radius
        hinhTron.nhapHinhTron();

        // Output the circle's radius
        hinhTron.xuatHinhTron();

        // Calculate and output the area
        System.out.println("Dien tich hinh tron: " + hinhTron.tinhDienTich());

        // Calculate and output the perimeter
        System.out.println("Chu vi hinh tron: " + hinhTron.tinhChuVi());
    }
}