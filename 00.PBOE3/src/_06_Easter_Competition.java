import java.util.Scanner;

public class _06_Easter_Competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breadRolls = Integer.parseInt(sc.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";
        int winnerPoints = 0;

        for (int i = 0; i < breadRolls; i++) {
            String baker =  sc.nextLine();
            String input = sc.nextLine();
            int totalPoints = 0;
            boolean numberOne = false;

            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);
                totalPoints += points;
                input = sc.nextLine();
            }

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                winnerPoints = totalPoints;
                winner = baker;
                numberOne = true;
            }
            System.out.printf("%s has %d points.%n", baker, totalPoints);

            if (numberOne) {
                System.out.printf("%s is the new number 1!%n", baker);
            }
        }

        System.out.printf("%s won competition with %d points!%n", winner, winnerPoints);
    }
}
