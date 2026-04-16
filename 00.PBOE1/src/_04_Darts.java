import java.util.Scanner;

public class _04_Darts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sector = sc.nextLine();
        int totalPoints = 301;
        int success = 0;
        int failure = 0;

        while (!sector.equals("Retire") && totalPoints != 0) {
            int points = Integer.parseInt(sc.nextLine());
            switch (sector) {
                case "Double" -> points *= 2;
                case "Triple" -> points *= 3;
            }
            if (points > totalPoints) {
                failure++;
            } else {
                success++;
                totalPoints -= points;
            }
            if (totalPoints != 0) {
                sector = sc.nextLine();
            }
        }

        if (totalPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", name, success);
        }  else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, failure);
        }
    }
}
