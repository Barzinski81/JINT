import java.util.Scanner;

public class _08_Number_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int currentMaxNumber = Integer.MIN_VALUE;
        int currentMinNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers; i++) {
            int input = Integer.parseInt(sc.nextLine());

            if (input > currentMaxNumber) {
                currentMaxNumber = input;
            }
            if (input < currentMinNumber) {
                currentMinNumber = input;
            }
        }

        System.out.printf("Max number: %d%n", currentMaxNumber);
        System.out.printf("Min number: %d%n", currentMinNumber);
    }
}