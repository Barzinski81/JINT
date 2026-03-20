import java.util.Scanner;

public class _04_Toy_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double journeyPrice = Double.parseDouble(sc.nextLine());
        int puzzles = Integer.parseInt(sc.nextLine());
        int dolls = Integer.parseInt(sc.nextLine());
        int bears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());

        int allToys = puzzles + dolls + bears + minions + trucks;

        double puzzlePrice = puzzles * 2.60;
        double dollsPrice = dolls * 3.00;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2.00;

        double totalToysPrice = puzzlePrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

        if (allToys >= 50) {
            totalToysPrice = totalToysPrice * 0.75;
        }

        double rent = totalToysPrice * 0.10;

        double profit = totalToysPrice - rent;

        double remainingMoney = profit - journeyPrice;

        if (profit >= journeyPrice) {
            System.out.printf("Yes! %.2f lv left.", remainingMoney);
        } else if (profit < journeyPrice) {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(remainingMoney));
        }
    }
}
