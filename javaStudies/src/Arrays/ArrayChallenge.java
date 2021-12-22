package Arrays;

import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Enter how many grades");
        int gradesAmount = entry.nextInt();
        double[] studentGrades = new double[gradesAmount];
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println("Enter a grade");
            studentGrades[i] = entry.nextDouble();
        }
        double totalGrades = 0;
        for (double d : studentGrades) {
            totalGrades += d;
        }
        double averageGrades = totalGrades / studentGrades.length;
        System.out.printf("The number of grades chosen was %d, the total sum was %.2f and the average was %.2f",
                gradesAmount,
                totalGrades, averageGrades);
        entry.close();
    }
}
