package Arrays;

import java.util.Arrays;

public class ExerciseForEach {
    public static void main(String[] args) {
        double[] studentsGradesOne = new double[4];
        System.out.println(studentsGradesOne);

        studentsGradesOne[0] = 7.9;
        studentsGradesOne[1] = 8;
        studentsGradesOne[2] = 6.7;
        studentsGradesOne[3] = 9.7;

        System.out.println(Arrays.toString(studentsGradesOne));
        System.out.println(studentsGradesOne[0]);
        System.out.println(studentsGradesOne[studentsGradesOne.length - 1]);

        double totalGradeOne = 0;
        for (double d : studentsGradesOne) {
            totalGradeOne += d;
        }
        System.out.println(totalGradeOne / studentsGradesOne.length);

        final double gradeChest = 5.9;

        double[] studentGradeTwo = { 6.9, 8.9, gradeChest, 10 };

        double totalGradeTwo = 0;
        for (double d : studentGradeTwo) {
            totalGradeTwo += d;
        }

        System.out.println(totalGradeTwo / studentGradeTwo.length);

    }
}
