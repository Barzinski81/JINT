import java.util.Scanner;

public class _02_Exam_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsatisfactoryMaximum = Integer.parseInt(scanner.nextLine());
        String assigmentName  = scanner.nextLine();
        int unsatisfactoryScores = 0;
        int assignments = 0;
        boolean failed = false;
        double scoreSum = 0.00;
        String lastAssigmentName = "";

        while(!assigmentName.equals("Enough")){
            int assigmentScore = Integer.parseInt(scanner.nextLine());
            assignments++;
            scoreSum += assigmentScore;
            if (assigmentScore <= 4){
                unsatisfactoryScores++;
            }
            if (unsatisfactoryScores == unsatisfactoryMaximum){
                failed = true;
                break;
            }
            lastAssigmentName = assigmentName;
            assigmentName = scanner.nextLine();
        }

        if(failed){
            System.out.printf("You need a break, %d poor grades.",  unsatisfactoryScores);
        } else {
            System.out.printf("Average score: %.2f%n", scoreSum / assignments);
            System.out.printf("Number of problems: %d%n", assignments);
            System.out.printf("Last problem: %s", lastAssigmentName);
        }
    }
}
