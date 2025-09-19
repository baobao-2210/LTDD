import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyTheMuon101 {
    private List<TheMuon101> danhSach101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập thẻ mượn
    public void nhapTheMuon101() {
        System.out.print("Nhập số phiếu mượn: ");
        String soPhieu101 = sc101.nextLine();
        System.out.print("Nhập ngày mượn (dd/MM/yyyy): ");
        String ngayMuon101 = sc101.nextLine();
        System.out.print("Nhập hạn trả (dd/MM/yyyy): ");
        String hanTra101 = sc101.nextLine();
        System.out.print("Nhập số hiệu sách: ");
        String soHieu101 = sc101.nextLine();

        System.out.print("Nhập họ tên SV: ");
        String ten101 = sc101.nextLine();
        System.out.print("Nhập MSV: ");
        String msv101 = sc101.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String ns101 = sc101.nextLine();
        System.out.print("Nhập lớp: ");
        String lop101 = sc101.nextLine();

        SinhVien101 sv101 = new SinhVien101(ten101, msv101, ns101, lop101);
        TheMuon101 tm101 = new TheMuon101(soPhieu101, ngayMuon101, hanTra101, soHieu101, sv101);
        danhSach101.add(tm101);

        System.out.println("Đã thêm thẻ mượn thành công!");
    }

    // Hiển thị tất cả thẻ mượn
    public void hienThiTatCa101() {
        if (danhSach101.isEmpty()) {
            System.out.println("Không có thẻ mượn nào.");
            return;
        }
        for (TheMuon101 tm101 : danhSach101) {
            tm101.hienThi101();
            System.out.println("-------------------");
        }
    }

    // In ra danh sách sinh viên + sách cần trả cuối tháng
    public void hienThiTraCuoiThang101() {
        boolean found = false;
        for (TheMuon101 tm101 : danhSach101) {
            String[] parts = tm101.getHanTra101().split("/");
            String ngay101 = parts[0]; // dd
            if (ngay101.equals("30") || ngay101.equals("31")) {
                System.out.println("Sinh viên cần trả sách cuối tháng:");
                tm101.getSinhVien101().hienThi101();
                System.out.println("Số hiệu sách: " + tm101.getSoHieuSach101());
                System.out.println("Hạn trả: " + tm101.getHanTra101());
                System.out.println("-------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có sinh viên nào phải trả sách cuối tháng.");
        }
    }
}
