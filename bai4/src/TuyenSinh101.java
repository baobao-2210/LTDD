import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class TuyenSinh101 {
    private List<ThiSinh101> danhSach101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập thí sinh
    public void nhapThiSinh101() {
        System.out.println("Chọn khối thi: 1. A | 2. B | 3. C");
        int loai101 = sc101.nextInt();
        sc101.nextLine();

        System.out.print("Nhập SBD: ");
        String sbd101 = sc101.nextLine();
        System.out.print("Nhập họ tên: ");
        String ten101 = sc101.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String dc101 = sc101.nextLine();
        System.out.print("Nhập diện ưu tiên: ");
        String ut101 = sc101.nextLine();

        ThiSinh101 ts101 = null;
        switch (loai101) {
            case 1:
                ts101 = new ThiSinhKhoiA101(sbd101, ten101, dc101, ut101);
                break;
            case 2:
                ts101 = new ThiSinhKhoiB101(sbd101, ten101, dc101, ut101);
                break;
            case 3:
                ts101 = new ThiSinhKhoiC101(sbd101, ten101, dc101, ut101);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        danhSach101.add(ts101);
        System.out.println("Đã thêm thí sinh thành công!");
    }

    // Hiển thị tất cả thí sinh
    public void hienThiTatCa101() {
        for (ThiSinh101 ts101 : danhSach101) {
            ts101.hienThiThongTin101();
        }
    }

    // Tìm kiếm theo số báo danh
    public void timTheoSBD101(String sbd101) {
        for (ThiSinh101 ts101 : danhSach101) {
            if (ts101.getSoBaoDanh101().equals(sbd101)) {
                ts101.hienThiThongTin101();
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh có SBD: " + sbd101);
    }
}