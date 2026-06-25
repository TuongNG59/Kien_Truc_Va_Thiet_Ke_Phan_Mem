package structural.decorator.Tokenize;

import java.util.ArrayList;
import java.util.List;

public class BoDauCau extends TokenDecorator{
    public BoDauCau(Tokenize tokenize) {super(tokenize);}

    @Override
    public List<String> tokenize() {
        List<String> list = super.tokenize();
        List<String> result = new ArrayList<>();
        for(var s:list){
            result.add(s.replaceAll("[\\p{Punct}]", ""));
        }
        return result;
    }
}
