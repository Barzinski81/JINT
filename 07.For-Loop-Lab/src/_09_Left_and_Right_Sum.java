import java.util.Scanner;

public class _09_Left_and_Right_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < number; i++) {
            int input = Integer.parseInt(sc.nextLine());
            leftSum += input;
        }
        for (int i = 0; i < number; i++) {
            int input = Integer.parseInt(sc.nextLine());
            rightSum += input;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d ", leftSum);
        } else  {
            System.out.printf("No, diff = %d ", Math.abs(leftSum - rightSum));
        }
    }
}
