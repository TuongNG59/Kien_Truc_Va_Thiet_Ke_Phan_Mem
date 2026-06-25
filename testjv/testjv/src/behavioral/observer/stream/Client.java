package behavioral.observer.stream;

import java.util.List;

public class Client implements MyStreamListener<List<MonHoc>> {
    MyStream stream;
    String ten;
    public Client(MyStream stream, String ten) {
        this.stream = stream;
        this.ten = ten;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println(ten);
        for (MonHoc monHoc : monHocs) {
            System.out.println(monHoc.toString());
        }
    }
}
