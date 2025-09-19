// Lớp Kỹ sư
class KySu101 extends CanBo101 {
    private String nganhDaoTao101;

    public KySu101(String hoTen101, String ngaySinh101, String gioiTinh101, String diaChi101, String nganhDaoTao101) {
        super(hoTen101, ngaySinh101, gioiTinh101, diaChi101);
        this.nganhDaoTao101 = nganhDaoTao101;
    }

    @Override
    public void hienThi101() {
        super.hienThi101();
        System.out.println("Ngành đào tạo: " + nganhDaoTao101);
    }
}