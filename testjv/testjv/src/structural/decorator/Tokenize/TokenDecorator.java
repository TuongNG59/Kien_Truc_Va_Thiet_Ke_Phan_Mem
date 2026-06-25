package structural.decorator.Tokenize;

import java.util.List;

public abstract class TokenDecorator implements Tokenize {
    Tokenize tokens;

    public TokenDecorator(Tokenize tokens) {
        this.tokens = tokens;
    }

    @Override
    public List<String> tokenize() {
        return tokens.tokenize();
    }
}
