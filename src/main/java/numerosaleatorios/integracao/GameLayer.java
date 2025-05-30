package numerosaleatorios.integracao;

import numerosaleatorios.logic.AttemptManager;
import numerosaleatorios.logic.Randomizer;


public class GameLayer {
    private final Randomizer randomizer = new Randomizer();
    private final AttemptManager attemptManager = new AttemptManager(5);

    private final int keyNumber = randomizer.generateRandomNumber();

    int guessedNumber;



    public int getKeyNumber() {
        return keyNumber;
    }

    public void setGuessedNumber(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }

    public boolean isCorrect() {
       return this.guessedNumber == keyNumber;
    }
    public boolean isHot(){
        return this.guessedNumber > keyNumber;
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
