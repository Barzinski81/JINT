import java.util.Scanner;

public class _04_Train_The_Trainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juryNumber = Integer.parseInt(sc.nextLine());
        String presentationName = sc.nextLine();
        double allGrades = 0.00;
        int exams = 0;

        while (!presentationName.equals("Finish")) {
            double currentGrade = 0.00;
        for (int i = 0; i < juryNumber; i++) {
            exams++;
            double grade = Double.parseDouble(sc.nextLine());
            currentGrade += grade;
        }
            allGrades += currentGrade;
            System.out.printf("%s - %.2f.%n", presentationName, currentGrade / juryNumber);
            presentationName = sc.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", allGrades / exams);
    }
}
