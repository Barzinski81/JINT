import java.util.Scanner;

public class _03_Easter_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String destination = sc.nextLine();
        String dateInterval = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());
        int price = 32;

        switch (destination) {
            case "France" -> {
                switch (dateInterval) {
                    case "21-23" -> price = 30;
                    case "24-27" -> price = 35;
                    case "28-31" -> price = 40;
                }
            }
            case "Italy" -> {
                switch (dateInterval) {
                    case "21-23" -> price = 28;
                    case "28-31" -> price = 39;
                }
            }
            case "Germany" -> {
                switch (dateInterval) {
                    case "24-27" -> price = 37;
                    case "28-31" -> price = 43;
                }
            }
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, (double) price * nights);
    }
}
