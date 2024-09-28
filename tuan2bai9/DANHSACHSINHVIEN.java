package tuan2bai9;

    import java.util.ArrayList;
import java.util.Scanner;

// Class DanhSachSinhVien representing a list of students
class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSachSinhVien;

    // Constructor
    public DanhSachSinhVien() {
        danhSachSinhVien = new ArrayList<>();
    }

    // Method to add a new student to the list
    public void themSinhVien() {
        SinhVien sv = new SinhVien();
        sv.nhapSinhVien();
        danhSachSinhVien.add(sv);
        System.out.println("Them sinh vien thanh cong!");
    }

    // Method to print the student list
    public void inDanhSachSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
        } else {
            System.out.println("Danh sach sinh vien:");
            for (SinhVien sv : danhSachSinhVien) {
                sv.xuatSinhVien();
            }
        }
    }

    // Method to delete a student by ID
    public void xoaSinhVien(String maSinhVien) {
        boolean found = false;
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getMaSinhVien().equals(maSinhVien)) {
                danhSachSinhVien.remove(sv);
                System.out.println("Xoa sinh vien thanh cong!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ma sinh vien: " + maSinhVien);
        }
    }

    // Method to search for a student by ID
    public void timKiemSinhVien(String maSinhVien) {
        boolean found = false;
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getMaSinhVien().equals(maSinhVien)) {
                System.out.println("Thong tin sinh vien tim thay:");
                sv.xuatSinhVien();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ma sinh vien: " + maSinhVien);
        }
    }
}

