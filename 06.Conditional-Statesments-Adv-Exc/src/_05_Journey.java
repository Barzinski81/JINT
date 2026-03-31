import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String location = "Bulgaria";
        String accommodation = "Hotel";
        double price = 0.00;

        if (budget > 100 && budget <= 1000) {
            location = "Balkans";
        } else if (budget > 1000) {
            location = "Europe";
        }

        switch (location) {
            case "Bulgaria" -> {
                switch (season) {
                    case "summer" -> {
                        price = budget * 0.30;
                        accommodation = "Camp";
                    }
                    case "winter" -> price = budget * 0.70;
                }
            }
            case "Balkans" -> {
                switch (season) {
                    case "summer" -> {
                        price = budget * 0.40;
                        accommodation = "Camp";
                    }
                    case "winter" -> price = budget * 0.80;
                }
            }
            case "Europe" -> price = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n", location);
        System.out.printf("%s - %.2f", accommodation, price);

    }
}
