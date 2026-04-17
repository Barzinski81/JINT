import java.util.Scanner;

public class _02_Easter_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guests = Integer.parseInt(sc.nextLine());
        double pricePerPerson = Double.parseDouble(sc.nextLine());
        double budget = Double.parseDouble(sc.nextLine());
        double cakePrice = budget * 0.10;
        double discount = 1.00;

        if  (guests >= 10 && guests <= 15) {
            discount = 0.85;
        } else if (guests > 15 && guests <= 20) {
            discount = 0.80;
        } else if (guests > 20) {
            discount = 0.75;
        }

        double totalCost = guests * pricePerPerson * discount + cakePrice;

        if (totalCost <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - totalCost);
        } else if (totalCost > budget) {
            System.out.printf("No party! %.2f leva needed.", totalCost - budget);
        }
    }
}
