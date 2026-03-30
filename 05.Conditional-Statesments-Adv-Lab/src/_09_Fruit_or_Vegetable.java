import java.util.Scanner;

public class _09_Fruit_or_Vegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String product = "";
        switch (name){
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> product = "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> product = "vegetable";
            default -> product = "unknown";
        }
        System.out.println(product );
    }
}
