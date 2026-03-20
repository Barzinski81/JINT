import java.util.Scanner;

public class _02_Greater_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
