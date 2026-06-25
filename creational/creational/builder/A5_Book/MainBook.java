package creational.builder.A5_Book;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .buildTS("Cay cam ngot")
                .buildST(152)
                .buildTG("NHT")
                .buildChuong("chuong1")
                .buildChuong("chuong 2")
                .build();
        System.out.println(book.toString());
    }
}
