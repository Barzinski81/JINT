import java.util.Scanner;

public class _06_World_Swimming_Record {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(sc.nextLine());
        double distanceInMeters = Double.parseDouble(sc.nextLine());
        double secondsPerMeter = Double.parseDouble(sc.nextLine());

        double waterFriction = Math.floor(distanceInMeters / 15) * 12.5;
        double totalTime = distanceInMeters * secondsPerMeter + waterFriction;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else if (totalTime >= recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        }
    }
}
