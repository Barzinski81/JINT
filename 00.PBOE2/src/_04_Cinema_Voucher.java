import java.util.Scanner;

public class _04_Cinema_Voucher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voucher = Integer.parseInt(sc.nextLine());
        String purchase = sc.nextLine();
        int tickets = 0;
        int others = 0;

        while (!purchase.equals("End") && voucher > 0) {
            int charOne = purchase.charAt(0);

            if (purchase.length() <= 8) {
                voucher -= charOne;
            } else {
                int charTwo = purchase.charAt(1);
                voucher -= (charOne + charTwo);
            }

            if (voucher >= 0) {
                if (purchase.length() <= 8) {
                    others++;
                } else {
                    tickets++;
                }
            }

            if (voucher > 0) {
                purchase = sc.nextLine();
            }
        }

        System.out.println(tickets);
        System.out.println(others);
    }
}
