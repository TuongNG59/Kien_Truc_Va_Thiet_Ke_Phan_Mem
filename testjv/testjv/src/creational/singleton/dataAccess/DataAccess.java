package creational.singleton.dataAccess;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    public static DataAccess instance;

    List<SanPham> sps = new ArrayList<>();
    private DataAccess(){

    }
    public static DataAccess getInstance(){
        if(instance==null){
            instance=new DataAccess();
        }
        return instance;
    }
    public void add(SanPham s){
        sps.add(s);
    }
    public void display(){
        for(var s:sps)
            System.out.println(s.toString());
    }
}
