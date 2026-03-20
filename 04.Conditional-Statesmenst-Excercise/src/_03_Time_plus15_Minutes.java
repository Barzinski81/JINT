import java.util.Scanner;

public class _03_Time_plus15_Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int totalTime = hours * 60 + minutes;
        int newTime = totalTime +15;
        int newTimeHours = (newTime / 60) % 24;
        int newTimeMinutes = newTime % 60;

        if  (newTimeMinutes < 10) {
            System.out.printf("%d:%02d", newTimeHours, newTimeMinutes);
        } else {
            System.out.printf("%d:%d", newTimeHours, newTimeMinutes);
        }
    }
}
