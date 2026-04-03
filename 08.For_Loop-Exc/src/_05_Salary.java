import java.util.Scanner;

public class _05_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabs = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < tabs; i++) {
            String website = sc.nextLine();
            switch (website) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(salary);
    }
}
