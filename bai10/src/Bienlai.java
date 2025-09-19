class BienLai {
    private KhachHang khachHang;
    private int chiSoCu;
    private int chiSoMoi;
    private int soTien;

    public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soTien = tinhTien();
    }

    private int tinhTien() {
        return (chiSoMoi - chiSoCu) * 750;
    }

    public void hienThi() {
        khachHang.hienThi();
        System.out.println("Chỉ số cũ: " + chiSoCu + " | Chỉ số mới: " + chiSoMoi + " | Số tiền: " + soTien + " VND");
    }
}
