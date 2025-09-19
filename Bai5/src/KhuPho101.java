import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhuPho101 {
    private List<HoDan101> danhSachHoDan101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập danh sách hộ dân
    public void nhapDanhSach101() {
        System.out.print("Nhập số hộ dân: ");
        int n101 = sc101.nextInt();
        sc101.nextLine();

        for (int i = 0; i < n101; i++) {
            System.out.println("\n--- Nhập thông tin hộ dân " + (i + 1) + " ---");
            System.out.print("Số nhà: ");
            String soNha101 = sc101.nextLine();
            System.out.print("Số thành viên: ");
            int soTV101 = sc101.nextInt();
            sc101.nextLine();

            HoDan101 ho101 = new HoDan101(soTV101, soNha101);

            for (int j = 0; j < soTV101; j++) {
                System.out.println("  Nhập thông tin thành viên " + (j + 1));
                System.out.print("  Họ tên: ");
                String ten101 = sc101.nextLine();
                System.out.print("  Ngày sinh (dd/MM/yyyy): ");
                String ns101 = sc101.nextLine();
                System.out.print("  Nghề nghiệp: ");
                String nn101 = sc101.nextLine();

                ho101.themThanhVien101(new Nguoi101(ten101, ns101, nn101));
            }
            danhSachHoDan101.add(ho101);
        }
    }
    public void hienThiTatCa101() {
        for (HoDan101 ho101 : danhSachHoDan101) {
            ho101.hienThiThongTin101();
        }
    }

    // Hiển thị các hộ có người 80 tuổi
    public void hienThiNguoi80Tuoi101() {
        System.out.println("\n--- Danh sách hộ có người mừng thượng thọ (80 tuổi) ---");
        for (HoDan101 ho101 : danhSachHoDan101) {
            for (Nguoi101 n101 : ho101.getThanhVien101()) {
                if (n101.tinhTuoi101() == 80) {
                    System.out.println("Số nhà: " + ho101.getSoNha101());
                    n101.hienThiThongTin101();
                }
            }
        }
    }
}