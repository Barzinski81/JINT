import java.util.Scanner;

public class _05_Special_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int number = 1111; number <= 9999; number++) {
            int currentNumber = number;
            boolean special = true;

            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;
                if (lastDigit == 0 || n % lastDigit != 0) {
                    special = false;
                    break;
                }
                currentNumber = currentNumber / 10;
            }

            if (special) {
                System.out.printf("%d ", number);
            }
        }
    }
}
