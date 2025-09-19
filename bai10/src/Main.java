
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QuanLyBienLai qlbl = new QuanLyBienLai();
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập số hộ sử dụng điện: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin hộ thứ " + (i + 1) + " ---");
            qlbl.nhapBienLai();
        }

        qlbl.hienThiTatCa();
    }
}