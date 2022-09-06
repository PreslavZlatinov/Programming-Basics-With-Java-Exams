import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstNumber = n%10;
        int secondNumber = (n/10)%10;
        int thirdNumber = (n/100)%10;


        for (int i = 1; i <= firstNumber; i++) {
            for (int j = 1; j <= secondNumber ; j++) {
                for (int k = 1; k <= thirdNumber; k++) {
                    int result = i * j * k;

                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,result);
                }
            }

        }
    }
}
