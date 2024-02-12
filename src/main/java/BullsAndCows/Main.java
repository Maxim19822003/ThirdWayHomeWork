package BullsAndCows;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Welcome to the Bulls and Cows game!");
        logger.info("Choose the language: (1 - Russian, 2 - English)");

        String languageChoiceStr = scanner.nextLine();
        int languageChoice = Integer.parseInt(languageChoiceStr);


        Game russianGame = null;
        Game englishGame = null;

        switch (languageChoice) {
            case 1:
                russianGame = new RussianLetterGame();
                russianGame.start(4, 10);
                break;
            case 2:
                englishGame = new EnglishLetterGame();
                englishGame.start(4, 10);
                break;
            default:
                logger.error("Invalid choice. Please choose 1 for Russian or 2 for English.");
                return;
        }

        if (russianGame != null) {
            playGame(russianGame, "Russian", scanner);
        } else {
            playGame(englishGame, "English", scanner);
        }

        scanner.close();
    }

    private static void playGame(Game game, String language, Scanner scanner) {
        logger.info("Starting the {} game...", language);

        while (game.getGameStatus() == GameStatus.IN_PROGRESS) {
            logger.info("Enter your guess for the {} game:", language);
            String guess = scanner.next();
            Answer answer = game.inputValue(guess);
            logger.info("Result: {}", answer);

            if (game.getGameStatus() == GameStatus.WON) {
                logger.info("Congratulations! You won the {} game!", language);
                break;
            } else if (game.getGameStatus() == GameStatus.LOST) {
                logger.info("Sorry! You lost the {} game!", language);
                break;
            }
        }
    }
}
