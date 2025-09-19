class KhachTro101 {
    private Nguoi101 nguoi101;
    private int soNgayTro101;
    private String loaiPhong101;
    private double giaPhong101;

    public KhachTro101(Nguoi101 nguoi101, int soNgayTro101, String loaiPhong101, double giaPhong101) {
        this.nguoi101 = nguoi101;
        this.soNgayTro101 = soNgayTro101;
        this.loaiPhong101 = loaiPhong101;
        this.giaPhong101 = giaPhong101;
    }

    public String getCmnd101() {
        return nguoi101.getCmnd101();
    }

    public double tinhTien101() {
        return soNgayTro101 * giaPhong101;
    }

    public void hienThiThongTin101() {
        nguoi101.hienThiThongTin101();
        System.out.println("Số ngày trọ: " + soNgayTro101 +
                " | Loại phòng: " + loaiPhong101 +
                " | Giá phòng/ngày: " + giaPhong101 +
                " | Thành tiền: " + tinhTien101());
    }
}
