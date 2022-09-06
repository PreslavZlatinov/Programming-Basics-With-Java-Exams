import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int movieCount = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        String movieName ="";
        String lowest = "";
        String highest = "";
        double sumRating = 0;
        for (int i = 0; i < movieCount; i++) {
            movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRating +=rating;
            if(rating>max)
            {
                max = rating;
                highest = movieName;
            }
            else if(rating<min){
                min = rating;
                lowest = movieName;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n",highest,max);
        System.out.printf("%s is with lowest rating: %.1f%n",lowest,min);
        System.out.printf("Average rating: %.1f",sumRating/movieCount);
    }
}
