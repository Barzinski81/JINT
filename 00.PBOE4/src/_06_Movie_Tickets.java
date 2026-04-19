import java.util.Scanner;

public class _06_Movie_Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.nextLine());
        int a2 = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        for (int i = a1; i <= a2 - 1; i++) {
            char symbol1 = (char)i;

            for (int j = 1; j <= n - 1; j++) {

                for (int k = 1; k <= n / 2 - 1; k++) {

                    if (i % 2 != 0 && (j + k + i) % 2 != 0) {
                        System.out.printf("%c-%d%d%d%n", symbol1, j, k, i);
                    }

                }
            }
        }

    }
}
