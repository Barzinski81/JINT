import java.util.Scanner;

public class _05_Godzilla_vs_Kong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double clothingPrice = Double.parseDouble(sc.nextLine());

        double decorationPrice = budget * 0.10;
        double totalClothingPrice = statists * clothingPrice;

        if (statists >= 150) {
            totalClothingPrice = totalClothingPrice * 0.90;
        }

        double totalPrice = decorationPrice + totalClothingPrice;
        double difference = budget - totalPrice;

        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(difference));
        } else if (totalPrice <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }

    }
}
