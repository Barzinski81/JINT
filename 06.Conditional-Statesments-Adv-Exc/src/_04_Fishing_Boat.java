import java.util.Scanner;

public class _04_Fishing_Boat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        int fishermen = Integer.parseInt(sc.nextLine());

        double shipRentalPrice = 4200.00;

        switch (season) {
            case "Spring" -> shipRentalPrice = 3000.00;
            case "Winter" -> shipRentalPrice = 2600.00;
        }

        if (fishermen <= 6) {
            shipRentalPrice = shipRentalPrice * 0.90;
        } else if (fishermen <=11) {
            shipRentalPrice = shipRentalPrice * 0.85;
        } else {
            shipRentalPrice = shipRentalPrice * 0.75;
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            shipRentalPrice = shipRentalPrice * 0.95;
        }

        if(budget >= shipRentalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - shipRentalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - shipRentalPrice));
        }
    }
}
