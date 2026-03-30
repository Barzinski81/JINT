import java.util.Scanner;

public class _07_Working_Hours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        String day =  sc.nextLine();

        String office = "closed";
        if (hour >= 10 && hour <=18){
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                    day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday")){
                office = "open";
            }
        }
        System.out.println(office);
    }
}
