package Collections;

import java.util.Random;

public class Cartela {
    long id;
    int[] numeros;
    int pontos;

    void receberNum() {
        int numero;
        int[] num = new int[10];
        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            numero = r.nextInt(25) + 1;
            for (int j = 0; j < num.length; j++) {
                if (numero == num[j] && j != i) {
                    numero = r.nextInt(25) + 1;
                } else {
                    num[i] = numero;
                }
            }
        }
        this.numeros = num;
    }
}
