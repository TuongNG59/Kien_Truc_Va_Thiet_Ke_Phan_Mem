package behavioral.strategy.QLSV;

public class MainQLSV {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();

        qlsv.themSinhVien(new SinhVien("Huynh Thanh Trinh", "10/12/2005", 5));
        qlsv.themSinhVien(new SinhVien("Nguyen Huu Trong", "1/1/2005", 9));
        qlsv.themSinhVien(new SinhVien("Nguyen Gia Khiem", "1/4/2005", 3));

        System.out.println("Sap xep theo ten: ");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("Sap xep theo diem:");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
