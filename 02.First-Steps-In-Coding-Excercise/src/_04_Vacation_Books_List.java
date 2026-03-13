import java.util.Scanner;

public class _04_Vacation_Books_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pagesPerBook = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int totalTime = pagesPerBook / pagesPerHour;
        int hoursPerDay = totalTime / days;

        System.out.println(hoursPerDay);
    }
}
