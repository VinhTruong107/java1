package tuan2bai1;
public class Main {
    public static void main(String[] args) {
        // Creating an object of DIEM
        DIEM diem = new DIEM();

        // Input the point coordinates
        diem.nhapDiem();

        // Output the point coordinates
        diem.xuatDiem();

        // Move the point by a given dx, dy
        diem.diChuyenDiem(5, 10);

        // Output the new point coordinates after moving
        System.out.println("Sau khi di chuyển:");
        diem.xuatDiem();
    }
}
