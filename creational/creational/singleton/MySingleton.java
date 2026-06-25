package creational.singleton;

public class MySingleton {
    private static MySingleton instance;
    int count = 0;
    private MySingleton(){

    }
    public static MySingleton getinstance(){
        if(instance==null)
            instance = new MySingleton();
        return instance;
    }
    public void increase(){
        System.out.println(++count);
    }
}

