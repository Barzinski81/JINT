import java.util.Scanner;

public class _03_Sum_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while (firstNumber > sum) {
            int newNumber = Integer.parseInt(sc.nextLine());
            sum += newNumber;
        }

        System.out.println(sum);
    }
}
