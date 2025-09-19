// Lớp Nhân viên
class NhanVien101 extends CanBo101 {
    private String congViec101;

    public NhanVien101(String hoTen101, String ngaySinh101, String gioiTinh101, String diaChi101, String congViec101) {
        super(hoTen101, ngaySinh101, gioiTinh101, diaChi101);
        this.congViec101 = congViec101;
    }

    @Override
    public void hienThi101() {
        super.hienThi101();
        System.out.println("Công việc: " + congViec101);
    }
}