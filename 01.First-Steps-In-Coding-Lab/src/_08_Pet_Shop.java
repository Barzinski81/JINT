import java.util.Scanner;

public class _08_Pet_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogs = Integer.parseInt(sc.nextLine());
        int cats = Integer.parseInt(sc.nextLine());

        double totalSum = (dogs * 2.50) + (cats * 4.00);

        System.out.print(totalSum + " lv.");
    }
}
