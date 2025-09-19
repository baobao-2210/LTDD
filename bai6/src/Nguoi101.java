import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lớp Nguoi
class Nguoi101 {
    private String hoTen101;
    private String ngaySinh101; // dd/MM/yyyy
    private String cmnd101;

    public Nguoi101(String hoTen101, String ngaySinh101, String cmnd101) {
        this.hoTen101 = hoTen101;
        this.ngaySinh101 = ngaySinh101;
        this.cmnd101 = cmnd101;
    }

    public String getCmnd101() {
        return cmnd101;
    }

    public void hienThiThongTin101() {
        System.out.println("Họ tên: " + hoTen101 +
                " | Ngày sinh: " + ngaySinh101 +
                " | CMND: " + cmnd101);
    }
}