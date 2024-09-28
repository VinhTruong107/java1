package tuan2bai2;
public class Main {
    public static void main(String[] args) {
        // Creating an object of HINHCHUNHAT
        HINHCHUNHAT hcn = new HINHCHUNHAT();

        // Input the rectangle's dimensions
        hcn.nhapHinhChuNhat();

        // Output the rectangle's dimensions
        hcn.xuatHinhChuNhat();

        // Calculate and output the area
        System.out.println("Dien tich hinh chu nhat : " + hcn.tinhDienTich());

        // Calculate and output the perimeter
        System.out.println("Chu vi hinh chu nhat: " + hcn.tinhChuVi());
    }
}