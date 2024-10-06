package tuan3bai4;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng của lớp SINHVIEN
        SINHVIEN sv = new SINHVIEN();

        // Nhập thông tin sinh viên và điểm
        sv.nhapSinhVien();

        // Xuất thông tin sinh viên
        System.out.println("Thong tin sinh vien:");
        sv.xuatSinhVien();

        // Ví dụ sử dụng các phương thức setter và getter
        // Lấy thông tin sinh viên qua getter
        String maSV = sv.getMaSinhVien();
        String hoTen = sv.getHoTen();
        String lop = sv.getLop();
        double diemMon1 = sv.getDiemMon1();
        double diemMon2 = sv.getDiemMon2();
        double diemMon3 = sv.getDiemMon3();

        // Hiển thị thông tin từ getter
        System.out.println("\nLay thong tin sinh vien qua getter:");
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Diem mon 1: " + diemMon1);
        System.out.println("Diem mon 2: " + diemMon2);
        System.out.println("Diem mon 3: " + diemMon3);

        // Thay đổi điểm môn 1 qua setter
        sv.setDiemMon1(8.5); // Thay đổi điểm môn 1
        System.out.println("\nDiem mon 1 sau khi thay doi: " + sv.getDiemMon1());
        sv.xuatSinhVien();
    }
}
