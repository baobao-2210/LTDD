class ThiSinh101 {
    private String soBaoDanh101;
    private String hoTen101;
    private String diaChi101;
    private String uuTien101;

    public ThiSinh101(String soBaoDanh101, String hoTen101, String diaChi101, String uuTien101) {
        this.soBaoDanh101 = soBaoDanh101;
        this.hoTen101 = hoTen101;
        this.diaChi101 = diaChi101;
        this.uuTien101 = uuTien101;
    }

    public String getSoBaoDanh101() {
        return soBaoDanh101;
    }

    public void hienThiThongTin101() {
        System.out.println("SBD: " + soBaoDanh101 +
                " | Họ tên: " + hoTen101 +
                " | Địa chỉ: " + diaChi101 +
                " | Ưu tiên: " + uuTien101);
    }
}