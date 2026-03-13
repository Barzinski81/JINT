import java.util.Scanner;

public class _04_Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());

        double inches = a * 2.54;
        System.out.println(inches);

    }
}
