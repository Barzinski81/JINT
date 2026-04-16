import java.util.Scanner;

public class _03_World_Snooker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stage = sc.nextLine();
        String ticketType = sc.nextLine();
        int ticketCount = Integer.parseInt(sc.nextLine());
        char photo = sc.next().charAt(0);
        double ticketPrice = 0.00;

        switch (stage) {
            case "Quarter final" -> {
                switch (ticketType) {
                    case "Standard" -> ticketPrice = 55.50;
                    case "Premium" -> ticketPrice = 105.20;
                    case "VIP" -> ticketPrice = 118.90;
                }
            }
            case "Semi final" -> {
                switch (ticketType) {
                    case "Standard" -> ticketPrice = 75.88;
                    case "Premium" -> ticketPrice = 125.22;
                    case "VIP" -> ticketPrice = 300.40;
                }
            }
            case "Final" -> {
                switch (ticketType) {
                    case "Standard" -> ticketPrice = 110.10;
                    case "Premium" -> ticketPrice = 160.66;
                    case "VIP" -> ticketPrice = 400.00;
                }
            }
        }

        double photoPrice = ticketCount * 40;
        double totalPrice = ticketPrice * ticketCount;

       if (totalPrice <= 2500) {
           if (photo == 'Y') {
               totalPrice = totalPrice + photoPrice;
           }
       } else if (totalPrice <= 4000) {
           totalPrice = totalPrice * 0.90;
           if (photo == 'Y') {
               totalPrice = totalPrice + photoPrice;
           }
       } else{
           totalPrice = totalPrice * 0.75;
       }

        System.out.printf("%.2f", totalPrice);
    }
}
