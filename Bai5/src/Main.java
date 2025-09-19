//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class Main {
    public static void main(String[] args) {
        KhuPho101 kp101 = new KhuPho101();
        Scanner sc101 = new Scanner(System.in);
        int chon101;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thông tin các hộ dân");
            System.out.println("2. Hiển thị toàn bộ hộ dân");
            System.out.println("3. Hiển thị hộ có người 80 tuổi");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon101 = sc101.nextInt();
            sc101.nextLine();

            switch (chon101) {
                case 1:
                    kp101.nhapDanhSach101();
                    break;
                case 2:
                    kp101.hienThiTatCa101();
                    break;
                case 3:
                    kp101.hienThiNguoi80Tuoi101();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon101 != 0);
    }
}