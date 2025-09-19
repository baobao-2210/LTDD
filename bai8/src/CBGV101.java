class CBGV101 {
    private Nguoi101 nguoi101;
    private double luongCung101;
    private double thuong101;
    private double phat101;

    public CBGV101(Nguoi101 nguoi101, double luongCung101, double thuong101, double phat101) {
        this.nguoi101 = nguoi101;
        this.luongCung101 = luongCung101;
        this.thuong101 = thuong101;
        this.phat101 = phat101;
    }

    // Tính lương thực lĩnh
    public double tinhLuongThucLinh101() {
        return luongCung101 + thuong101 - phat101;
    }

    public void hienThi101() {
        nguoi101.hienThi101();
        System.out.println("Lương cứng: " + luongCung101 +
                " | Thưởng: " + thuong101 +
                " | Phạt: " + phat101 +
                " | Lương thực lĩnh: " + tinhLuongThucLinh101());
    }
}