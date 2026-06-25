package behavioral.strategy.TinhToan;

public class Tru implements  Tinh{
    @Override
    public float tinh(float a, float b) {
        return a-b;
    }
}
