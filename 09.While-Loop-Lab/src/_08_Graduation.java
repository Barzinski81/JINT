import java.util.Scanner;

public class _08_Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double gradeSum = 0.00;
        int classNumber = 0;
        int failed = 0;

        while (classNumber < 12) {
            double grade = Double.parseDouble(sc.nextLine());
            if (grade < 4.00) {
                failed++;
            }
            if (failed == 2) {
                System.out.printf("%s has been excluded at %d grade%n", name, classNumber);
                return;
            }
            gradeSum += grade;
            classNumber++;
        }

        System.out.printf("%s graduated. Average grade: %.2f%n", name, gradeSum / classNumber);
    }
}
