package creational.builder.computer;

public class Computer {
    protected String cpu, ram, storage, screen;
    private Computer(Builder b){
        cpu = b.cpu;
        ram = b.ram;
        storage = b.storage;
        screen = b.screen;
    }
    @Override
    public String toString() {
        return "Builder{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
    public static class Builder{
        protected String cpu, ram, storage, screen;
        public Builder buildCPU (String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder buildRam (String ram){
            this.ram = ram;
            return this;
        }
        public Builder buildStorage (String storage){
            this.storage = storage;
            return this;
        }
        public Builder buildScreen (String screen){
            this.screen = screen;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
