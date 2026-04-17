import java.util.Scanner;

public class _03_Oscars_Week_in_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        String type = sc.nextLine();
        int tickets = Integer.parseInt(sc.nextLine());
        double price = 0.00;

        switch (movieName) {
            case "A Star Is Born" -> {
                switch (type) {
                    case "normal" -> price = 7.50;
                    case "luxury" -> price = 10.50;
                    case "ultra luxury" -> price = 13.50;
                }
            }
            case "Bohemian Rhapsody" -> {
                switch (type) {
                    case "normal" -> price = 7.35;
                    case "luxury" -> price = 9.45;
                    case "ultra luxury" -> price = 12.75;
                }
            }
            case "Green Book" -> {
                switch (type) {
                    case "normal" -> price = 8.15;
                    case "luxury" -> price = 10.25;
                    case "ultra luxury" -> price = 13.25;
                }
            }
            case "The Favourite" -> {
                switch (type) {
                    case "normal" -> price = 8.75;
                    case "luxury" -> price = 11.55;
                    case "ultra luxury" -> price = 13.95;
                }
            }
        }

        System.out.printf("%s -> %.2f lv.", movieName, price * tickets);
    }
}
