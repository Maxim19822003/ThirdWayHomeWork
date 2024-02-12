package BullsAndCows;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class RussianLetterGame extends AbstractGame {
    private static final Logger logger = LogManager.getLogger(RussianLetterGame.class);
    private String secretWord;
    private int tryCount;
    private boolean gameFinished;

    @Override
    public void start(Integer sizeWord, Integer tryCount) {
        this.secretWord = generateSecretWord(sizeWord);
        this.tryCount = tryCount;
        this.gameFinished = false;
        logger.info("Starting Russian game with secret word: {}", secretWord);
    }

    @Override
    String generateSecretWord(Integer sizeWord) {
        StringBuilder sb = new StringBuilder();
        // Генерация случайного слова из русских букв
        Random random = new Random();
        String alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
        for (int i = 0; i < sizeWord; i++) {
            sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        logger.debug("Generated secret word: {}", sb.toString());
        return sb.toString();
    }

    @Override
    public Answer inputValue(String value) {
        logger.info("Player's guess: {}", value);
        int bulls = 0;
        int cows = 0;

        // Проверка на совпадение символов в нужных позициях
        for (int i = 0; i < value.length(); i++) {
            char guessChar = value.charAt(i);
            char secretChar = secretWord.charAt(i);
            if (guessChar == secretChar) {
                bulls++;
            } else if (secretWord.contains(String.valueOf(guessChar))) {
                cows++;
            }
        }

        Answer answer = new Answer(value, bulls, cows);
        logger.info("Result: {}", answer);
        return answer;
    }

    @Override
    public GameStatus getGameStatus() {
        if (gameFinished) {
            return GameStatus.LOST;
        } else if (tryCount <= 0) {
            gameFinished = true;
            return GameStatus.LOST;
        }
        return GameStatus.IN_PROGRESS;
    }
}
