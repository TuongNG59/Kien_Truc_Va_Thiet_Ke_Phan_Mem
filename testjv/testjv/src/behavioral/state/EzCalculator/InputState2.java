package behavioral.state.EzCalculator;

public class InputState2 implements CalculatorState{
    @Override
    public void handle(Calculator cal, String input) {
        cal.b=Double.parseDouble(input);
        System.out.println("Nhap so thu hai: "+cal.b);
        cal.setState(new OperateState());
    }
}
