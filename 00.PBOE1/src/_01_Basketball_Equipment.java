import java.util.Scanner;

public class _01_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearlyPrice =Integer.parseInt(sc.nextLine());

        double sneakersPrice = yearlyPrice * 0.60;
        double uniformPrice = sneakersPrice * 0.80;
        double ballPrice = uniformPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalPrice = yearlyPrice + sneakersPrice + uniformPrice + ballPrice + accessoriesPrice;

        System.out.printf("%.2f%n", totalPrice);
    }
}
