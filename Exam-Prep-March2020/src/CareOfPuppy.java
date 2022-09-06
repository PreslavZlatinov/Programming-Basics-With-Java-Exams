import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine());
        int foodInGrams = boughtFood * 1000;
        String eatenFood = scanner.nextLine();

        while (!eatenFood.equals("Adopted"))
        {
            int eatenFoodAsNumber = Integer.parseInt(eatenFood);
            foodInGrams -=eatenFoodAsNumber;

            eatenFood = scanner.nextLine();
        }

        if(foodInGrams>=0)
        {
            System.out.printf("Food is enough! Leftovers: %d grams.",foodInGrams);
        }
        else{
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs(foodInGrams));
        }
    }
}
