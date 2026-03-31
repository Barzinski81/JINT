import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());

        double price = 0.00;
        switch (type) {
            case "Premiere" -> price = 12.00;
            case "Normal" -> price = 7.50;
            case "Discount" -> price = 5.00;
        }

        System.out.printf("%.2f leva", rows * columns * price);
    }
}
