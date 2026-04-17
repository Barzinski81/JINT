import java.util.Scanner;

public class _05_Easter_Bake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breadRolls = Integer.parseInt(sc.nextLine());
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;
        int usedSugar = 0;
        int usedFlour = 0;

        for (int i = 0; i < breadRolls; i++) {
            int sugar = Integer.parseInt(sc.nextLine());
            int flour = Integer.parseInt(sc.nextLine());
            usedSugar += sugar;
            usedFlour += flour;

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }

        int sugarPackages = (int) Math.ceil(usedSugar / 950.0);
        int flourPackages = (int) Math.ceil(usedFlour / 750.0);

        System.out.printf("Sugar: %d%n", sugarPackages);
        System.out.printf("Flour: %d%n", flourPackages);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
