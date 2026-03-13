import java.util.Scanner;

public class _03_Deposit_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit = Double.parseDouble(sc.nextLine());
        int months  = Integer.parseInt(sc.nextLine());
        double annualInterestRate = Double.parseDouble(sc.nextLine());

        double interest = deposit * annualInterestRate / 100;
        double monthlyInterest = interest / 12;
        double totalSum = deposit + monthlyInterest *  months;

        System.out.println(totalSum);

    }
}
