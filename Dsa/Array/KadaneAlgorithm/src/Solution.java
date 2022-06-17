public class Solution {
    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[] {1,2,3,-2,5}, 5));
    }

    public static long maxSubArraySum(int[] a, int n) {

        long max = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
