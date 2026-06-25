package behavioral.observer.stream;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAcess dataAcess = new DataAcess(stream);
        Client client1 = new Client(stream, "client 1");
        Client client2 = new Client(stream, "client 2");
        System.out.println("Lần 1");
        dataAcess.add(new MonHoc("001", "Toán đại cương", 4));
        System.out.println("Lần 2");
        dataAcess.add(new MonHoc("002", "Tin học đại cương", 3));

    }
}
