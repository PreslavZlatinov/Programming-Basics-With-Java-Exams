import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allLiters = 0;
        double allDegrees = 0;
        for (int i = 1; i <= days; i++) {

            double rakiaQuantity = Double.parseDouble(scanner.nextLine());
            double rakiaDegrees = Double.parseDouble(scanner.nextLine());
            allLiters += rakiaQuantity;
            allDegrees += rakiaDegrees * rakiaQuantity;

        }
        double finalDegrees = allDegrees/allLiters;


        System.out.printf("Liter: %.2f%n", allLiters);
        System.out.printf("Degrees: %.2f%n",finalDegrees);


        if(finalDegrees>42)
        {
            System.out.print("Dilution with distilled water!");
        }
        else if(finalDegrees>38 && finalDegrees<42)
        {
            System.out.print("Super!");
        }
        else{
            System.out.print("Not good, you should baking!");
        }
    }
}
