import java.util.Scanner;

public class _03_Animal_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal =  sc.nextLine();

        switch (animal){
            case "dog" -> System.out.println("mammal");
            case "crocodile", "tortoise", "snake" -> System.out.println("reptile");
            default -> System.out.println("unknown");
        }
    }
}
