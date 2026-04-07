import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int size = x * y;

        while (size > 0) {
            String input = sc.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int pieces = Integer.parseInt(input);
            size = size - pieces;
        }

        if (size <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(size));
        } else {
            System.out.printf("%d pieces are left.", size);
        }

    }
}
