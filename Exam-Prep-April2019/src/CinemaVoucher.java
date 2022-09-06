import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherPrice = Integer.parseInt(scanner.nextLine());
        String pokupka = scanner.nextLine();
        int ticketCount = 0;
        int drugiPokupki = 0;
        while(!pokupka.equals("End") || voucherPrice <=0)
        {
            if (pokupka.length()>8)
            {
                int symbolOne = pokupka.charAt(0);
                int symbolTwo = pokupka.charAt(1);
                int price = symbolOne + symbolTwo;
                if(price>voucherPrice)
                {
                    break;
                }
                ticketCount++;
                voucherPrice -= price;
            }
            else {
                int price = pokupka.charAt(0);
                if(price>voucherPrice)
                {
                    break;
                }
                drugiPokupki++;
                voucherPrice -= price;
            }

            pokupka = scanner.nextLine();
        }

        System.out.println(ticketCount);
        System.out.println(drugiPokupki);
    }
}
