import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String bestPlayer = "";
        while (!playerName.equals("END"))
        {
            int goalsScored = Integer.parseInt(scanner.nextLine());

            if(goalsScored>max)
            {
                max = goalsScored;
                bestPlayer = playerName;
            }

            if(goalsScored>=10)
            {
                break;
            }

            playerName = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n",bestPlayer);
        if (max>=3)
        {
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }
        else {
            System.out.printf("He has scored %d goals.",max);
        }
    }
}
