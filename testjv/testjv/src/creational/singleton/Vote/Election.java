package creational.singleton.Vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    int trump=0;
    int biden=0;
    private Election(){}

    public static Election getInstance(){
        if(instance==null){
            instance=new Election();
        }
        return instance;
    }

    public void vote(Candidate c){
        if(c==Candidate.DONAL_TRUMP){
            trump++;
        }
        else{
            biden++;
        }
    }

    public void KetQuaBC(){
        System.out.println("Trump:"+trump);
        System.out.println("Biden:"+biden);
    }

}
