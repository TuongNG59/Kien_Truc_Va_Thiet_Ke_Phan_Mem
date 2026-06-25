package creational.singleton.Vote;

public class User {
    String userID;

    public User(String userID){
        this.userID = userID;
    }

    public void vote(Candidate c){
        Election.getInstance().vote(c);
    }
}
