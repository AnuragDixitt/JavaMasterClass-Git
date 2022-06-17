public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        // Euclid
        while (first != second) {
            if (first > second) {
                first = first - second;
                System.out.println(first);
            } else second = second - first;
            System.out.println(second);
        }
        return second;
    }
}
