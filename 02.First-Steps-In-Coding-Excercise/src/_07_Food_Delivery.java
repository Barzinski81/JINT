import java.util.Scanner;

public class _07_Food_Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(sc.nextLine());
        int fishMenus = Integer.parseInt(sc.nextLine());
        int vegetarianMenus = Integer.parseInt(sc.nextLine());

        double menusPrice = (chickenMenus * 10.35) + (fishMenus * 12.40) + (vegetarianMenus * 8.15);
        double dessertPrice = menusPrice * 0.20;
        double totalPrice = menusPrice + dessertPrice + 2.50;

        System.out.println(totalPrice);
    }
}
