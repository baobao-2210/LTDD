class TheMuon101 {
    private String soPhieu101;
    private String ngayMuon101;  // dd/MM/yyyy
    private String hanTra101;    // dd/MM/yyyy
    private String soHieuSach101;
    private SinhVien101 sv101;

    public TheMuon101(String soPhieu101, String ngayMuon101, String hanTra101, String soHieuSach101, SinhVien101 sv101) {
        this.soPhieu101 = soPhieu101;
        this.ngayMuon101 = ngayMuon101;
        this.hanTra101 = hanTra101;
        this.soHieuSach101 = soHieuSach101;
        this.sv101 = sv101;
    }

    public void hienThi101() {
        System.out.println("Số phiếu: " + soPhieu101 +
                " | Ngày mượn: " + ngayMuon101 +
                " | Hạn trả: " + hanTra101 +
                " | Số hiệu sách: " + soHieuSach101);
        sv101.hienThi101();
    }

    public String getHanTra101() {
        return hanTra101;
    }

    public SinhVien101 getSinhVien101() {
        return sv101;
    }

    public String getSoHieuSach101() {
        return soHieuSach101;
    }
}
