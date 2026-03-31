import java.util.Scanner;

public class _03_New_House {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flowers = sc.nextLine();
        int number =  Integer.parseInt(sc.nextLine());
        double budget = Double.parseDouble(sc.nextLine());

        double price = 0.00;

        switch (flowers) {
            case "Roses" -> {
                price = 5.00 * number;
                if (number > 80){
                    price = price * 0.90;
                }
            }
            case "Dahlias" -> {
                price = 3.80 * number;
                if (number > 90){
                    price = price * 0.85;
                }
            }
            case "Tulips" -> {
                price = 2.80 * number;
                if (number > 80){
                    price = price * 0.85;
                }
            }
            case "Narcissus" -> {
                price = 3.00 * number;
                if (number < 120){
                    price = price * 1.15;
                }
            }
            case "Gladiolus" -> {
                price = 2.50 * number;
                if (number < 80){
                    price = price * 1.20;
                }
            }
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    number, flowers, (budget - price));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - price));
        }
    }
}
