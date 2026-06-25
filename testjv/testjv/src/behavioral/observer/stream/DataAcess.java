package behavioral.observer.stream;

import java.util.ArrayList;
import java.util.List;

public class DataAcess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAcess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void add(MonHoc m){
        list.add(m);
        stream.addEvent(list);
    }

    public void delete(MonHoc m){
        list.remove(m);
        stream.addEvent(list);
    }
}
