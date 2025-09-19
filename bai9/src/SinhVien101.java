// Lớp SinhVien quản lý thông tin sinh viên
class SinhVien101 {
    private String hoTen101;
    private String msv101;
    private String ngaySinh101;
    private String lop101;

    public SinhVien101(String hoTen101, String msv101, String ngaySinh101, String lop101) {
        this.hoTen101 = hoTen101;
        this.msv101 = msv101;
        this.ngaySinh101 = ngaySinh101;
        this.lop101 = lop101;
    }

    public void hienThi101() {
        System.out.println("Họ tên: " + hoTen101 +
                " | MSV: " + msv101 +
                " | Ngày sinh: " + ngaySinh101 +
                " | Lớp: " + lop101);
    }

    public String getHoTen101() {
        return hoTen101;
    }
}
