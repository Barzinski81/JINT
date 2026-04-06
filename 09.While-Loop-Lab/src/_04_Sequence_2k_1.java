import java.util.Scanner;

public class _04_Sequence_2k_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int start = 1;

       while (start <= number) {
           System.out.println(start);
           start = start * 2 + 1;
       }
    }
}
