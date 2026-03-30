import java.util.Scanner;

public class _08_Cinema_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        int price = 12;

        switch (day){
        case "Wednesday", "Thursday" -> price = 14;
        case "Saturday", "Sunday" -> price = 16;
        }
        System.out.println(price);
    }
}
