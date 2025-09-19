class Nguoi101 {
    private String hoTen101;
    private String ngaySinh101; // dd/MM/yyyy
    private String queQuan101;

    public Nguoi101(String hoTen101, String ngaySinh101, String queQuan101) {
        this.hoTen101 = hoTen101;
        this.ngaySinh101 = ngaySinh101;
        this.queQuan101 = queQuan101;
    }

    public String getNgaySinh101() {
        return ngaySinh101;
    }

    public String getQueQuan101() {
        return queQuan101;
    }

    public void hienThi101() {
        System.out.println("Họ tên: " + hoTen101 +
                " | Ngày sinh: " + ngaySinh101 +
                " | Quê quán: " + queQuan101);
    }
}
