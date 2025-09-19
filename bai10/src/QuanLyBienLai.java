import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class QuanLyBienLai {
    private List<BienLai> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhapBienLai() {
        System.out.print("Nhập họ tên chủ hộ: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập số nhà: ");
        String soNha = sc.nextLine();
        System.out.print("Nhập mã công tơ: ");
        String maCongTo = sc.nextLine();

        System.out.print("Nhập chỉ số cũ: ");
        int chiSoCu = sc.nextInt();
        System.out.print("Nhập chỉ số mới: ");
        int chiSoMoi = sc.nextInt();
        sc.nextLine(); // bỏ trống dòng

        KhachHang kh = new KhachHang(hoTen, soNha, maCongTo);
        BienLai bl = new BienLai(kh, chiSoCu, chiSoMoi);
        danhSach.add(bl);

        System.out.println("✅ Đã thêm biên lai thành công!\n");
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Chưa có biên lai nào.");
            return;
        }
        System.out.println("\n--- DANH SÁCH BIÊN LAI ---");
        for (BienLai bl : danhSach) {
            bl.hienThi();
            System.out.println("----------------------");
        }
    }
}
