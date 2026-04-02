import java.util.Scanner;

public class _02_Numbers_N_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
