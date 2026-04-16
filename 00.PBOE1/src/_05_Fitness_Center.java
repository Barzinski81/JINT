import java.util.Scanner;

public class _05_Fitness_Center {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visitors = Integer.parseInt(sc.nextLine());
        int backTrainings = 0;
        int chestTrainings = 0;
        int legsTrainings = 0;
        int absTrainings = 0;
        int proteinShakes = 0;
        int proteinBars = 0;

        for (int i = 0; i < visitors; i++) {
            String input = sc.nextLine();
            switch (input) {
                case "Back" -> backTrainings ++;
                case "Chest" -> chestTrainings ++;
                case "Legs" -> legsTrainings ++;
                case "Abs" -> absTrainings ++;
                case "Protein shake" -> proteinShakes ++;
                case "Protein bar" -> proteinBars ++;
            }
        }

        double workouts = (backTrainings + chestTrainings + legsTrainings + absTrainings) / (double) visitors * 100;
        double proteins = 100.00 - workouts;
        System.out.printf("%d - back%n", backTrainings);
        System.out.printf("%d - chest%n", chestTrainings);
        System.out.printf("%d - legs%n", legsTrainings);
        System.out.printf("%d - abs%n", absTrainings);
        System.out.printf("%d - protein shake%n", proteinShakes);
        System.out.printf("%d - protein bar%n", proteinBars);
        System.out.printf("%.2f%% - work out%n", workouts);
        System.out.printf("%.2f%% - protein%n", proteins);

    }
}
