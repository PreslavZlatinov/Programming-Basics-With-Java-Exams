import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bagCapacity = Double.parseDouble(scanner.nextLine());
        String currentBag = scanner.nextLine();
        int bagCount = 0;
        while (!currentBag.equals("End")) {

         double obemAsDouble = Double.parseDouble(currentBag);

            if(obemAsDouble <= 0)
            {
                currentBag = scanner.nextLine();
                continue;
            }
            if(bagCapacity<obemAsDouble)
            {
                System.out.println("No more space!");
                break;
            }
            bagCount++;
             if (bagCount%3==0)
             {
                obemAsDouble += obemAsDouble*0.1;
             }

             bagCapacity -= obemAsDouble;

             if (bagCapacity<0)
             {
                 System.out.println("No more space!");
                 break;
             }

            currentBag = scanner.nextLine();
        }

        if(currentBag.equals("End"))
        {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.",bagCount);
    }
}
