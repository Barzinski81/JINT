import java.util.Scanner;

public class _04_Even_Power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= power ; i += 2) {
            System.out.printf("%.0f%n",Math.pow(2, i));
        }
    }
}
