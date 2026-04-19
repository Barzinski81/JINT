import java.util.Scanner;

public class _03_Movie_Destination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String destination = sc.nextLine();
        String season = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        double price = 0.00;

        switch (destination) {
            case "Dubai" -> {
                switch (season) {
                    case "Winter" -> price = 45000.00;
                    case "Summer" -> price = 40000.00;
                }
                price = price * 0.70;
            }
            case "Sofia" -> {
                switch (season) {
                    case "Winter" -> price = 17000.00;
                    case "Summer" -> price = 12500.00;
                }
                price = price * 1.25;
            }
            case "London" -> {
                switch (season) {
                    case "Winter" -> price = 24000.00;
                    case "Summer" -> price = 20250.00;
                }
            }
        }

        double totalcost = price * days;
        if (totalcost <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalcost);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalcost - budget);
        }
    }
}
