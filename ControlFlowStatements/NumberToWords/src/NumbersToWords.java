public class NumbersToWords {

    public static void main(String[] args) {
            numbersToWords(100);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 1;
            while (number > 9) {
                number /= 10;
                count ++;
            }
            return count;
    }
    public static int reverseNumber(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;

            number /= 10;
        }
        return reverseNumber;
    }
    public static void numbersToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Number");
        }

        int reverseNumber = reverseNumber(number);
        for (int i=0; i < getDigitCount(number); i++) {
            int digit = reverseNumber % 10;

            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("First");
                case 2 -> System.out.println("Second");
                case 3 -> System.out.println("Third");
                case 4 -> System.out.println("Fourth");
                case 5 -> System.out.println("Fifth");
                case 6 -> System.out.println("Sixth");
                case 7 -> System.out.println("Seventh");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> throw new IllegalStateException("Unexpected value: " + digit);
            }
            reverseNumber /= 10;
        }
        System.out.println();
    }
}
