import java.util.Scanner;

public class _06_High_Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int desiredHeight = Integer.parseInt(sc.nextLine());
        int initialHeight = desiredHeight - 30;
        int failedJumps = 0;
        int attempts = 0;

        while(failedJumps < 3){
            int currentJumpHeight = Integer.parseInt(sc.nextLine());
                attempts++;

            if(currentJumpHeight > initialHeight){
                initialHeight +=5;
                failedJumps = 0;
            } else{
                failedJumps++;
            }

            if(initialHeight > desiredHeight){
                break;
            }
        }

        if(initialHeight > desiredHeight){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", desiredHeight,  attempts);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", initialHeight,  attempts);
        }

    }
}
