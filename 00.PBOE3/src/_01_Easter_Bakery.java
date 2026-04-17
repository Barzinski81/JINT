import java.util.Scanner;

public class _01_Easter_Bakery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double flourPrice = Double.parseDouble(sc.nextLine());
        double flourKilograms = Double.parseDouble(sc.nextLine());
        double sugarKilograms = Double.parseDouble(sc.nextLine());
        int eggDozens = Integer.parseInt(sc.nextLine());
        int yeastPackages =  Integer.parseInt(sc.nextLine());

        double sugarPrice = flourPrice * 0.75;
        double eggPrice = flourPrice * 1.10;
        double yeastPrice = sugarPrice * 0.20;

        System.out.printf("%.2f",flourPrice * flourKilograms + sugarPrice * sugarKilograms +
                eggPrice * eggDozens + yeastPrice * yeastPackages);
    }
}
