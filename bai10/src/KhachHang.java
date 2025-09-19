class KhachHang {
    private String hoTen;
    private String soNha;
    private String maCongTo;

    public KhachHang(String hoTen, String soNha, String maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public void hienThi() {
        System.out.println("Chủ hộ: " + hoTen + " | Số nhà: " + soNha + " | Mã công tơ: " + maCongTo);
    }
}