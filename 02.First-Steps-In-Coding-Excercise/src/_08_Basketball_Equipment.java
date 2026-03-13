import java.util.Scanner;

public class _08_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yearlyPrice = Integer.parseInt(sc.nextLine());
        double sneakersPrice = yearlyPrice - (yearlyPrice * 0.40);
        double uniformPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = uniformPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.20;

        double equipmentPrice = yearlyPrice + sneakersPrice + uniformPrice + ballPrice + accessoriesPrice;

        System.out.println(equipmentPrice);

    }
}
