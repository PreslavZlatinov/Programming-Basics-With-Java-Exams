import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int climbers = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblanc = 0;
        int kilim = 0;
        int kTwo = 0;
        int everest = 0;
        int allPeople = 0;
        for (int i = 0; i < climbers ; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());
            allPeople += peopleCount;
            if (peopleCount<=5)
            {
                musala += peopleCount;
            }
            else if(peopleCount<=12)
            {
                monblanc +=peopleCount;
            }
            else if(peopleCount<=25)
            {
                kilim += peopleCount;
            }
            else if(peopleCount <=40)
            {
                kTwo += peopleCount;
            }
            else {
                everest +=peopleCount;
            }

        }

        double musalaPercents = 1.0*musala/allPeople*100;
        double monbPercents = 1.0*monblanc/allPeople*100;
        double kilimPercents = 1.0*kilim/allPeople*100;
        double kTwoPercents = 1.0*kTwo/allPeople*100;
        double everestPercents = 1.0*everest/allPeople*100;
        System.out.printf("%.2f%%%n",musalaPercents);
        System.out.printf("%.2f%%%n",monbPercents);
        System.out.printf("%.2f%%%n",kilimPercents);
        System.out.printf("%.2f%%%n",kTwoPercents);
        System.out.printf("%.2f%%%n",everestPercents);
    }
}
