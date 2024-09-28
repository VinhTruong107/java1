import java.util.Scanner;

class HinhTron {
    private double banKinh;

    // Constructor không tham số
    public HinhTron() {}

    // Constructor có tham số
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    // Phương thức nhập bán kính
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextDouble();
    }

    // Phương thức xuất bán kính và các thông tin khác
    public void xuatThongTin() {
        System.out.println("Ban kinh: " + banKinh);
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }

    // Phương thức tính diện tích hình tròn
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Phương thức tính chu vi hình tròn
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Phương thức get và set cho banKinh
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
}

public class HinhTronRun {
    public static void main(String[] args) {
        // Khởi tạo đối tượng HinhTron
        HinhTron hinhTron = new HinhTron();
        
        // Nhập bán kính
        hinhTron.nhapBanKinh();
        
        // Xuất thông tin hình tròn
        hinhTron.xuatThongTin();
    }
}


