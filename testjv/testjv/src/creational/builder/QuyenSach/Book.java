package creational.builder.QuyenSach;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe, tacGia;
    int soTrang;
    List<String>chuongs;

    protected Book(Builder b) {
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.soTrang = b.soTrang;
        this.chuongs = b.chuongs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Tựa đề: ").append(tuaDe).append("\n");
        builder.append("Tác giả: ").append(tacGia).append("\n");
        builder.append("Số trang: ").append(soTrang).append("\n");
        builder.append("Danh sách chương:\n");

        for (int i = 0; i < chuongs.size(); i++) {
            builder.append("   Chương ")
                    .append(i + 1)
                    .append(": ")
                    .append(chuongs.get(i))
                    .append("\n");
        }

        return builder.toString();
    }

    public static class Builder{
        String tuaDe, tacGia;
        int soTrang;
        List<String>chuongs=new ArrayList<>();

        public Builder setTuaDe(String tuaDe) {
            this.tuaDe = tuaDe;
            return this;
        }

        public Builder setTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder setSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }

        public Builder addChuong(String chuong) {
            this.chuongs.add(chuong);
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
