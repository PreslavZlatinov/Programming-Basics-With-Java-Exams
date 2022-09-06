import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        double price = 0;
        double priceForNights = 0;
        switch (roomType)
        {
            case "room for one person":
                price = 18.00;
                priceForNights = (days-1) * price;
                break;

            case "apartment":
                price = 25.00;
                priceForNights = (days-1) * price;
                if(days>15)
                {
                    priceForNights = priceForNights/2;

                }
                else if(days>10 && days<15)
                {
                    priceForNights -= priceForNights*0.35;
                }
                else{
                    priceForNights -= priceForNights*0.30;
                }
                break;

            case "president apartment":
                price = 35.00;
                priceForNights = (days-1) * price;
                if(days>15)
                {
                    priceForNights -= priceForNights*0.2;
                }
                else if(days>10 && days<15)
                {
                    priceForNights -= priceForNights*0.15;
                }
                else{
                    priceForNights -= priceForNights*0.10;
                }
                break;
        }

        if (review.equals("positive"))
        {
            priceForNights += priceForNights*0.25;
        }
        else {
            priceForNights -= priceForNights*0.1;
        }

        System.out.printf("%.2f",priceForNights);
    }
}
