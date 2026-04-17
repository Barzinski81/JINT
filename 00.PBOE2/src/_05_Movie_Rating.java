import java.util.Scanner;

public class _05_Movie_Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int movies = Integer.parseInt(sc.nextLine());
        double highestRating = Double.MIN_VALUE;
        double lowestRating = Double.MAX_VALUE;
        String hRating = "";
        String lRating = "";
        double ratingSum = 0.00;

        for (int i = 0; i < movies; i++) {
            String movieName = sc.nextLine();
            double rating = Double.parseDouble(sc.nextLine());
            ratingSum += rating;
            if (rating > highestRating) {
                highestRating = rating;
                hRating = movieName;
            }
            if (rating < lowestRating) {
                lowestRating = rating;
                lRating = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", hRating, highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lRating, lowestRating);
        System.out.printf("Average rating: %.1f%n", ratingSum / movies);
    }
}
