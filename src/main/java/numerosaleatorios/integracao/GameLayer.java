package numerosaleatorios.integracao;

import numerosaleatorios.logic.AttemptManager;
import numerosaleatorios.logic.Randomizer;

public class GameLayer {
    private final Randomizer randomizer = new Randomizer();
    private final AttemptManager attemptManager = new AttemptManager(5);
    private final int keyNumber = randomizer.generateRandomNumber();

    int guessedNumber;




    public void setGuessedNumber(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }

    public boolean isCorrect() {
        if (guessedNumber == keyNumber) {
            return true;
        }
        return false;
    }
    public void registerAttempt() {
        attemptManager.registerTry();
    }

    public boolean hasAttempt() {
        return attemptManager.hasAttempts();
    }
    public int remainingAttempts() {
        return attemptManager.getTry();
    }

}
