import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int sum = 0;
        int count = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                sum += num;
                count++;

            } else {
                double average = (double) sum / count;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
