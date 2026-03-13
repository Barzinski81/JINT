import java.util.Scanner;

public class _07_Projects_Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int projectsNumber = Integer.parseInt(sc.nextLine());

        int hours = projectsNumber * 3;

        System.out.println("The architect " + name + " will need "
                           + hours + " hours to complete " + projectsNumber + " project/s.");
    }
}
