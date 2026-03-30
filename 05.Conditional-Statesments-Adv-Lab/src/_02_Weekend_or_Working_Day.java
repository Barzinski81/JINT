import java.util.Scanner;

public class _02_Weekend_or_Working_Day {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String day = sc.nextLine();

        switch (day) {
            case "Monday",  "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}
