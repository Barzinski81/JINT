import java.util.Scanner;

public class _01_Tennis_Equipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rocketPrice = Double.parseDouble(sc.nextLine());
        int numberOfRockets = Integer.parseInt(sc.nextLine());
        int numberOfSneakers = Integer.parseInt(sc.nextLine());

        double sneakersPrice = rocketPrice / 6;

        double totalRocketsPrice = rocketPrice * numberOfRockets;
        double totalSneakersPrice = sneakersPrice * numberOfSneakers;

        double equipmentPrice = (totalRocketsPrice + totalSneakersPrice) * 0.20;

        double totalPrice = equipmentPrice + totalRocketsPrice + totalSneakersPrice;

        double djokovicPrice = totalPrice / 8;
        double sponsorsPrice = totalPrice * 7 / 8;

        System.out.println("Price to be paid by Djokovic " + (int)Math.floor(djokovicPrice));
        System.out.println("Price to be paid by sponsors " + (int)Math.ceil(sponsorsPrice));
    }
}
