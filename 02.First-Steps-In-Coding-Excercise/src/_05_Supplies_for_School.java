import java.util.Scanner;

public class _05_Supplies_for_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pens = Integer.parseInt(sc.nextLine());
        int markers = Integer.parseInt(sc.nextLine());
        int cleaningFluid =  Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());

        double regularPrice = (pens * 5.80) + (markers * 7.20) + (cleaningFluid * 1.20);
        double finalPrice = regularPrice - (regularPrice * discount / 100);
        System.out.println(finalPrice);
    }
}
