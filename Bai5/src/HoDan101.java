import java.util.ArrayList;
import java.util.List;

class HoDan101 {
    private int soThanhVien101;
    private String soNha101;
    private List<Nguoi101> thanhVien101 = new ArrayList<>();

    public HoDan101(int soThanhVien101, String soNha101) {
        this.soThanhVien101 = soThanhVien101;
        this.soNha101 = soNha101;
    }

    public void themThanhVien101(Nguoi101 nguoi101) {
        thanhVien101.add(nguoi101);
    }

    public List<Nguoi101> getThanhVien101() {
        return thanhVien101;
    }

    public String getSoNha101() {
        return soNha101;
    }

    public void hienThiThongTin101() {
        System.out.println("\nSố nhà: " + soNha101 + " | Số thành viên: " + soThanhVien101);
        for (Nguoi101 n101 : thanhVien101) {
            n101.hienThiThongTin101();
        }
    }
}