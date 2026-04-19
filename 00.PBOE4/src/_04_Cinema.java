import java.util.Scanner;

public class _04_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int occupiedSeats = 0;
        int totalIncome = 0;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);

            if (capacity - people >= 0) {
                capacity -= people;
                occupiedSeats += people;
                int income = people * 5;
                if (people % 3 == 0) {
                    income -= 5;
                }
                totalIncome += income;
            } else {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.", totalIncome);
                return;
            }

            input = sc.nextLine();
        }

        System.out.printf("There are %d seats left in the cinema.%n", capacity);
        System.out.printf("Cinema income - %d lv.", totalIncome);
    }
}
