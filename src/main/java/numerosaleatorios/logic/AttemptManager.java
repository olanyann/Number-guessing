package numerosaleatorios.logic;

/**
 * Gerencia a quantidade de tentativas do jogo de adivinhação.
 */
public class AttemptManager {
    private int tentativas;

    public AttemptManager(int tentativas) {
        if (tentativas <= 0) {
            throw new IllegalArgumentException("Tentativas deve ser maior que zero");
        }
        this.tentativas = tentativas;
    }

    /**
     * Decrementa uma tentativa se ainda houver tentativas disponíveis.
     */
    public void registerTry() {
        if (tentativas > 0) {
            tentativas--;
        }
    }
    /**
     * Verifica se o jogo acabou (sem tentativas restantes).
     * @return true se não houver tentativas, false caso contrário.
     */
    public boolean hasAttempts() {
       return this.tentativas != 0;
    }

    /**
     * Retorna o número atual de tentativas restantes.
     * @return tentativas restantes.
     */
    public int getTentativas() {
        return this.tentativas;
    }
}
