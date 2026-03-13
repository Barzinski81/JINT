import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int paintSolvent = Integer.parseInt(sc.nextLine());
        int workingHours = Integer.parseInt(sc.nextLine());

        double materialsSum = ((nylon + 2) * 1.50) + (paint * 1.10 * 14.50) + (paintSolvent * 5.00) + 0.40;
        double workersPayment = materialsSum * 0.30 * workingHours;

        double totalPayment = materialsSum + workersPayment;

        System.out.println(totalPayment);
    }
}
