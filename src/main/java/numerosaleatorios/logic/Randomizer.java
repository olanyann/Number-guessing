package numerosaleatorios.logic;

import java.util.Random;

public class Randomizer {
    Random random = new Random();
    private int min = 1;
    private int max = 100;
    public int Randomizer() {
        int numeroGerado = random.nextInt(this.min, this.max);
        return numeroGerado;
    }

}
