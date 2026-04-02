import java.util.Scanner;

public class _06_Vowels_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case 'a' -> sum += 1;
                case 'e' -> sum += 2;
                case 'i' -> sum += 3;
                case 'o' -> sum += 4;
                case 'u' -> sum += 5;
            }
        }

        System.out.println(sum);
    }
}
