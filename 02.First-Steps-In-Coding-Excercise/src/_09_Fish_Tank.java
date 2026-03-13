import java.util.Scanner;

public class _09_Fish_Tank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double usedSpacePercentage = Double.parseDouble(sc.nextLine());

        double volumeInLitres = length * width * height * 0.001;

        double usableVolume = volumeInLitres * (1 - usedSpacePercentage / 100);

        System.out.println(usableVolume);

    }
}
