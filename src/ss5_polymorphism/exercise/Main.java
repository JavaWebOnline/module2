package ss5_polymorphism.exercise;

public class Main {
    public static void main(String[] args) {
        HocVien hocVien1 = new ChuyenVien();
        HocVien hocVien2 = (NVChinhThuc) hocVien1;
        ChuyenVien hocVien3 = (ChuyenVien) hocVien2;
        NVChinhThuc hocVien4 = hocVien3;
    }
}
