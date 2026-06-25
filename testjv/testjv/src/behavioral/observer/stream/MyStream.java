package behavioral.observer.stream;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<MyStreamListener<T>> listeners = new ArrayList<MyStreamListener<T>>();
    public void addListener(MyStreamListener<T> listener) {
        listeners.add(listener);
    }

    public void removeListener(MyStreamListener<T> listener) {
        listeners.remove(listener);
    }

    public void addEvent(T t){
        for(MyStreamListener<T> l: listeners){
            l.listen(t);
        }
    }

}
