class HSHocSinh101 {
    private Nguoi101 nguoi101;
    private String lop101;
    private String khoaHoc101;
    private String kyHoc101;

    public HSHocSinh101(Nguoi101 nguoi101, String lop101, String khoaHoc101, String kyHoc101) {
        this.nguoi101 = nguoi101;
        this.lop101 = lop101;
        this.khoaHoc101 = khoaHoc101;
        this.kyHoc101 = kyHoc101;
    }

    public String getLop101() {
        return lop101;
    }

    public Nguoi101 getNguoi101() {
        return nguoi101;
    }

    public void hienThi101() {
        nguoi101.hienThi101();
        System.out.println("Lớp: " + lop101 +
                " | Khóa học: " + khoaHoc101 +
                " | Kỳ học: " + kyHoc101);
    }
}