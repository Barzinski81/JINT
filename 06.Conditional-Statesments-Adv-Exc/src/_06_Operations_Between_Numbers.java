import java.util.Scanner;

public class _06_Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = Double.parseDouble(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());
        char operation = sc.next().charAt(0);

        double result = 0.00;

        switch (operation) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
            case '%' -> result = number1 % number2;
        }

        String type = "odd";
        if (result % 2 == 0) {
            type = "even";
        }

        if (number2 == 0) {
            System.out.printf("Cannot divide %.0f by zero", number1);
        } else if (operation == '/') {
            System.out.printf("%.0f %c %d = %.2f",  number1, operation, number2, result);
        } else if (operation == '%') {
            System.out.printf("%.0f %c %d = %.0f",  number1, operation, number2, result);
        } else {
            System.out.printf("%.0f %c %d = %.0f - %s",  number1, operation, number2, result, type);
        }
    }
}
