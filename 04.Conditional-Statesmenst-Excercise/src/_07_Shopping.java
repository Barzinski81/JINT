import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int videoCards = Integer.parseInt(sc.nextLine());
        int cpus = Integer.parseInt(sc.nextLine());
        int ramModules = Integer.parseInt(sc.nextLine());

        double videoCardPrice = videoCards * 250.00;
        double cpusPrice = cpus * videoCardPrice * 0.35;
        double ramModulesPrice = ramModules * videoCardPrice * 0.10;

        double totalPrice = videoCardPrice + cpusPrice + ramModulesPrice;

        if ( videoCards > cpus) {
            totalPrice = totalPrice * 0.85;
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else if (budget < totalPrice) {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - totalPrice));
        }
    }
}
