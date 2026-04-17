import java.util.Scanner;

public class _04_Easter_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialEggs = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int purchasedEggs = 0;

        while (!input.equals("Close")) {
            int eggs =  Integer.parseInt(sc.nextLine());
            switch (input) {
                case "Buy" -> {
                    if (initialEggs < eggs) {
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.", initialEggs);
                        return;
                    }
                    initialEggs -=  eggs;
                    purchasedEggs += eggs;
                }
                case "Fill" -> initialEggs +=  eggs;
            }
            input = sc.nextLine();
        }

        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.", purchasedEggs);
    }
}
