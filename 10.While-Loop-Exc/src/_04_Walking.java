import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSteps = 0;

        while (totalSteps < 10000) {
            String input = sc.nextLine();
            if(input.equals("Going home")){
                int stepsGoingHome = Integer.parseInt(sc.nextLine());
                totalSteps += stepsGoingHome;
                break;
            }
            int steps = Integer.parseInt(input);
            totalSteps += steps;
        }

        if (totalSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", Math.abs(totalSteps - 10000));
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        }
    }
}
