import java.util.Scanner;

public class _04_Personal_Titles {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if (age >= 16){
            if(gender.equals("m")){
                System.out.println("Mr.");
            } else if (gender.equals("f")){
                System.out.println("Ms.");
            }
        } else {
            if(gender.equals("m")){
                System.out.println("Master");
            } else if (gender.equals("f")){
                System.out.println("Miss");
            }
        }
    }
}
