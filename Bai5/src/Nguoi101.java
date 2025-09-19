import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
class Nguoi101 {
    private String hoTen101;
    private String ngaySinh101; // dd/MM/yyyy
    private String ngheNghiep101;

    public Nguoi101(String hoTen101, String ngaySinh101, String ngheNghiep101) {
        this.hoTen101 = hoTen101;
        this.ngaySinh101 = ngaySinh101;
        this.ngheNghiep101 = ngheNghiep101;
    }

    public String getHoTen101() {
        return hoTen101;
    }

    public int tinhTuoi101() {
        DateTimeFormatter fmt101 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth101 = LocalDate.parse(ngaySinh101, fmt101);
        return Period.between(birth101, LocalDate.now()).getYears();
    }

    public void hienThiThongTin101() {
        System.out.println("Họ tên: " + hoTen101 +
                " | Ngày sinh: " + ngaySinh101 +
                " | Nghề nghiệp: " + ngheNghiep101 +
                " | Tuổi: " + tinhTuoi101());
    }
}