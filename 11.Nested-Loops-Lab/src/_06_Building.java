import java.util.Scanner;

public class _06_Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floors = sc.nextInt();
        int rooms = sc.nextInt();
        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else  {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.printf("%n");
        }
    }
}
