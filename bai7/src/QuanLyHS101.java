import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyHS101 {
    private List<HSHocSinh101> danhSach101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập học sinh
    public void nhapHS101() {
        System.out.print("Nhập họ tên: ");
        String ten101 = sc101.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String ns101 = sc101.nextLine();
        System.out.print("Nhập quê quán: ");
        String qq101 = sc101.nextLine();

        System.out.print("Nhập lớp: ");
        String lop101 = sc101.nextLine();
        System.out.print("Nhập khóa học: ");
        String khoa101 = sc101.nextLine();
        System.out.print("Nhập kỳ học: ");
        String ky101 = sc101.nextLine();

        Nguoi101 n101 = new Nguoi101(ten101, ns101, qq101);
        HSHocSinh101 hs101 = new HSHocSinh101(n101, lop101, khoa101, ky101);
        danhSach101.add(hs101);

        System.out.println("Đã thêm học sinh thành công!");
    }

    // Hiển thị toàn bộ học sinh
    public void hienThiTatCa101() {
        if (danhSach101.isEmpty()) {
            System.out.println("Không có học sinh nào.");
            return;
        }
        for (HSHocSinh101 hs101 : danhSach101) {
            hs101.hienThi101();
            System.out.println("-------------------");
        }
    }

    // Hiển thị học sinh sinh năm 1985 và quê ở Thái Nguyên
    public void hienThi1985ThaiNguyen101() {
        boolean found = false;
        for (HSHocSinh101 hs101 : danhSach101) {
            String nam = hs101.getNguoi101().getNgaySinh101().split("/")[2];
            if (nam.equals("1985") &&
                    hs101.getNguoi101().getQueQuan101().equalsIgnoreCase("Thái Nguyên")) {
                hs101.hienThi101();
                System.out.println("-------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có học sinh sinh năm 1985 và quê ở Thái Nguyên.");
        }
    }

    // Hiển thị học sinh lớp 10A1
    public void hienThi10A1_101() {
        boolean found = false;
        for (HSHocSinh101 hs101 : danhSach101) {
            if (hs101.getLop101().equalsIgnoreCase("10A1")) {
                hs101.hienThi101();
                System.out.println("-------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có học sinh nào của lớp 10A1.");
        }
    }
}
