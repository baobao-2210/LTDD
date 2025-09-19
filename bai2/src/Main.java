import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QLCB101 ql101 = new QLCB101();
        Scanner sc101 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập cán bộ mới");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị toàn bộ danh sách");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            int chon101 = Integer.parseInt(sc101.nextLine());

            switch (chon101) {
                case 1:
                    ql101.nhapCanBo101();
                    break;
                case 2:
                    System.out.print("Nhập tên cần tìm: ");
                    String ten101 = sc101.nextLine();
                    ql101.timKiemTheoTen101(ten101);
                    break;
                case 3:
                    ql101.hienThiDanhSach101();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}