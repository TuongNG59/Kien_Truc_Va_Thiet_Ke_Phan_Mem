package behavioral.state.EzCalculator;

public class OperateState implements CalculatorState{
    @Override
    public void handle(Calculator cal, String input) {
        double result = 0;

        switch (cal.op) {
            case '+': result = cal.a+cal.b; break;
            case '-': result = cal.a-cal.b; break;
            case '*': result = cal.a*cal.b; break;
            case ':': result = cal.a/cal.b; break;
        }

        System.out.println("Ket qua: "+cal.a +" "+cal.op+" "+cal.b+" = "+ result);

        cal.setState(new InputState1());
    }
}
