import java.util.Scanner;

public class _04_Sum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());
        int iteration = 0;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                iteration++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", iteration, i, j, i + j);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d",  iteration, magicNumber);

    }
}
