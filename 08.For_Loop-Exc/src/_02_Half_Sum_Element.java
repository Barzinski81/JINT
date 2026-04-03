import java.util.Scanner;

public class _02_Half_Sum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < number; i++) {
            int input = Integer.parseInt(sc.next());
            sum += input;
            if (input > maxNumber) {
                maxNumber = input;
            }
        }

        int sumWithoutMax = sum - maxNumber;
        if (maxNumber == sumWithoutMax) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else  {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumber - sumWithoutMax));
        }
    }
}
