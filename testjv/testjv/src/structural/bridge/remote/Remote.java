package structural.bridge.remote;

public class Remote {
    Device device;
    public Remote(Device device) {
        this.device = device;
    }

    public void tooglePower(){
        if(device.isEnable()){
            device.disable();
        }
        else{
            device.enable();
        }
        if(device.getVolume()>0){
            device.setVolume(device.getVolume()-1);
        }
    }

    public void volumeUp(){
        int volume = device.getVolume();
        if(device.isEnable() && volume <100){
            device.setVolume(++volume);
            System.out.println(volume);
        }
    }

    public void volumeDown(){
        int volume = device.getVolume();
        if(device.isEnable() && volume > 0){
            device.setVolume(--volume);
            System.out.println(volume);
        }
    }
}
