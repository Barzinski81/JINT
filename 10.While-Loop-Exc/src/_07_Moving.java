import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int z = Integer.parseInt(sc.nextLine());

        int volume = x * y * z;

        while (volume > 0){
            String input = sc.nextLine();
            if (input.equals("Done")){
                break;
            }
            int box = Integer.parseInt(input);
            volume -= box;
        }

        if (volume <= 0){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
