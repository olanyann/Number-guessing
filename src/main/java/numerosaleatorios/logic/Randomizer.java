package numerosaleatorios.logic;

import java.util.Random;

public class Randomizer {
    Random random = new Random();
    /**
     * Atributos de inicio e fim para a variavel randomizada
     */
    private int min = 1;
    private int max = 100;

    /**
     * Metodo que gera um numero aleatorio
     * @return o numero inteiro gerado
     */
    public int generateRandomNumber() {
        int numeroGerado = random.nextInt(this.min, this.max);
        return numeroGerado;
    }

}
