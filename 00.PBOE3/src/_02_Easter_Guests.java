import java.util.Scanner;

public class _02_Easter_Guests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guests = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        int breadRolls = (int) Math.ceil(guests / 3.0);
        int eggs = guests * 2;
        double totalCost =  breadRolls * 4.00 + eggs * 0.45;

        if (totalCost <= budget) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.%n", breadRolls, eggs);
            System.out.printf("He has %.2f lv. left.", budget - totalCost);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",totalCost - budget);
        }

    }
}
