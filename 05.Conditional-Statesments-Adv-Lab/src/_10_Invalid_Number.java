import java.util.Scanner;

public class _10_Invalid_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        if ((number < 100 || number > 200) && number != 0) {
            System.out.println("invalid");
        }
    }
}
