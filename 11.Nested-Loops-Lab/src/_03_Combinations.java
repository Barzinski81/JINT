import java.util.Scanner;

public class _03_Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int count = 0;

        for (int a = 0; a <= input; a++) {
            for (int b = 0; b <= input ; b++) {
                for (int c = 0; c <= input ; c++) {
                    if (a + b + c == input) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
