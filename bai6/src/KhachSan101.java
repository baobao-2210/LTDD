import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhachSan101 {
    private List<KhachTro101> danhSach101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập khách trọ
    public void nhapKhachTro101() {
        System.out.print("Nhập họ tên: ");
        String ten101 = sc101.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String ns101 = sc101.nextLine();
        System.out.print("Nhập số CMND: ");
        String cmnd101 = sc101.nextLine();

        System.out.print("Nhập số ngày trọ: ");
        int ngay101 = sc101.nextInt();
        sc101.nextLine();
        System.out.print("Nhập loại phòng: ");
        String loai101 = sc101.nextLine();
        System.out.print("Nhập giá phòng/ngày: ");
        double gia101 = sc101.nextDouble();
        sc101.nextLine();

        Nguoi101 n101 = new Nguoi101(ten101, ns101, cmnd101);
        KhachTro101 kt101 = new KhachTro101(n101, ngay101, loai101, gia101);
        danhSach101.add(kt101);

        System.out.println("Đã thêm khách trọ thành công!");
    }

    // Hiển thị toàn bộ khách trọ
    public void hienThiTatCa101() {
        if (danhSach101.isEmpty()) {
            System.out.println("Không có khách trọ nào.");
            return;
        }
        for (KhachTro101 kt101 : danhSach101) {
            kt101.hienThiThongTin101();
            System.out.println("-------------------");
        }
    }

    // Xóa khách trọ theo CMND
    public void xoaKhachTro101(String cmnd101) {
        for (KhachTro101 kt101 : danhSach101) {
            if (kt101.getCmnd101().equals(cmnd101)) {
                danhSach101.remove(kt101);
                System.out.println("Đã xóa khách trọ có CMND: " + cmnd101);
                return;
            }
        }
        System.out.println("Không tìm thấy khách trọ có CMND: " + cmnd101);
    }

    // Tính tiền trả phòng theo CMND
    public void tinhTienTheoCMND101(String cmnd101) {
        for (KhachTro101 kt101 : danhSach101) {
            if (kt101.getCmnd101().equals(cmnd101)) {
                System.out.println("Khách trọ có CMND " + cmnd101 + " cần trả: " + kt101.tinhTien101());
                return;
            }
        }
        System.out.println("Không tìm thấy khách trọ có CMND: " + cmnd101);
    }
}
