import java.util.Scanner;

public class _06_Favorite_Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        int moviesCount = 0;
        int maxAsciiSum = Integer.MIN_VALUE;
        String bestMovie = "";

        while(!movieName.equals("STOP") && moviesCount < 7){
            int asciiSum = 0;

            for (int i = 0; i < movieName.length(); i++) {
                char character = movieName.charAt(i);
                int characterValue = (int) character;

                if (Character.isUpperCase(character)) {
                    characterValue -= movieName.length();
                } else if (Character.isLowerCase(character)) {
                    characterValue -= 2 * movieName.length();
                }

                asciiSum += characterValue;
            }

            if (asciiSum > maxAsciiSum) {
                maxAsciiSum = asciiSum;
                bestMovie = movieName;
            }

            moviesCount++;
            if(moviesCount == 7){
                break;
            }
            movieName = sc.nextLine();
        }

        if  (moviesCount == 7) {
            System.out.println("The limit is reached.");
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxAsciiSum);
    }
}
