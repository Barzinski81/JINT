import java.util.Scanner;

public class _03_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numbers = sc.nextInt();
        int p1 =0;
        int p2 =0;
        int p3 =0;
        int p4 =0;
        int p5 =0;

        for (int i = 0; i < numbers; i++) {
            int input = Integer.parseInt(sc.next());
            if (input < 200) {
                p1 += 1;
            }else if (input <= 399) {
                p2 += 1;
            } else if (input <= 599) {
                p3 += 1;
            } else if (input <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }

        System.out.printf("%.2f%%%n", p1 / numbers * 100);
        System.out.printf("%.2f%%%n", p2 / numbers * 100);
        System.out.printf("%.2f%%%n", p3 / numbers * 100);
        System.out.printf("%.2f%%%n", p4 / numbers * 100);
        System.out.printf("%.2f%%%n", p5 / numbers * 100);
    }
}
