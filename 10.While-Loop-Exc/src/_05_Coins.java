import java.math.BigDecimal;
import java.util.Scanner;

public class _05_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double change = Double.parseDouble(sc.nextLine());
        int cents = (int)Math.round(change * 100);
        int coins = 0;

        while (cents > 0) {
            if (cents >= 200) {
                cents -= 200;
            } else if (cents >= 100) {
                cents -= 100;
            } else if (cents >= 50) {
                cents -= 50;
            } else if (cents >= 20) {
                cents -= 20;
            } else if (cents >= 10) {
                cents -= 10;
            } else if (cents >= 5) {
                cents -= 5;
            } else if (cents >= 2) {
                cents -= 2;
            } else {
                cents -= 1;
            }
            coins += 1;
        }

        System.out.println(coins);
    }
}
