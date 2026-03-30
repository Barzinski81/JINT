import java.util.Scanner;

public class _11_Fruit_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double price = 0.00;
        boolean validInput = true;

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.50;
                    case "apple" -> price = 1.20;
                    case "orange" -> price = 0.85;
                    case "grapefruit" -> price = 1.45;
                    case "kiwi" -> price = 2.70;
                    case "pineapple" -> price = 5.50;
                    case "grapes" -> price = 3.85;
                    default -> validInput = false;
                }
            }
            case "Saturday", "Sunday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.70;
                    case "apple" -> price = 1.25;
                    case "orange" -> price = 0.90;
                    case "grapefruit" -> price = 1.60;
                    case "kiwi" -> price = 3.00;
                    case "pineapple" -> price = 5.60;
                    case "grapes" -> price = 4.20;
                    default -> validInput = false;
                }
            }
            default -> validInput = false;

        }

        if (validInput) {
            System.out.printf("%.2f",quantity * price);
        }  else {
            System.out.println("error");
        }
    }
}
