import java.util.Scanner;

public class _07_Hotel_Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int nights = Integer.parseInt(sc.next());

        double studio = 0.00;
        double appartment = 0.00;

        switch (month) {
            case "May", "October" -> {
                studio = 50.00;
                appartment = 65.00;
                if (nights > 7 && nights <= 14) {
                    studio = studio * 0.95;
                } else if (nights > 14) {
                    studio = studio * 0.70;
                }
            }
            case "June", "September" -> {
                studio = 75.20;
                appartment = 68.70;
                if (nights > 14) {
                    studio = studio * 0.80;
                }
            }
            case "July", "August" -> {
                studio = 76.00;
                appartment = 77.00;
            }
        }
        if (nights > 14) {
            appartment = appartment * 0.90;
        }

        System.out.printf("Apartment: %.2f lv. %n", appartment * nights);
        System.out.printf("Studio: %.2f lv. %n", studio * nights);
    }
}
