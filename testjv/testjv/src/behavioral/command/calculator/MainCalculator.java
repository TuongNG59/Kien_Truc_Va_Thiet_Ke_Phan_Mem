package behavioral.command.calculator;

public class MainCalculator {
    public static void main(String[] args) {
        CasioCalculator calculator = new CasioCalculator();
        calculator.compute('+', 100);
        calculator.compute('-', 20);
        calculator.compute('/', 4);
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.undo();
        calculator.redo();
        calculator.redo();
    }
}
