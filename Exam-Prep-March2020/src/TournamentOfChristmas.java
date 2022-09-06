import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String gameType = scanner.nextLine();
        int daysCount = 0;
        int wins = 0;
        int lose = 0;
        double allMoney = 0.0;
        while (!(daysCount == days)) {
            double dayMoney = 0.0;
            int winCount = 0;
            int loseCount = 0;
            daysCount++;
            while (!gameType.equals("Finish")) {
                String score = scanner.nextLine();
                if (score.equals("win")) {
                    dayMoney += 20;
                    winCount++;
                } else {
                    loseCount++;
                }

                gameType = scanner.nextLine();
            }
            if (winCount > loseCount) {
                dayMoney += dayMoney * 0.1;
                allMoney += dayMoney;
                wins++;
            } else {
                lose++;
                allMoney += dayMoney;
            }
            if (!(days==daysCount)) {
                gameType = scanner.nextLine();
            }
        }

        if (wins > lose) {
            allMoney += allMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f",allMoney);
        }
        else{
            System.out.printf("You lost the tournament! Total raised money: %.2f",allMoney);
        }
    }
}
