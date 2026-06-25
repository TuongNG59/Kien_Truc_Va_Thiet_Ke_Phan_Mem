package creational.singleton.TrupCapDL;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    private static dataAccess instace;

    List<SanPham> sps = new ArrayList<>();

    private dataAccess(){}

    public static dataAccess getInstance(){
        if(instace == null){
            instace = new dataAccess();
        }
        return instace;
    }

    public void them(SanPham s){
        sps.add(s);
    }


    public void display(){
        for (var sp : sps){
            System.out.println(sp.toString());
        }
    }
}
