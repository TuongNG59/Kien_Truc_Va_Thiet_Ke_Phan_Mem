package creational.singleton.Vote;

public class MainVote {
    public static void main(String[] args){
        User H2ONe = new User("H2ONe");
        User AnhCanhSatTruong = new User("AnhCanhSatTruong");
        User Trongdepzai = new User("Trongdepzai");
        User Socbibi = new User("Socbibi");

        H2ONe.vote(Candidate.DONAL_TRUMP);
        AnhCanhSatTruong.vote(Candidate.JOE_BIDEN);
        Trongdepzai.vote(Candidate.DONAL_TRUMP);
        Socbibi.vote(Candidate.JOE_BIDEN);

        Election.getInstance().KetQuaBC();
    }
}
