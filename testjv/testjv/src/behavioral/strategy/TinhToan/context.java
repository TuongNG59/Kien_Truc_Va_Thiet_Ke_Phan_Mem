package behavioral.strategy.TinhToan;

public class context {
    private Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public float tinh(float a, float b) {
        if (tinhToan == null) {
            throw new NullPointerException("Chưa chọn dấu");
        }
        return tinhToan.tinh(a, b);
    }
}
