import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyCBGV101 {
    private List<CBGV101> danhSach101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập cán bộ
    public void nhapCBGV101() {
        System.out.print("Nhập họ tên: ");
        String ten101 = sc101.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String ns101 = sc101.nextLine();
        System.out.print("Nhập quê quán: ");
        String qq101 = sc101.nextLine();

        System.out.print("Nhập lương cứng: ");
        double luong101 = sc101.nextDouble();
        System.out.print("Nhập thưởng: ");
        double thuong101 = sc101.nextDouble();
        System.out.print("Nhập phạt: ");
        double phat101 = sc101.nextDouble();
        sc101.nextLine(); // bỏ dòng thừa

        Nguoi101 n101 = new Nguoi101(ten101, ns101, qq101);
        CBGV101 cb101 = new CBGV101(n101, luong101, thuong101, phat101);
        danhSach101.add(cb101);

        System.out.println("Đã thêm cán bộ giáo viên thành công!");
    }

    // Hiển thị tất cả cán bộ
    public void hienThiTatCa101() {
        if (danhSach101.isEmpty()) {
            System.out.println("Không có cán bộ nào.");
            return;
        }
        for (CBGV101 cb101 : danhSach101) {
            cb101.hienThi101();
            System.out.println("-------------------");
        }
    }

    // Hiển thị cán bộ có lương >= 8 triệu
    public void hienThiLuongTren8Tr101() {
        boolean found = false;
        for (CBGV101 cb101 : danhSach101) {
            if (cb101.tinhLuongThucLinh101() >= 8000000) {
                cb101.hienThi101();
                System.out.println("-------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có cán bộ nào có lương >= 8 triệu.");
        }
    }
}
