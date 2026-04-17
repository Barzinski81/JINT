import java.util.Scanner;

public class _01_Oscars_Ceremony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rent = Double.parseDouble(sc.nextLine());

        double statuettes = rent * 0.70;
        double cattering = statuettes * 0.85;
        double sound = cattering / 2;
        System.out.printf("%.2f",(rent + statuettes + cattering + sound));
    }
}
