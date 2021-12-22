package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int studentsAmount, grades;
        System.out.println("Enter how many students");
        studentsAmount = entry.nextInt();
        System.out.println("Enter how many grades");
        grades = entry.nextInt();
        double total = 0;
        double[][] gradesStudents = new double[studentsAmount][grades];
        for (int i = 0; i < gradesStudents.length; i++) {
            for (int j = 0; j < gradesStudents[i].length; j++) {
                System.out.printf("Enter a grade %d of student %d ", i + 1, j + 1);
                gradesStudents[i][j] = entry.nextDouble();
                total += gradesStudents[i][j];
            }
        }

        double average = total / (studentsAmount * grades);
        System.out.println("Average is " + average);

        for (double[] ds : gradesStudents) {
            System.out.println(Arrays.toString(ds));
        }

        entry.close();
    }
}
