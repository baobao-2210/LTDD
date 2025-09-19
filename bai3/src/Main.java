import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySach101 ql101 = new QuanLySach101();
        Scanner sc101 = new Scanner(System.in);
        int chon101;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập tài liệu");
            System.out.println("2. Tìm tài liệu theo loại");
            System.out.println("3. Tìm tài liệu theo mã");
            System.out.println("4. Hiển thị tất cả tài liệu");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon101 = sc101.nextInt();
            sc101.nextLine();

            switch (chon101) {
                case 1:
                    ql101.nhapTaiLieu101();
                    break;
                case 2:
                    System.out.println("1. Sách | 2. Tạp chí | 3. Báo");
                    int loai101 = sc101.nextInt();
                    if (loai101 == 1) ql101.timTheoLoai101(Sach101.class);
                    else if (loai101 == 2) ql101.timTheoLoai101(TapChi101.class);
                    else if (loai101 == 3) ql101.timTheoLoai101(Bao101.class);
                    break;
                case 3:
                    System.out.print("Nhập mã tài liệu: ");
                    String ma101 = sc101.nextLine();
                    ql101.timTheoMa101(ma101);
                    break;
                case 4:
                    ql101.hienThiTatCa101();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (chon101 != 0);
    }
}