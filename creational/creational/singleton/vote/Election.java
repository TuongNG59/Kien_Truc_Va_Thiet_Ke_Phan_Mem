package creational.singleton.vote;


import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int trump = 0, biden = 0;

    List<String> votedUsers = new ArrayList<>();

    private Election(){}

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }
    public void vote(Candidate c, String id){
        for (var user : votedUsers){
            if (user.equals(id))
                return;
        }
        if(c == Candidate.TRUMP)
            trump++;
        else
            biden++;

        votedUsers.add(id);

    }

    public void printRes(){
        System.out.println("So luot vote cua ong Trump " + trump);
        System.out.println("So luot vote cua ong Biden " + biden);
    }
}
