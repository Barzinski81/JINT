import java.util.Scanner;

public class _06_Basketball_Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tournamentName = sc.nextLine();
        int allMatches = 0;
        int wonMatches = 0;
        int lostMatches = 0;

        while(!tournamentName.equals("End of tournaments")){
            int numberOfMatches = Integer.parseInt(sc.nextLine());
            allMatches += numberOfMatches;
            for (int i = 1; i <= numberOfMatches; i++) {
                int difference = 0;
                String status = "";
                int pointsDesi = Integer.parseInt(sc.nextLine());
                int pointsEnemy  = Integer.parseInt(sc.nextLine());
                if (pointsDesi > pointsEnemy) {
                    difference = pointsDesi - pointsEnemy;
                    status = "win";
                    wonMatches++;
                } else {
                    difference = pointsEnemy - pointsDesi;
                    status = "lost";
                    lostMatches++;
                }
                System.out.printf("Game %d of tournament %s: %s with %d points.%n", i, tournamentName, status, difference);
            }

            tournamentName = sc.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", (double) wonMatches / allMatches * 100);
        System.out.printf("%.2f%% matches lost%n", (double) lostMatches / allMatches * 100);
    }
}
