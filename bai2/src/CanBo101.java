import java.util.ArrayList;
import java.util.Scanner;

// Lớp cha
class CanBo101 {
    private String hoTen101;
    private String ngaySinh101;
    private String gioiTinh101;
    private String diaChi101;

    public CanBo101(String hoTen101, String ngaySinh101, String gioiTinh101, String diaChi101) {
        this.hoTen101 = hoTen101;
        this.ngaySinh101 = ngaySinh101;
        this.gioiTinh101 = gioiTinh101;
        this.diaChi101 = diaChi101;
    }

    // Getter - Setter
    public String getHoTen101() {
        return hoTen101;
    }

    public void setHoTen101(String hoTen101) {
        this.hoTen101 = hoTen101;
    }

    public String getNgaySinh101() {
        return ngaySinh101;
    }

    public void setNgaySinh101(String ngaySinh101) {
        this.ngaySinh101 = ngaySinh101;
    }

    public String getGioiTinh101() {
        return gioiTinh101;
    }

    public void setGioiTinh101(String gioiTinh101) {
        this.gioiTinh101 = gioiTinh101;
    }

    public String getDiaChi101() {
        return diaChi101;
    }

    public void setDiaChi101(String diaChi101) {
        this.diaChi101 = diaChi101;
    }

    // Hiển thị thông tin
    public void hienThi101() {
        System.out.println("Họ tên: " + hoTen101);
        System.out.println("Ngày sinh: " + ngaySinh101);
        System.out.println("Giới tính: " + gioiTinh101);
        System.out.println("Địa chỉ: " + diaChi101);
    }
}