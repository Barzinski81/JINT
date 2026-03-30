import java.util.Scanner;

public class _12_Trade_Commissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double sales = Double.parseDouble(sc.nextLine());

        double commission = 0.00;
        boolean validInput = true;

        switch (city) {
            case "Sofia" -> {
                if (sales < 0) {
                    validInput = false;
                } else if (sales >= 0 && sales <= 500){
                    commission = 0.05;
                } else if (sales <= 1000){
                    commission = 0.07;
                } else if (sales <= 10000){
                    commission = 0.08;
                } else if (sales > 10000){
                    commission = 0.12;
                }
            }
            case "Varna" -> {
                if (sales < 0) {
                    validInput = false;
                } else if (sales >= 0 && sales <= 500){
                    commission = 0.045;
                } else if (sales <= 1000){
                    commission = 0.075;
                } else if (sales <= 10000){
                    commission = 0.10;
                } else if (sales > 10000){
                    commission = 0.13;
                }
            }
            case "Plovdiv" -> {
                if (sales < 0) {
                    validInput = false;
                } else if (sales >= 0 && sales <= 500){
                    commission = 0.055;
                } else if (sales <= 1000){
                    commission = 0.08;
                } else if (sales <= 10000){
                    commission = 0.12;
                } else if (sales > 10000){
                    commission = 0.145;
                }
            }
            default -> validInput = false;
        }
        if (validInput) {
            System.out.printf("%.2f", sales * commission);
        } else {
            System.out.println("error");
        }
    }
}
