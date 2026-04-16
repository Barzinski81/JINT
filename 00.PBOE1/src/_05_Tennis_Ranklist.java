import java.util.Scanner;

public class _05_Tennis_Ranklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTournaments = Integer.parseInt(sc.nextLine());
        int initialPoints = Integer.parseInt(sc.nextLine());
        int points = initialPoints;
        double wins = 0;

        for (int i = 0; i < numberOfTournaments; i++) {
            String tournamentStage = sc.nextLine();
            switch (tournamentStage) {
                case "W" -> {
                    points += 2000;
                    wins ++;
                }
                case "F" -> points += 1200;
                case "SF" -> points += 720;
            }
        }

        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %d%n", (points - initialPoints) / numberOfTournaments);
        System.out.printf("%.2f%%%n", (wins / numberOfTournaments * 100));
    }
}
