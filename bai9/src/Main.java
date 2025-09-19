import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTheMuon101 ql101 = new QuanLyTheMuon101();
        Scanner sc101 = new Scanner(System.in);
        int chon101;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thẻ mượn mới");
            System.out.println("2. Hiển thị tất cả thẻ mượn");
            System.out.println("3. Danh sách SV cần trả sách cuối tháng");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon101 = sc101.nextInt();
            sc101.nextLine();

            switch (chon101) {
                case 1:
                    ql101.nhapTheMuon101();
                    break;
                case 2:
                    ql101.hienThiTatCa101();
                    break;
                case 3:
                    ql101.hienThiTraCuoiThang101();
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