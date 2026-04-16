import java.util.Scanner;

public class _06_Cinema_Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        int studentTickets = 0 ;
        int standardTickets = 0 ;
        int kidsTickets = 0 ;
        int allTickets = 0 ;

        while(!movie.equals("Finish")){
            int seats = Integer.parseInt(sc.nextLine());
            String ticketType = sc.nextLine();
            int occupiedSeats = 0;
            while(!ticketType.equals("End") && !ticketType.equals("Finish") && occupiedSeats < seats){
                switch (ticketType){
                    case "student" ->  studentTickets++;
                    case "standard" -> standardTickets++;
                    case "kid" -> kidsTickets++;
                }
                occupiedSeats++;
                allTickets++;
                if (occupiedSeats < seats) {
                    ticketType = sc.nextLine();
                }
            }
            System.out.printf("%s - %.2f%% full.%n", movie, (double) occupiedSeats / seats * 100);
            if (ticketType.equals("Finish")){
                break;
            }
            movie = sc.nextLine();
        }

        System.out.printf("Total tickets: %d%n",  allTickets);
        System.out.printf("%.2f%% student tickets.%n", (double) studentTickets / allTickets * 100 );
        System.out.printf("%.2f%% standard tickets.%n", (double) standardTickets / allTickets * 100 );
        System.out.printf("%.2f%% kids tickets.%n", (double) kidsTickets / allTickets * 100 );
    }
}
