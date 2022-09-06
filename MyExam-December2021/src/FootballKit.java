import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double priceNeededForBall = Double.parseDouble(scanner.nextLine());

        double shortsPrice = shirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.2;
        double bootsPrice = (shirtPrice + shortsPrice)*2;

        double allSum = shirtPrice + shortsPrice + socksPrice + bootsPrice;
        double finalPrice = allSum - (allSum*0.15);

        if(finalPrice>=priceNeededForBall)
        {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",finalPrice);
        }
        else{
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",priceNeededForBall - finalPrice);
        }

    }
}
