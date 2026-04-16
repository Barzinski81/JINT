import java.util.Scanner;

public class _02_Equal_Sums_Even_Odd_Positions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = Integer.parseInt(sc.nextLine());
        int numberTwo = Integer.parseInt(sc.nextLine());

        while (numberOne <= numberTwo) {
            String currentNumber = Integer.toString(numberOne);
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 0; i < currentNumber.length(); i++) {
                int currentDigit = currentNumber.charAt(i) - '0';
                //int currentDigit = Integer.parseInt(currentNumber.charAt(i) + "");
                if (i % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.printf("%d ", numberOne);
            }
            numberOne++;
        }
    }
}
