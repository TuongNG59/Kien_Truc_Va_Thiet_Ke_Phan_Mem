package creational.builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .buildCPU("Intel core i9 2025")
                .buildRam("Samsung 5500Hz 32 GB")
                .buildStorage("NVMe 1TB")
                .buildScreen("24 Inches LG")
                .build();
        System.out.println(computer.toString());
    }
}
