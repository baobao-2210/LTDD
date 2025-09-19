class PhanSo101 {
    private int tu101;
    private int mau101;

    // Constructor không tham số
    public PhanSo101() {
        tu101 = 0;
        mau101 = 1;
    }

    // Constructor có tham số
    public PhanSo101(int tuSo101, int mauSo101) {
        tu101 = tuSo101;
        if (mauSo101 == 0) {
            System.out.println("Mẫu số không thể bằng 0. Đặt mặc định là 1.");
            this.mau101 = 1;
        } else {
            this.mau101 = mauSo101;
        }
    }

    // Hàm tìm UCLN
    private int UCLN101(int a101, int b101) {
        a101 = Math.abs(a101);
        b101 = Math.abs(b101);
        while (b101 != 0) {
            int temp101 = b101;
            b101 = a101 % b101;
            a101 = temp101;
        }
        return a101;
    }

    // Kiểm tra tối giản
    public boolean laToiGian101() {
        return UCLN101(tu101, mau101) == 1;
    }

    // Rút gọn
    public void rutGon101() {
        int ucln101 = UCLN101(tu101, mau101);
        tu101 /= ucln101;
        mau101 /= ucln101;
        if (mau101 < 0) { // đưa dấu âm lên tử
            tu101 = -tu101;
            mau101 = -mau101;
        }
    }

    // Cộng phân số
    public PhanSo101 cong101(PhanSo101 ps101) {
        int tuMoi101 = this.tu101 * ps101.mau101 + ps101.tu101 * this.mau101;
        int mauMoi101 = this.mau101 * ps101.mau101;
        return new PhanSo101(tuMoi101, mauMoi101);
    }

    // Trừ phân số
    public PhanSo101 tru101(PhanSo101 ps101) {
        int tuMoi101 = this.tu101 * ps101.mau101 - ps101.tu101 * this.mau101;
        int mauMoi101 = this.mau101 * ps101.mau101;
        return new PhanSo101(tuMoi101, mauMoi101);
    }

    // Nhân phân số
    public PhanSo101 nhan101(PhanSo101 ps101) {
        int tuMoi101 = this.tu101 * ps101.tu101;
        int mauMoi101 = this.mau101 * ps101.mau101;
        return new PhanSo101(tuMoi101, mauMoi101);
    }

    // Chia phân số
    public PhanSo101 chia101(PhanSo101 ps101) {
        int tuMoi101 = this.tu101 * ps101.mau101;
        int mauMoi101 = this.mau101 * ps101.tu101;
        return new PhanSo101(tuMoi101, mauMoi101);
    }

    // Hiển thị
    public void hienThi101() {
        System.out.println(tu101 + "/" + mau101);
    }
}

