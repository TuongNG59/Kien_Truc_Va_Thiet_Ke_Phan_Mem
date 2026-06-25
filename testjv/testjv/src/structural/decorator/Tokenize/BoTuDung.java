package structural.decorator.Tokenize;

import java.util.List;

public class BoTuDung extends TokenDecorator{
    List<String> list= List.of("thì", "mà", "là","bị","bởi","cả","các","chỉ","chiếc","cho","chứ","chuyện","có","của","đã","đây","dưới","gì","khi","không","lên","nhưng","nữa");

    public BoTuDung(Tokenize tokenize) {super(tokenize);}

    @Override
    public List<String> tokenize() {
        List<String> t = super.tokenize();
        t.removeAll(list);
        return t;
    }
}
