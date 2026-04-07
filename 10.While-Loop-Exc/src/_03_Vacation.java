import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double requiredMoney = Double.parseDouble(sc.nextLine());
        double availableMoney = Double.parseDouble(sc.nextLine());
        int consequtiveSpendDays = 0;
        int days = 0;

        while(requiredMoney > availableMoney && consequtiveSpendDays < 5){
            String action = sc.nextLine();
            double money = Double.parseDouble(sc.nextLine());
            days++;
            if (action.equals("spend")){
                consequtiveSpendDays++;
                availableMoney -= money;
            }else if (action.equals("save")){
                consequtiveSpendDays = 0;
                availableMoney += money;
            }
            if (availableMoney < 0){
                availableMoney = 0;
            }
        }

        if  (consequtiveSpendDays == 5){
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
