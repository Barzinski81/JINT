import java.util.Scanner;

public class _02_Movie_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = Integer.parseInt(sc.nextLine());
        int scenes = Integer.parseInt(sc.nextLine());
        int sceneTime = Integer.parseInt(sc.nextLine());

        int shotsTime = (int)Math.round(time * 0.15 + scenes * sceneTime);

        if(shotsTime <= time){
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", time - shotsTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",shotsTime - time);
        }
    }
}
