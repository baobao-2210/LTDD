class TapChi101 extends TaiLieu101 {
    private int soPhatHanh101;
    private int thangPhatHanh101;

    public TapChi101(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101,
                     int soPhatHanh101, int thangPhatHanh101) {
        super(maTaiLieu101, nhaXuatBan101, soBanPhatHanh101);
        this.soPhatHanh101 = soPhatHanh101;
        this.thangPhatHanh101 = thangPhatHanh101;
    }

    @Override
    public void hienThiThongTin101() {
        super.hienThiThongTin101();
        System.out.println("Loại: Tạp chí | Số phát hành: " + soPhatHanh101 + ", Tháng: " + thangPhatHanh101);
    }
}