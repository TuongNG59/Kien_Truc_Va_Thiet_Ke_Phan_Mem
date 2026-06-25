package behavioral.strategy.TinhToan;

public class Chia implements Tinh{
    @Override
    public float tinh(float a, float b) {
        if(b==0){
            throw new ArithmeticException("Khong chia duoc cho 0");
        }
        return a/b;
    }
}
