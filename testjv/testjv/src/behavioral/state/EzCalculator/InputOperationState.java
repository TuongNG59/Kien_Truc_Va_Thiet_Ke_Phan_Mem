package behavioral.state.EzCalculator;

public class InputOperationState implements CalculatorState{
    @Override
    public void handle(Calculator cal, String input) {
        cal.op=input.charAt(0);
        System.out.println("Nhap toan tu: "+cal.op);
        cal.setState(new InputState2());
    }
}
