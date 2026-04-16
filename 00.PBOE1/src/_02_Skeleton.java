import java.util.Scanner;

public class _02_Skeleton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int controlMinutes = Integer.parseInt(sc.nextLine());
        int controlSeconds = Integer.parseInt(sc.nextLine());
        double lengthInMeters = Double.parseDouble(sc.nextLine());
        int secondsFor100Meters = Integer.parseInt(sc.nextLine());

        int controlTime = controlMinutes * 60 + controlSeconds;
        double slopeDecrease = lengthInMeters / 120 * 2.5;
        double timeMarin = (lengthInMeters / 100) * secondsFor100Meters - slopeDecrease;

        if(timeMarin <= controlTime) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarin);
        } else if (timeMarin > controlTime) {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(controlTime - timeMarin));
        }
    }
}
