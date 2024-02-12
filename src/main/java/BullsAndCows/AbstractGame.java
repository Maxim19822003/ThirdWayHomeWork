package BullsAndCows;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGame implements Game {
    protected List<String> history = new ArrayList<>();
    protected int maxTries;
    protected String secretWord;

    @Override
    public void start(Integer sizeWord, Integer tryCount) {
        maxTries = tryCount;
        secretWord = generateSecretWord(sizeWord);
    }

    abstract String generateSecretWord(Integer sizeWord);

    @Override
    public abstract Answer inputValue(String value);

    @Override
    public abstract GameStatus getGameStatus();
}
