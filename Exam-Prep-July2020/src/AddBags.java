import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceAboveTwenty = Double.parseDouble(scanner.nextLine());
        double bagsKilograms = Double.parseDouble(scanner.nextLine());
        int daysUntilTrip = Integer.parseInt(scanner.nextLine());
        int bagsCount = Integer.parseInt(scanner.nextLine());

        double bagsPrice = 0.0;

        if(bagsKilograms < 10)
        {
            bagsPrice = priceAboveTwenty * 0.2;
        }
        else if(bagsKilograms>=10 && bagsKilograms <=20)
        {
            bagsPrice = priceAboveTwenty/2;
        }
        else{
            bagsPrice = priceAboveTwenty;
        }

        if (daysUntilTrip > 30)
        {
            bagsPrice += bagsPrice*0.1;
        }
        else if(daysUntilTrip>=7)
        {
            bagsPrice += bagsPrice*0.15;
        }
        else {
            bagsPrice += bagsPrice * 0.4;

        }

        double finalPrice = bagsPrice * bagsCount;
        System.out.printf("The total price of bags is: %.2f lv. ",finalPrice);
    }
}
