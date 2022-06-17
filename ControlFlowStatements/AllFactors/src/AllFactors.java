public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int factors = 0;
        for (int i=1; i <= number; i++) {
            if (number % i == 0) {
                factors = i;
                System.out.println(factors);
            }
        }
    }
}
