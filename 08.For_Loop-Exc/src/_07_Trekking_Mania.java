import java.util.Scanner;

public class _07_Trekking_Mania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = Integer.parseInt(sc.nextLine());

        double allPeople = 0.00;
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groups; i++) {
            int members = Integer.parseInt(sc.nextLine());
            allPeople += members;
            if (members <= 5) {
                musala += members;
            } else if (members <= 12) {
                monblan += members;
            } else if (members <= 25) {
                kilimanjaro += members;
            } else if (members <= 40) {
                k2 += members;
            }  else {
                everest += members;
            }
        }

        System.out.printf("%.2f%%%n", musala / allPeople * 100);
        System.out.printf("%.2f%%%n", monblan / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro / allPeople * 100);
        System.out.printf("%.2f%%%n", k2 / allPeople * 100);
        System.out.printf("%.2f%%%n", everest / allPeople * 100);
    }
}
