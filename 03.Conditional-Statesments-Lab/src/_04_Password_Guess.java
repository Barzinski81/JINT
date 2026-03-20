import java.util.Scanner;

public class _04_Password_Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if (input.equals(password)) {
            System.out.println("Welcome");
        } else  {
            System.out.println("Wrong password!");
        }
    }
}
