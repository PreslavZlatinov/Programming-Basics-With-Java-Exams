import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int standard = 0;
        int kid = 0;
        int student = 0;
        int totalTickets = 0;

        while (!movieName.equals("Finish"))
        {
            int seats = Integer.parseInt(scanner.nextLine());
            int currTickets = 0;

            for (int i = 0; i < seats; i++) {
                String ticketType = scanner.nextLine();
                if(ticketType.equals("student"))
                {
                    student++;
                    currTickets++;
                }
                else if(ticketType.equals("standard"))
                {
                    standard++;
                    currTickets++;
                }
                else if(ticketType.equals("kid"))
                {
                    kid++;
                    currTickets++;
                }
                if(ticketType.equals("End"))
                {
                    break;
                }
            }

            totalTickets +=currTickets;
            System.out.printf("%s - %.2f%% full.%n",movieName,(1.0*currTickets/seats)*100);
            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",(1.0*student/totalTickets)*100);
        System.out.printf("%.2f%% standard tickets.%n",(1.0*standard/totalTickets)*100);
        System.out.printf("%.2f%% kids tickets.",(1.0*kid/totalTickets)*100);
    }
}
