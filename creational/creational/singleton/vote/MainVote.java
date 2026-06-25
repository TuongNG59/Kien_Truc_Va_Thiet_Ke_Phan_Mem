package creational.singleton.vote;

public class MainVote {
    public static void main(String[] args) {
        User u1 = new User("Hung");
        User u2 = new User("Thinh");
        User u3 = new User("Phat");
        u1.vote(Candidate.TRUMP);
        u2.vote(Candidate.BIDEN);
        u3.vote(Candidate.BIDEN);
        u1.vote(Candidate.TRUMP);
        Election.getInstance().printRes();
    }
}
