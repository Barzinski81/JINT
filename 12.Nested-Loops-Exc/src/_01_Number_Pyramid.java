import java.util.Scanner;

public class _01_Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int start = 0;

        for (int rows = 1; rows <= input; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                start++;
                System.out.printf("%d ", start);
                if (start == input) {
                    return;
                }
            }
            System.out.println();
        }
    }
}
