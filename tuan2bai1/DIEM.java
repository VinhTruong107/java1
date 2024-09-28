package tuan2bai1;
import java.util.Scanner;

public class DIEM { 
      private int x, y;

    // Constructor
    public DIEM() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public DIEM(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to input the coordinates of the point
    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        x = scanner.nextInt();
        System.out.print("Nhap toa do y: ");
        y = scanner.nextInt();
    }

    // Method to output the coordinates of the point
    public void xuatDiem() {
        System.out.println("Toa do diem: (" + x + ", " + y + ")");
    }

    // Method to move the point by dx and dy
    public void diChuyenDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
