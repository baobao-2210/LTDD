import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QuanLySach101 {
    private List<TaiLieu101> danhSach101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập tài liệu mới
    public void nhapTaiLieu101() {
        System.out.println("Chọn loại tài liệu: 1.Sách 2.Tạp chí 3.Báo");
        int loai101 = sc101.nextInt();
        sc101.nextLine();

        System.out.print("Nhập mã tài liệu: ");
        String ma101 = sc101.nextLine();
        System.out.print("Nhà xuất bản: ");
        String nxb101 = sc101.nextLine();
        System.out.print("Số bản phát hành: ");
        int soban101 = sc101.nextInt();
        sc101.nextLine();

        switch (loai101) {
            case 1:
                System.out.print("Tên tác giả: ");
                String tg101 = sc101.nextLine();
                System.out.print("Số trang: ");
                int trang101 = sc101.nextInt();
                sc101.nextLine();
                danhSach101.add(new Sach101(ma101, nxb101, soban101, tg101, trang101));
                break;
            case 2:
                System.out.print("Số phát hành: ");
                int sph101 = sc101.nextInt();
                System.out.print("Tháng phát hành: ");
                int th101 = sc101.nextInt();
                sc101.nextLine();
                danhSach101.add(new TapChi101(ma101, nxb101, soban101, sph101, th101));
                break;
            case 3:
                System.out.print("Ngày phát hành: ");
                String ngay101 = sc101.nextLine();
                danhSach101.add(new Bao101(ma101, nxb101, soban101, ngay101));
                break;
            default:
                System.out.println("Loại không hợp lệ!");
        }
    }

    // Tìm kiếm theo loại
    public void timTheoLoai101(Class<?> loai101) {
        for (TaiLieu101 tl101 : danhSach101) {
            if (loai101.isInstance(tl101)) {
                tl101.hienThiThongTin101();
            }
        }
    }

    // Tìm theo mã
    public void timTheoMa101(String ma101) {
        for (TaiLieu101 tl101 : danhSach101) {
            if (tl101.getMaTaiLieu101().equals(ma101)) {
                tl101.hienThiThongTin101();
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu có mã: " + ma101);
    }

    // Hiển thị tất cả
    public void hienThiTatCa101() {
        for (TaiLieu101 tl101 : danhSach101) {
            tl101.hienThiThongTin101();
        }
    }
}
