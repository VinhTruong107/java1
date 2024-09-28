package tuan2bai6;
import java.util.Scanner;


    // Class SoNguyen representing an integer
    class SoNguyen {
        private int giaTri;
    
        // Default constructor
        public SoNguyen() {
            this.giaTri = 0;
        }
    
        // Constructor with parameter
        public SoNguyen(int giaTri) {
            this.giaTri = giaTri;
        }
    
        // Method to input the integer value
        public void nhapSoNguyen() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap gia tri so nguyen: ");
            giaTri = scanner.nextInt();
        }
    
        // Method to output the integer value
        public void xuatSoNguyen() {
            System.out.println("Gia tri so nguyen: " + giaTri);
        }
    
        // Method to check if the integer is even
        public boolean laSoChan() {
            return giaTri % 2 == 0;
        }
    
        // Method to check if the integer is odd
        public boolean laSoLe() {
            return giaTri % 2 != 0;
        }
    }
    