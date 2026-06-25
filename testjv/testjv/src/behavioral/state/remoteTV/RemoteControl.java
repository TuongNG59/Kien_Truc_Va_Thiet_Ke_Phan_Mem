package behavioral.state.remoteTV;

public class RemoteControl {
    private IRemoteState state;

    RemoteControl () {
        state = new OffState();
    }

    void setState (IRemoteState state) {
        this.state = state;
    }

    public void powerPress () {
        state.handle(this);
    }
}
