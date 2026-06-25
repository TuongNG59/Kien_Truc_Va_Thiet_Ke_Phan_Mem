package creational.builder.QuyenSach;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .setTuaDe("Mắt Biếc")
                .setSoTrang(100)
                .setTacGia("Nguyễn Nhật Ánh")
                .addChuong("Chương 1")
                .addChuong("Chương 2")
                .addChuong("Chương 3")
                .build();
        System.out.println(book);
    }
}
