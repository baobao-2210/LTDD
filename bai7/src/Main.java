import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHS101 qlhs101 = new QuanLyHS101();
        Scanner sc101 = new Scanner(System.in);
        int chon101;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập học sinh mới");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Hiển thị HS sinh năm 1985 và quê Thái Nguyên");
            System.out.println("4. Hiển thị HS lớp 10A1");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon101 = sc101.nextInt();
            sc101.nextLine();

            switch (chon101) {
                case 1:
                    qlhs101.nhapHS101();
                    break;
                case 2:
                    qlhs101.hienThiTatCa101();
                    break;
                case 3:
                    qlhs101.hienThi1985ThaiNguyen101();
                    break;
                case 4:
                    qlhs101.hienThi10A1_101();
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