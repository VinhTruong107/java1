package tuan2bai4;

public class Main {
    public static void main(String[] args) {
        // Create an object of SINHVIEN
        SINHVIEN sv = new SINHVIEN();

        // Input student details and grades
        sv.nhapSinhVien();

        // Output student details, average score, and classification
        sv.xuatSinhVien();
    }
}