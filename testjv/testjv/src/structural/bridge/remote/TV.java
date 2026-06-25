package structural.bridge.remote;

public class TV implements Device{
    private boolean on = false;
    private int volume = 30;

    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("TV đã bật");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("TV đã tắt");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent < 0) percent = 0;
        if (percent > 100) percent = 100;
        volume = percent;
        System.out.println(volume);
    }
}
