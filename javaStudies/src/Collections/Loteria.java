package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Loteria {
    @SuppressWarnings({ "rawtypes", "unchecked" })

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Quantas cartelas?");
        int userCartelas = entry.nextInt();
        while (userCartelas < 1) {
            System.out.println("Digite uma quantidade valida");
            System.out.println("Quantas cartelas?");
            userCartelas = entry.nextInt();
        }
        int idFixo = 0;
        Cartela[] cartelas = new Cartela[userCartelas];
        for (int i = 0; i < cartelas.length; i++) {
            cartelas[i] = new Cartela();
            cartelas[i].id = idFixo + 1;
            idFixo++;
            cartelas[i].receberNum();
        }
        int sortearDnv = 0;
        HashSet set1 = new HashSet();
        do {

            System.out.println();
            Set<Integer> numeros = new HashSet<>();

            Random random = new Random();
            for (int i = 0; i < 1; i++) {
                int n = random.nextInt(25) + 1;
                numeros.add(n);

                while (set1.contains(n) || n == 0) {
                    numeros.remove(n);
                    n = random.nextInt(25);
                    numeros.add(n);
                }

            }
            Integer[] resultado = numeros.toArray(new Integer[numeros.size()]);
            System.out.println("Número sorteado: " + resultado[0]);
            for (int i = 0; i < cartelas.length; i++) {
                for (int j = 0; j < cartelas[i].numeros.length; j++) {
                    if (cartelas[i].numeros[j] == resultado[0]) {
                        System.out.println(
                                "A cartela " + cartelas[i].id + " acertou o número " + resultado[0]);
                        cartelas[i].pontos += 1;
                    }
                    set1.add(resultado[0]);
                }
            }
            System.out.println();
            System.out.println("Os números sorteados foram: " + set1);
            System.out.println(set1.size());
            for (int i = 0; i < cartelas.length; i++) {
                if (cartelas[i].pontos == 10) {
                    System.out.printf("%nParabéns a seguinte cartela %d por conseguir os 10 pontos%n", cartelas[i].id);
                    sortearDnv = 1;
                } else {
                    System.out.printf("Cartela id %d tem %d pontos. Números da cartela: %s%n", cartelas[i].id,
                            cartelas[i].pontos, Arrays.toString(cartelas[i].numeros));
                }
            }
            if (sortearDnv == 1) {
                break;
            }
            System.out.println("Digite qualquer número para sortear outro número");
            sortearDnv = entry.nextInt();
        } while (sortearDnv == 0);
        entry.close();

    }
}
