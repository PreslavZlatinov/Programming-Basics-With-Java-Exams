import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String activity = scanner.nextLine();
        double price = 0;

        switch (activity)
        {
            case "Gym":
                if (gender.equals("m"))
                {
                    price = 42;
                }
                else{
                    price = 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m"))
                {
                    price = 41;
                }
                else{
                    price = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m"))
                {
                    price = 45;
                }
                else{
                    price = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m"))
                {
                    price = 34;
                }
                else{
                    price = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m"))
                {
                    price = 51;
                }
                else{
                    price = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m"))
                {
                    price = 39;
                }
                else{
                    price = 37;
                }
                break;
        }

        if (age<=19)
        {
            price = price * 0.8;
        }

        if (money>=price)
        {
            System.out.printf("You purchased a 1 month pass for %s.",activity);
        }
        else{
            System.out.printf("You don't have enough money! You need $%.2f more.",Math.abs(price-money));
        }
    }
}
