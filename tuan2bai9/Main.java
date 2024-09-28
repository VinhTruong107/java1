package tuan2bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachSinhVien danhSach = new DanhSachSinhVien();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Xoa sinh vien theo ma");
            System.out.println("4. Tim sinh vien theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (luaChon) {
                case 1:
                    danhSach.themSinhVien();
                    break;
                case 2:
                    danhSach.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String maXoa = scanner.nextLine();
                    danhSach.xoaSinhVien(maXoa);
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String maTim = scanner.nextLine();
                    danhSach.timKiemSinhVien(maTim);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (luaChon != 0);
    }
}
