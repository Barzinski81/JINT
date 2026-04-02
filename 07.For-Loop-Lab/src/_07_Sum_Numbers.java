import java.util.Scanner;

public class _07_Sum_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i < numbers; i++) {
            int input = Integer.parseInt(sc.nextLine());
            sum += input;
        }

        System.out.println(sum);
    }
}
