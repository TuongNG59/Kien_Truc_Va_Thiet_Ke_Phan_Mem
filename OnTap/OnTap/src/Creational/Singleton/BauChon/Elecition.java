package Creational.Singleton.BauChon;

public class Elecition {
    int trump, biden;
    static Election instance;

    Election(){}

    public static Election getInstance(){
        if(instance == null){
            instance = new Election;
        }
        return instance;
    }

    public vote(Candidate c){

    }

}
