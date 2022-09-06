import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogramiCount = Integer.parseInt(scanner.nextLine());
        String dogramiType = scanner.nextLine();
        String delivery = scanner.nextLine();
        double dogramiPrice = 0;
        double finalPrice = 0.0;
        switch (dogramiType)
        {
            case "90X130":
                dogramiPrice = 110;
                finalPrice = dogramiPrice * dogramiCount;
                if(dogramiCount>60)
                {
                    finalPrice -= finalPrice*0.08;
                }
                else if(dogramiCount>30){
                    finalPrice -= finalPrice*0.05;
                }
                break;
            case "100X150":
                dogramiPrice = 140;
                finalPrice = dogramiPrice * dogramiCount;
                if(dogramiCount>80)
                {
                    finalPrice -= finalPrice*0.10;
                }
                else if(dogramiCount>40){
                    finalPrice -= finalPrice*0.06;
                }
                break;
            case "130X180":
                dogramiPrice = 190;
                finalPrice = dogramiPrice * dogramiCount;
                if(dogramiCount>50)
                {
                    finalPrice -= finalPrice*0.12;
                }
                else if(dogramiCount>20){
                    finalPrice -= finalPrice*0.07;
                }
                break;
            case "200X300":
                dogramiPrice = 250;
                finalPrice = dogramiPrice * dogramiCount;
                if(dogramiCount>50)
                {
                    finalPrice -= finalPrice*0.14;
                }
                else if(dogramiCount>25){
                    finalPrice -= finalPrice*0.09;
                }
                break;
        }

        if(delivery.equals("With delivery"))
        {
            finalPrice += 60.00;
        }

        if(dogramiCount>99)
        {
            finalPrice -= finalPrice*0.04;
            System.out.printf("%.2f BGN",finalPrice);
        }
        else if(dogramiCount<10)
        {
            System.out.println("Invalid order");
        }
        else {
            System.out.printf("%.2f BGN",finalPrice);
        }

    }
}
