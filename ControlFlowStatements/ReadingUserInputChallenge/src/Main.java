import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i=1; i <= 10; i++) {
            System.out.println("Enter number #" + i + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int num = scanner.nextInt();
                sum += num;
            } else {
                System.out.println("Invalid Number");
                i--;
            }
            scanner.nextLine();
        }
        System.out.println("Sum :" + sum);

     /*  ***** Sir's Solution *****
        int counter = 0;
        int sum = 0;

        while(true) {     // while(counter < 10)
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {           // remove it for 2nd while statement
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("Sum = " + sum);  */
        scanner.close();
    }
}
