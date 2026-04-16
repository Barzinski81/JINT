import java.util.Scanner;

public class _03_Gymnastics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        String apparatus = sc.nextLine();

        double difficultyScore = 0.00;
        double executionScore = 0.00;

        switch(country) {
            case "Russia" -> {
                switch(apparatus) {
                    case "ribbon" ->{
                        difficultyScore = 9.100;
                        executionScore = 9.400;
                    }
                    case "hoop" -> {
                        difficultyScore = 9.300;
                        executionScore = 9.800;
                    }
                    case "rope" -> {
                        difficultyScore = 9.600;
                        executionScore = 9.000;
                    }
                }
            }
            case "Bulgaria" -> {
                switch(apparatus) {
                    case "ribbon" -> {
                       difficultyScore = 9.600;
                       executionScore = 9.400;
                    }
                    case "hoop" -> {
                        difficultyScore = 9.550;
                        executionScore = 9.750;
                    }
                    case "rope" -> {
                        difficultyScore = 9.500;
                        executionScore = 9.400;
                    }
                }
            }
            case "Italy" -> {
                switch(apparatus) {
                    case "ribbon" -> {
                        difficultyScore = 9.200;
                        executionScore = 9.500;
                    }
                    case "hoop" -> {
                        difficultyScore = 9.450;
                        executionScore = 9.350;
                    }
                    case "rope" -> {
                        difficultyScore = 9.700;
                        executionScore = 9.150;
                    }
                }
            }
        }

        System.out.printf("The team of %s get %.3f on %s.%n", country, difficultyScore + executionScore, apparatus);
        System.out.printf("%.2f%%", (20 - (difficultyScore + executionScore)) / 20 * 100);
    }
}
