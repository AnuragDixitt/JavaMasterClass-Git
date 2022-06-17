public class MissingNumberInArray {
    public static void main(String[] args) {

        System.out.println(MissingNumber(new int[] {1,2,3,5}, 5));
    }
    public static int MissingNumber(int[] a, int n) {

        int xor = 0;
        for (int i: a) {
            xor = xor ^ i;
        }

        for (int i=1; i<=n ; i++) {
            xor = xor ^ i;
        }
        return xor;
    }
}