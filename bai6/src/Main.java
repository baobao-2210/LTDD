import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KhachSan101 ks101 = new KhachSan101();
        Scanner sc101 = new Scanner(System.in);
        int chon101;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập khách trọ mới");
            System.out.println("2. Hiển thị danh sách khách trọ");
            System.out.println("3. Xóa khách trọ theo CMND");
            System.out.println("4. Tính tiền trả phòng theo CMND");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon101 = sc101.nextInt();
            sc101.nextLine();

            switch (chon101) {
                case 1:
                    ks101.nhapKhachTro101();
                    break;
                case 2:
                    ks101.hienThiTatCa101();
                    break;
                case 3:
                    System.out.print("Nhập CMND cần xóa: ");
                    String cmndXoa101 = sc101.nextLine();
                    ks101.xoaKhachTro101(cmndXoa101);
                    break;
                case 4:
                    System.out.print("Nhập CMND để tính tiền: ");
                    String cmndTinh101 = sc101.nextLine();
                    ks101.tinhTienTheoCMND101(cmndTinh101);
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