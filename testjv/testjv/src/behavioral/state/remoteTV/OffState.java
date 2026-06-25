package behavioral.state.remoteTV;

public class OffState implements IRemoteState {
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("Mở thiết bị");
        remote.setState(new OnState());
    }

}
