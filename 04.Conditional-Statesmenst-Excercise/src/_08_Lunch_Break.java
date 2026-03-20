import java.util.Scanner;

public class _08_Lunch_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie =  sc.nextLine();
        int episodeDuration = Integer.parseInt(sc.nextLine());
        int breakDuration = Integer.parseInt(sc.nextLine());

        double freeTime = breakDuration - ((breakDuration / 8.0) + (breakDuration / 4.0));

        if (freeTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    movie, Math.ceil(freeTime - episodeDuration));
        } else if (freeTime < episodeDuration) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    movie, (Math.ceil(Math.abs(freeTime - episodeDuration))));
        }
    }
}
