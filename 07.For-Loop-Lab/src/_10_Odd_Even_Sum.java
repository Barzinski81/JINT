import java.util.Scanner;

public class _10_Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = Integer.parseInt(sc.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= number; i++) {
            int input = Integer.parseInt(sc.nextLine());
            if(i % 2 != 0){
                oddSum += input;
            } else{
                evenSum += input;
            }
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        } else  {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddSum - evenSum));
        }
    }
}
