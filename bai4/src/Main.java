//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh101 ql101 = new TuyenSinh101();
        Scanner sc101 = new Scanner(System.in);
        int chon101;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thí sinh");
            System.out.println("2. Hiển thị tất cả thí sinh");
            System.out.println("3. Tìm kiếm theo SBD");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon101 = sc101.nextInt();
            sc101.nextLine();

            switch (chon101) {
                case 1:
                    ql101.nhapThiSinh101();
                    break;
                case 2:
                    ql101.hienThiTatCa101();
                    break;
                case 3:
                    System.out.print("Nhập SBD cần tìm: ");
                    String sbd101 = sc101.nextLine();
                    ql101.timTheoSBD101(sbd101);
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
