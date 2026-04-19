import java.util.Scanner;

public class _05_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int series = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < series; i++) {
            String seriesName = sc.nextLine();
            double seriesPrice = Double.parseDouble(sc.nextLine());
            switch (seriesName) {
                case "Thrones" -> seriesPrice *= 0.50;
                case "Lucifer" -> seriesPrice *= 0.60;
                case "Protector" -> seriesPrice *= 0.70;
                case "TotalDrama" -> seriesPrice *= 0.80;
                case "Area" -> seriesPrice *= 0.90;
            }
            budget -= seriesPrice;
        }

        if (budget >= 0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }
    }
}
