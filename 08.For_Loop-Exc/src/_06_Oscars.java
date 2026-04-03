import java.util.Scanner;

public class _06_Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double points = Double.parseDouble(sc.nextLine());
        int evaluators = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < evaluators; i++) {
            String evaluatorName = sc.nextLine();
            double evaluatorPoints = Double.parseDouble(sc.nextLine());
            points += (evaluatorName.length() * evaluatorPoints) / 2;

            if (points > 1250.50) {
                break;
            }
        }

       if (points >1250.50) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
        } else if (points <= 1250.50) {
            System.out.printf("Sorry, %s you need %.1f more!",  name, 1250.50 - points);
        }
    }
}
