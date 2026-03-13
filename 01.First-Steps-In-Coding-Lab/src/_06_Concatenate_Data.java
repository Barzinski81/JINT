import java.util.Scanner;

public class _06_Concatenate_Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fistName = sc.nextLine();
        String lastName = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String town = sc.nextLine();

        System.out.println("You are " + fistName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
    }
}
