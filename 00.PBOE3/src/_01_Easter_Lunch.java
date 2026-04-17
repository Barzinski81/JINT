import java.util.Scanner;

public class _01_Easter_Lunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breadRolls = Integer.parseInt(sc.nextLine());
        int eggDozens = Integer.parseInt(sc.nextLine());
        int cookies = Integer.parseInt(sc.nextLine());

        System.out.printf("%.2f", breadRolls * 3.20 + eggDozens * 4.35 + cookies * 5.40 + eggDozens * 12 * 0.15);
    }
}
