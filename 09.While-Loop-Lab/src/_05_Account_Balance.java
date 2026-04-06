import java.util.Scanner;

public class _05_Account_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double total = 0.00;

        while (!input.equals("NoMoreMoney")) {
            double depositAmount = Double.parseDouble(input);
            if (depositAmount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total += depositAmount;
            System.out.printf("Increase: %.2f%n", depositAmount);
            input = sc.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
