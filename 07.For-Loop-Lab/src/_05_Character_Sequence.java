import java.util.Scanner;

public class _05_Character_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            System.out.println(character);
        }
    }
}
