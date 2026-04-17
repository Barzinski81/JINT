import java.util.Scanner;

public class _04_Easter_Eggs_Battle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eggsOne = Integer.parseInt(sc.nextLine());
        int eggsTwo = Integer.parseInt(sc.nextLine());
        String input =  sc.nextLine();

        while (!input.equals("End")) {
            if (input.equals("one")) {
                eggsTwo -=1;
            } else if (input.equals("two")) {
                eggsOne -=1;
            }

            if (eggsOne < 1) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsTwo);
                return;
            }
            if (eggsTwo < 1) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsOne);
                return;
            }

            input = sc.nextLine();
        }

        System.out.printf("Player one has %d eggs left.%n", eggsOne);
        System.out.printf("Player two has %d eggs left.%n", eggsTwo);
    }
}
