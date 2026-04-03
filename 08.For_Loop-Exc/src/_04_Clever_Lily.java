import java.util.Scanner;

public class _04_Clever_Lily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        double wmPrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());

        double money = 0;
        int toys = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {
           if (i % 2 !=0){
                toys++;
            } else {
                money += (double) i /2 * 10;
                brother++;
            }
        }

        double totalMoney = toyPrice * toys + money - brother;

        if (totalMoney >= wmPrice) {
            System.out.printf("Yes! %.2f", totalMoney - wmPrice);
        } else  {
            System.out.printf("No! %.2f", Math.abs(totalMoney - wmPrice));
        }
    }
}
