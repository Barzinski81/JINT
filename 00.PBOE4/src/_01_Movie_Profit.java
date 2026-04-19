import java.util.Scanner;

public class _01_Movie_Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        int tickets = Integer.parseInt(sc.nextLine());
        double ticketPrice = Double.parseDouble(sc.nextLine());
        int cinemaPercent = Integer.parseInt(sc.nextLine());

        double profit = days * tickets * ticketPrice;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profit - profit * cinemaPercent / 100 );
    }
}
