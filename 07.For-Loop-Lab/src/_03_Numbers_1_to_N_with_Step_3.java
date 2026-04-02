import java.util.Scanner;

public class _03_Numbers_1_to_N_with_Step_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= number ;i +=3 ) {
            System.out.println(i);
        }
    }
}
