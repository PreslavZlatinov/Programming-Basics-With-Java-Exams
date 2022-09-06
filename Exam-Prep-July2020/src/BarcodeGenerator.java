import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int iterations = 0;
        for (int i = numOne; i <= numTwo ; i++) {
            String currNum = "" + i;
            for (int j = 0; j < currNum.length(); j++) {
                int currDigit = Integer.parseInt(String.valueOf(currNum.charAt(j)));

                if (currDigit%2==0)
                {
                    break;
                }
                else {
                    System.out.print(currDigit);
                    iterations++;
                }
            }

            if (iterations == currNum.length())
            {
                System.out.print(" ");
            }
        }
    }
}
