import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFats = Integer.parseInt(scanner.nextLine());
        int percentProtein = Integer.parseInt(scanner.nextLine());
        int percentCarbs = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double fatsInGrams = (allCalories*(1.0*percentFats/100))/9;
        double proteinInGrams = (allCalories*(1.0*percentProtein/100))/4;
        double carbsInGrams = (allCalories*(1.0*percentCarbs/100))/4;

        double foodInGrams = fatsInGrams+proteinInGrams+carbsInGrams;

        double caloriesForGrams = allCalories/foodInGrams;

        double result = (100 - percentWater) * caloriesForGrams;

        System.out.printf("%.4f",result/100);
    }
}
