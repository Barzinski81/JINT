import java.util.Scanner;

public class _07_Area_of_Figures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        if (type.equals("square")) {
            Double size = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", size * size);
        } else if (type.equals("rectangle")) {
            Double length = Double.parseDouble(sc.nextLine());
            Double width = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", length * width);
        } else if (type.equals("circle")) {
            Double radius = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", Math.PI * radius * radius);
        } else if (type.equals("triangle")) {
            Double base = Double.parseDouble(sc.nextLine());
            Double height = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", base * height / 2);
        } else {
            System.out.println("Invalid type");
        }
    }
}
