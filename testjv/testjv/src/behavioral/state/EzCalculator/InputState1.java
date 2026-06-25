package behavioral.state.EzCalculator;

public class InputState1  implements CalculatorState {
    @Override
    public void handle(Calculator cal, String input) {
        try {
            cal.a = Double.parseDouble(input);
            System.out.println("Nhap so thu nhat: " + cal.a);
            cal.setState(new InputOperationState());
        } catch (NumberFormatException e) {
            System.out.println("Vui long nhap SO!");
        }
    }
}
