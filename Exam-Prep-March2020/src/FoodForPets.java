import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());
        double biscuit = 0;
        int combinedFood = 0;
        int dog = 0;
        int cat = 0;
        for (int i = 1; i <= days; i++) {

            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            dog+=dogFood;
            cat+=catFood;

            combinedFood += dogFood + catFood;

            if (i%3==0)
            {
                biscuit += (dogFood + catFood)*0.1;
            }
        }
        double foodEaten = combinedFood/allFood * 100;
        double catFoodEaten = 1.0*cat/combinedFood * 100;
        double dogFoodEaten = 1.0*dog/combinedFood *100;

        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(biscuit));
        System.out.printf("%.2f%% of the food has been eaten.%n",foodEaten);
        System.out.printf("%.2f%% eaten from the dog.%n",dogFoodEaten);
        System.out.printf("%.2f%% eaten from the cat.",catFoodEaten);
    }
}
