import java.util.Scanner;

public class _03_Film_Premiere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        String menu = sc.nextLine();
        int tickets = Integer.parseInt(sc.nextLine());
        double price = 0.00;

        switch (movie) {
            case "John Wick" -> {
                switch (menu) {
                    case "Drink" -> price = 12.00;
                    case "Popcorn" -> price = 15.00;
                    case "Menu" -> price = 19.00;
                }
            }
            case "Star Wars" -> {
                switch (menu) {
                    case "Drink" -> price = 18.00;
                    case "Popcorn" -> price = 25.00;
                    case "Menu" -> price = 30.00;
                }
                if (tickets >= 4) {
                    price = price * 0.70;
                }
            }
            case "Jumanji" -> {
                switch (menu) {
                    case "Drink" -> price = 9.00;
                    case "Popcorn" -> price = 11.00;
                    case "Menu" -> price = 14.00;
                }
                if (tickets == 2) {
                    price = price * 0.85;
                }
            }
        }

        System.out.printf("Your bill is %.2f leva.", price * tickets);
    }
}
