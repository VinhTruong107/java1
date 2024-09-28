package tuan2bai6;
public class Main {
    public static void main(String[] args) {
        // Create an object of SoNguyen
        SoNguyen so = new SoNguyen();

        // Input the integer value
        so.nhapSoNguyen();

        // Output the integer value
        so.xuatSoNguyen();

        // Check if the number is even or odd and display the result
        if (so.laSoChan()) {
            System.out.println("Day la so chan");
        } else {
            System.out.println("Day la so le");
        }
    }
}