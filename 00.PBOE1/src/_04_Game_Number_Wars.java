import java.util.Scanner;

public class _04_Game_Number_Wars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playerOne = sc.nextLine();
        String playerTwo = sc.nextLine();
        int playerOneScore = 0;
        int playerTwoScore = 0;
        boolean numberWars = false;
        String input = sc.nextLine();
        String winner = "";

        while(!input.equals("End of game")) {
            int numberOne = Integer.parseInt(input);
            int numberTwo = Integer.parseInt(sc.nextLine());
            if (numberOne > numberTwo) {
                playerOneScore += numberOne - numberTwo;
            } else if (numberOne < numberTwo) {
                playerTwoScore += numberTwo - numberOne;
            }  else {
                numberWars = true;
                int numberWarOne = Integer.parseInt(sc.nextLine());
                int numberWarTwo = Integer.parseInt(sc.nextLine());
                if (numberWarOne > numberWarTwo) {
                    winner = playerOne;
                } else {
                    winner = playerTwo;
                }
                break;
            }
            input = sc.nextLine();
        }

        if (numberWars) {
            System.out.println("Number wars!");
            if (winner.equals(playerOne)) {
                System.out.printf("%s is winner with %d points", playerOne, playerOneScore);
            } else {
                System.out.printf("%s is winner with %d points", playerTwo, playerTwoScore);
            }
        } else {
            System.out.printf("%s has %d points%n", playerOne, playerOneScore);
            System.out.printf("%s has %d points%n", playerTwo, playerTwoScore);
        }
    }
}
