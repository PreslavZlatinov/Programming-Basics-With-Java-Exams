import java.util.Scanner;

public class BarcodeGeneratorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        int oneFourthNum = numOne % 10;
        int oneThirdNum = numOne/10 % 10;
        int oneSecondNum = numOne/100 % 10;
        int oneFirstNum = numOne/1000 % 10;

        int secondFourthNum = numTwo % 10;
        int secondThirdNum = numTwo/10 % 10;
        int secondSecondNum = numTwo/100 % 10;
        int secondFirstNum = numTwo/1000 % 10;

        for (int i = oneFirstNum; i <= secondFirstNum; i++) {
            for (int j = oneSecondNum; j <= secondSecondNum ; j++) {
                for (int k = oneThirdNum; k <= secondThirdNum; k++) {
                    for (int l = oneFourthNum; l <= secondFourthNum ; l++) {
                        if (i%2!=0 && j%2!=0 && k%2!=0 && l%2!=0)
                        {
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                    }

                }

            }
            
        }
    }
}
