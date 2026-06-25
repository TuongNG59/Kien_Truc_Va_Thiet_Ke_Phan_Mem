package behavioral.state.EzCalculator;

public class Calculator {
    double a, b;
    char op;
    CalculatorState State;

    public Calculator(){
        State = new InputState1();
    }

    public void setState(CalculatorState state){
        this.State = state;
    }

    public void input(String s){
        State.handle(this,s);
    }
}
