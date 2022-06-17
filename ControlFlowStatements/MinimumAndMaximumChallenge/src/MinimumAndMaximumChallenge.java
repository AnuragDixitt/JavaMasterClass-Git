import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int max = 0;                                // For without boolean  max = -2147483638   // For Constants we can use Integer.MIN_VALUE
            int min = 0;                                // For without boolean  min =  2147483638  // For Constants we can use Integer.MAX_VALUE
            boolean first = true;                       // We have to comment out this line for both

            while(true) {
                System.out.println("Enter the number :");
                boolean isAnInt = scanner.hasNextInt();  /* Using this boolean we overcome min wala bug */

                if (isAnInt) {
                    int num = scanner.nextInt();

                    if (first) {                                //This loop also will be comment out (For without boolean)
                        first = false;
                        min = num;
                        max = num;
                    }

                    if (num > max) {
                        max = num;
                    } else {
                        if (num < min) {
                            min = num;
                        }
                    }
                } else {
                    System.out.println("Invalid Number");
                    break;
                }
                scanner.nextLine(); // handle input
            }

            System.out.println("Min : " + min + ", Max : " + max);
            scanner.close();
    }
}
