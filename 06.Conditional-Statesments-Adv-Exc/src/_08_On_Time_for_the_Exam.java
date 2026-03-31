import java.util.Scanner;

public class _08_On_Time_for_the_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examHour = Integer.parseInt(sc.nextLine());
        int examMinute = Integer.parseInt(sc.nextLine());
        int arrivalHour = Integer.parseInt(sc.nextLine());
        int arrivalMinute = Integer.parseInt(sc.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int difference = examTime - arrivalTime;
        int absoluteDifference = Math.abs(difference);
        String status = "";

        if (difference < 0) {
            status = "Late";
        } else if (difference <= 30) {
            status = "On time";
        } else {
            status = "Early";
        }

        System.out.println(status);
        if(difference < 0) {
            if(absoluteDifference < 60) {
                System.out.printf("%d minutes after the start", absoluteDifference);
            } else {
                System.out.printf("%d:%02d hours after the start",  absoluteDifference / 60, absoluteDifference % 60);
            }
        } else if (difference > 0) {
            if(absoluteDifference < 60) {
                System.out.printf("%d minutes before the start", absoluteDifference);
            } else {
                System.out.printf("%d:%02d hours before the start",  absoluteDifference / 60, absoluteDifference % 60);
            }
        }

    }
}
