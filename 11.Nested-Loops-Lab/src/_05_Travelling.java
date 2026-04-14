import java.util.Scanner;

public class _05_Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String destination = sc.nextLine();

        while (!destination.equals("End")) {
            double availableMoney = 0;
            double requiredMoney = Double.parseDouble(sc.nextLine());
            while (availableMoney < requiredMoney) {
                double money = Double.parseDouble(sc.nextLine());
                availableMoney += money;
            }

            System.out.printf("Going to %s!%n", destination);
            destination = sc.nextLine();
        }
    }
}
