import java.util.Scanner;

public class _09_Ski_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        String review = sc.nextLine();

        int nights = days - 1;
        double price = 0.00;

        switch (type) {
            case "room for one person" -> price = 18.00 * nights;
            case "apartment" -> {
                price = 25.00 * nights;
                if(days < 10) {
                    price = price * 0.70;
                } else if (days > 10 && days <= 15) {
                    price = price * 0.65;
                } else {
                    price = price * 0.50;
                }
            }
            case "president apartment" -> {
                price = 35.00 * nights;
                if(days < 10) {
                    price = price * 0.90;
                } else if (days > 10 && days <= 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.80;
                }
            }
        }

        switch (review) {
            case "positive" -> price = price * 1.25;
            case "negative" -> price = price * 0.90;
        }

        System.out.printf("%.2f", price);
    }
}
