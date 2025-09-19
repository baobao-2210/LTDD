class TaiLieu101 {
    private String maTaiLieu101;
    private String nhaXuatBan101;
    private int soBanPhatHanh101;

    public TaiLieu101(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101) {
        this.maTaiLieu101 = maTaiLieu101;
        this.nhaXuatBan101 = nhaXuatBan101;
        this.soBanPhatHanh101 = soBanPhatHanh101;
    }

    public String getMaTaiLieu101() {
        return maTaiLieu101;
    }

    public String getNhaXuatBan101() {
        return nhaXuatBan101;
    }

    public int getSoBanPhatHanh101() {
        return soBanPhatHanh101;
    }

    public void hienThiThongTin101() {
        System.out.println("Mã TL: " + maTaiLieu101 + ", NXB: " + nhaXuatBan101 + ", Số bản: " + soBanPhatHanh101);
    }
}