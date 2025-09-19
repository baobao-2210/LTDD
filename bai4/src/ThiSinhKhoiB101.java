class ThiSinhKhoiB101 extends ThiSinh101 {
    private final String mon101 = "Toán, Hóa, Sinh";

    public ThiSinhKhoiB101(String soBaoDanh101, String hoTen101, String diaChi101, String uuTien101) {
        super(soBaoDanh101, hoTen101, diaChi101, uuTien101);
    }

    @Override
    public void hienThiThongTin101() {
        super.hienThiThongTin101();
        System.out.println("Khối thi: B | Môn: " + mon101);
    }
}