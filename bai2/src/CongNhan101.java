class CongNhan101 extends CanBo101 {
    private int bac101;

    public CongNhan101(String hoTen101, String ngaySinh101, String gioiTinh101, String diaChi101, int bac101) {
        super(hoTen101, ngaySinh101, gioiTinh101, diaChi101);
        this.bac101 = bac101;
    }

    @Override
    public void hienThi101() {
        super.hienThi101();
        System.out.println("Bậc công nhân: " + bac101 + "/7");
    }
}
