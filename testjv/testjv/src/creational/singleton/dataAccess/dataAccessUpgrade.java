package creational.singleton.dataAccess;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class dataAccessUpgrade {
    private static Dictionary<String,dataAccessUpgrade>instance =new Hashtable<>();
    List<SanPham> sps = new ArrayList<SanPham>();
    public void ThemSP(SanPham sp){
        sps.add(sp);
    }
    private dataAccessUpgrade(){}
    public static dataAccessUpgrade getInstance(String tag){
        if(instance.get(tag)==null){
            instance.put(tag,new dataAccessUpgrade());
        }
        return instance.get(tag);
    }
    public void display(){
        for(SanPham sp:sps)
            System.out.println(sp.toString());
    }
}
