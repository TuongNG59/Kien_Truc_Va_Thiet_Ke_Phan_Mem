package behavioral.state.EzCalculator;

public class MainEzCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.input("10");
        cal.input("+");
        cal.input("2");
        cal.input("");

        cal.input("3");
        cal.input("*");
        cal.input("3");
        cal.input("");
    }
}
