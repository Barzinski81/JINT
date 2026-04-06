import java.util.Scanner;

public class _02_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        String text = sc.nextLine();

        while (!text.equals(password)){
            text = sc.nextLine();
        }

        System.out.printf("Welcome %s!%n", username);
    }
}
