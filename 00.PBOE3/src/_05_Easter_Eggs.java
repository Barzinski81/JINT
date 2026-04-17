import java.util.Scanner;

public class _05_Easter_Eggs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eggs = Integer.parseInt(sc.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;

        for (int i = 0; i < eggs; i++) {
            String color = sc.nextLine();
            switch (color) {
                case "red" -> red++;
                case "orange" -> orange++;
                case "blue" -> blue++;
                case "green" -> green++;
            }
        }

        int max = red;
        String mostEggs = "red";

        if (orange > max) {
            max = orange;
            mostEggs = "orange";
        }
        if (blue > max) {
            max = blue;
            mostEggs = "blue";
        }
        if (green > max) {
            max = green;
            mostEggs = "green";
        }

        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s%n", max,mostEggs);
    }
}
