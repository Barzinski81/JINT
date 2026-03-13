import java.util.Scanner;

public class _09_Yard_Greening {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double squareMeters = Double.parseDouble(sc.nextLine());

        double regularPrice = squareMeters * 7.61;
        double discount = regularPrice * 0.18;
        double finalPrice = regularPrice - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: "  + discount + " lv.");

    }
}
