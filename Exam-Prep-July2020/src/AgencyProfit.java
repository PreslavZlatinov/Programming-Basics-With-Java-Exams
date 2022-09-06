import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String avioName = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double netPrice = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double priceForKids = netPrice - (netPrice*0.7);
        double allPrice = (netPrice + serviceTax)*adultTickets + (priceForKids+serviceTax)*childTickets;
        double agencyProfit = allPrice*0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",avioName,agencyProfit);
    }
}
