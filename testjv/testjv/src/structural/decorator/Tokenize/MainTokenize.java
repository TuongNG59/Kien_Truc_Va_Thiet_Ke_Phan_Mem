package structural.decorator.Tokenize;

public class MainTokenize {
    public static void main(String[] args) {
        Tokenize tokens = new TachTu("Tokenize là quá trình tách một chuỗi thành các từ.");
        System.out.println(tokens.tokenize());
        tokens = new BoTuDung(tokens);
        System.out.println(tokens.tokenize());
        tokens = new BoDauCau(tokens);
        System.out.println(tokens.tokenize());
    }
}
