import java.util.Scanner;

public class _04_Movie_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String input = sc.nextLine();

        while (!input.equals("ACTION")) {
            double salary = 0.00;

            if (input.length() <= 15) {
                salary = Double.parseDouble(sc.nextLine());
            } else {
                salary = budget * 0.20;
            }
            budget -= salary;

            if (budget < 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
                return;
            }

            input = sc.nextLine();
        }

        System.out.printf("We are left with %.2f leva.", budget);
    }
}
