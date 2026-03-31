import java.util.Scanner;

public class _02_Summer_Outfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degrees = Integer.parseInt(sc.nextLine());
        String time = sc.nextLine();

        String outfit = "Shirt";
        String shoes = "Moccasins";

        switch (time){
            case "Morning" -> {
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees <= 24) {

                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
            }
            case "Afternoon" -> {
                if (degrees >= 10 && degrees <= 18){

                } else if (degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",  degrees, outfit, shoes);
    }
}
