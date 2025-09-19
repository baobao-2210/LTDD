public class Main {
    public static void main(String[] args) {
        PhanSo101 sp1 = new PhanSo101(2, 3);
        PhanSo101 sp2 = new PhanSo101(4, 5);

        System.out.print("Phân số 1: ");
        sp1.hienThi101();
        System.out.print("Phân số 2: ");
        sp2.hienThi101();

        PhanSo101 spTong = sp1.cong101(sp2);
        spTong.rutGon101();
        System.out.print("Tổng: ");
        spTong.hienThi101();
        PhanSo101 spHieu = sp1.tru101(sp2);
        spHieu.rutGon101();
        System.out.print("Hiệu: ");
        spHieu.hienThi101();

        PhanSo101 spTich = sp1.nhan101(sp2);
        spTich.rutGon101();
        System.out.print("Tích: ");
        spTich.hienThi101();

        PhanSo101 spThuong = sp1.chia101(sp2);
        spThuong.rutGon101();
        System.out.print("Thương: ");
        spThuong.hienThi101();
    }
}