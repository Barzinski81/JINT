import java.util.Scanner;

public class _01_Old_Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favoriteBook = sc.nextLine();
        String book = sc.nextLine();
        int searchCounter = 0;
        boolean found = false;

        while (!book.equals("No More Books")) {
            if (favoriteBook.equals(book)) {
                found = true;
                break;
            }
            searchCounter++;
            book = sc.nextLine();
        }

        if (found) {
            System.out.printf("You checked %d books and found it.",  searchCounter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",  searchCounter);
        }
    }
}
