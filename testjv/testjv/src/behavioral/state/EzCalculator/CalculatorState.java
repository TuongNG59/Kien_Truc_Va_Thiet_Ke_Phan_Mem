package behavioral.state.EzCalculator;

public interface CalculatorState {
    void handle(Calculator cal, String input);
}
