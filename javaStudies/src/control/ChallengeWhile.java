package control;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeWhile {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner entry = new Scanner(System.in);

        int quantNotas = 0;
        double notas = 0.0;
        double mediageral = 0;

        while (notas != -1) {
            System.out.print("Enter a grade: ");
            notas = entry.nextDouble();
            if (notas >= 0 && notas <= 10) {
                quantNotas++;
                mediageral += notas;
            } else if (notas > 10) {
                System.out.println("Enter a valid number\n");
            }
        }
        mediageral = mediageral / quantNotas;
        System.out.printf("The average is %.2f of the total of %d valid grades.\n", mediageral, quantNotas);

        entry.close();

    }
}

// calcular medias de uma turma

// User type note 0 to 10

// armazenar numa var total e sempre atribuir

// nota valida é só de 0 a 10
// outra var pra receber o total de notas validas

// quando user digitar -1 sair do programa