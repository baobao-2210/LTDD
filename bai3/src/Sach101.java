class Sach101 extends TaiLieu101 {
    private String tenTacGia101;
    private int soTrang101;

    public Sach101(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101,
                   String tenTacGia101, int soTrang101) {
        super(maTaiLieu101, nhaXuatBan101, soBanPhatHanh101);
        this.tenTacGia101 = tenTacGia101;
        this.soTrang101 = soTrang101;
    }

    @Override
    public void hienThiThongTin101() {
        super.hienThiThongTin101();
        System.out.println("Loại: Sách | Tác giả: " + tenTacGia101 + ", Số trang: " + soTrang101);
    }
}