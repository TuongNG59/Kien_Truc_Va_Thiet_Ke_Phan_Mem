package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getinstance();
        MySingleton s2 = MySingleton.getinstance();
        s1.increase();
        s1.increase();
        s2.increase();
        s1.increase();
        //s1, s2 is the same
    }
}
