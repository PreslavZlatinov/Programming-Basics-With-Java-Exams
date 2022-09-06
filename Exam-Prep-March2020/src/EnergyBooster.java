import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String packageSize = scanner.nextLine();
        int packageOrdered = Integer.parseInt(scanner.nextLine());
        double productPrice = 0;
        switch (fruit)
        {
            case "Watermelon":
                if(packageSize.equals("small"))
                {
                    productPrice = 2*56;
                }
                else {
                    productPrice = 5*28.70;
                }
                break;

            case "Mango":
                if(packageSize.equals("small"))
                {
                    productPrice = 2*36.66;
                }
                else {
                    productPrice = 5*19.60;
                }
                break;

            case "Pineapple":
                if(packageSize.equals("small"))
                {
                    productPrice = 2*42.10;
                }
                else {
                    productPrice = 5*24.80;
                }
                break;

            case "Raspberry":
                if(packageSize.equals("small"))
                {
                    productPrice = 2*20;
                }
                else {
                    productPrice = 5*15.20;
                }
                break;
        }

        double allPrice = productPrice * packageOrdered;

        if (allPrice>=400 && allPrice<=1000)
        {
            allPrice = allPrice * 0.85;
        }
        else if(allPrice>1000)
        {
            allPrice = allPrice/2;
        }

        System.out.printf("%.2f lv.",allPrice);
    }
}
