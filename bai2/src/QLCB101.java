import java.util.ArrayList;
import java.util.Scanner;

class QLCB101 {
    private ArrayList<CanBo101> danhSach101 = new ArrayList<>();
    private Scanner sc101 = new Scanner(System.in);

    // Nhập cán bộ mới
    public void nhapCanBo101() {
        System.out.println("Chọn loại cán bộ: 1. Công nhân | 2. Kỹ sư | 3. Nhân viên");
        int loai101 = Integer.parseInt(sc101.nextLine());

        System.out.print("Nhập họ tên: ");
        String hoTen101 = sc101.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String ngaySinh101 = sc101.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh101 = sc101.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi101 = sc101.nextLine();

        if (loai101 == 1) {
            System.out.print("Nhập bậc công nhân: ");
            int bac101 = Integer.parseInt(sc101.nextLine());
            danhSach101.add(new CongNhan101(hoTen101, ngaySinh101, gioiTinh101, diaChi101, bac101));
        } else if (loai101 == 2) {
            System.out.print("Nhập ngành đào tạo: ");
            String nganh101 = sc101.nextLine();
            danhSach101.add(new KySu101(hoTen101, ngaySinh101, gioiTinh101, diaChi101, nganh101));
        } else if (loai101 == 3) {
            System.out.print("Nhập công việc: ");
            String congViec101 = sc101.nextLine();
            danhSach101.add(new NhanVien101(hoTen101, ngaySinh101, gioiTinh101, diaChi101, congViec101));
        }
    }

    // Tìm kiếm theo họ tên
    public void timKiemTheoTen101(String ten101) {
        boolean timThay101 = false;
        for (CanBo101 cb101 : danhSach101) {
            if (cb101.getHoTen101().equalsIgnoreCase(ten101)) {
                System.out.println("=== Thông tin cán bộ tìm thấy ===");
                cb101.hienThi101();
                timThay101 = true;
            }
        }
        if (!timThay101) {
            System.out.println("Không tìm thấy cán bộ có tên: " + ten101);
        }
    }

    // Hiển thị toàn bộ danh sách
    public void hienThiDanhSach101() {
        System.out.println("\n=== DANH SÁCH CÁN BỘ ===");
        for (CanBo101 cb101 : danhSach101) {
            cb101.hienThi101();
            System.out.println("-------------------------");
        }
    }
}