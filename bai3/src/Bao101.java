// Lớp Báo kế thừa
class Bao101 extends TaiLieu101 {
    private String ngayPhatHanh101;

    public Bao101(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101,
                  String ngayPhatHanh101) {
        super(maTaiLieu101, nhaXuatBan101, soBanPhatHanh101);
        this.ngayPhatHanh101 = ngayPhatHanh101;
    }

    @Override
    public void hienThiThongTin101() {
        super.hienThiThongTin101();
        System.out.println("Loại: Báo | Ngày phát hành: " + ngayPhatHanh101);
    }
}