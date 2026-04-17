import java.util.Scanner;

public class _03_Painting_Eggs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String size =  sc.nextLine();
        String color = sc.nextLine();
        int batch = Integer.parseInt(sc.nextLine());
        int price = 9;

        switch (size) {
            case "Large" -> {
                switch (color) {
                    case "Red" -> price = 16;
                    case "Green" -> price = 12;
                }
            }
            case "Medium" -> {
                switch (color) {
                    case "Red" -> price = 13;
                    case "Yellow" -> price = 7;
                }
            }
            case "Small" -> {
                switch (color) {
                    case "Green" -> price = 8;
                    case "Yellow" -> price = 5;
                }
            }
        }
        System.out.printf("%.2f leva.", batch * price * 0.65);
    }
}
