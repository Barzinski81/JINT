import java.util.Scanner;

public class _01_Series_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        int seasons= Integer.parseInt(sc.nextLine());
        int episodes= Integer.parseInt(sc.nextLine());
        double episodeTime =  Double.parseDouble(sc.nextLine());

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name,
                Math.floor(seasons * episodes * episodeTime * 1.20 + seasons * 10.0));
    }
}
