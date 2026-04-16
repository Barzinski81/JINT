import java.util.Scanner;

public class _02_Football_Results {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstResult  = sc.nextLine();
        String secondResult = sc.nextLine();
        String thirdResult = sc.nextLine();

        int firstHome = Integer.parseInt(firstResult.split(":")[0]);
        int firstAway = Integer.parseInt(firstResult.split(":")[1]);
        int secondHome = Integer.parseInt(secondResult.split(":")[0]);
        int secondAway = Integer.parseInt(secondResult.split(":")[1]);
        int thirdHome = Integer.parseInt(thirdResult.split(":")[0]);
        int thirdAway = Integer.parseInt(thirdResult.split(":")[1]);

        int wonGames = 0;
        int lostGames = 0;
        int draws = 0;

        if (firstHome > firstAway) {
            wonGames++;
        } else if (firstHome < firstAway) {
            lostGames++;
        } else {
            draws++;
        }

        if (secondHome > secondAway) {
            wonGames++;
        } else if (secondHome < secondAway) {
            lostGames++;
        } else {
            draws++;
        }

        if (thirdHome > thirdAway) {
            wonGames++;
        } else if (thirdHome < thirdAway) {
            lostGames++;
        } else {
            draws++;
        }

        System.out.printf("Team won %d games.%n",  wonGames);
        System.out.printf("Team lost %d games.%n",  lostGames);
        System.out.printf("Drawn games: %d%n",  draws);

    }
}
