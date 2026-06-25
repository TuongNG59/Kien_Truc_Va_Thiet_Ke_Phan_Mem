package creational.builder.A5_Book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String tuaSach,tacGia;
    private int soTrang;
    List<String> chuongs;

    private Book(Builder b) {
        tuaSach = b.tuaSach;
        soTrang = b.soTrang;
        tacGia = b.tacGia;
        chuongs = b.chuongs;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tuaSach='" + tuaSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                ", ds chuong=" + chuongs +
                '}';
    }
    public static class Builder{
        private String tuaSach,tacGia;
        private int soTrang;
        List<String> chuongs = new ArrayList<>();

        public Builder buildTS(String tuaSach){
            this.tuaSach= tuaSach;
            return this;
        }
        public Builder buildTG(String tacGia){
            this.tacGia=tacGia;
            return this;
        }
        public Builder buildST(int soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Builder buildChuong(String chuong){
            chuongs.add(chuong);
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }
}
