public class OrderAgnosticBS {
    public static void main(String[] args) {
        System.out.println(orderAgnosticBS(new int[] {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}, 22));

        System.out.println(orderAgnosticBS(new int[] {99, 80, 75, 22, 11, 10, 5, 2, -3}, 22));
    }

    static int orderAgnosticBS(int[] a, int target) {

        int start = 0;
        int end = a.length - 1;

        // Find whether the array is sorted in ascending or descending

        boolean isAsc ;
        if (a[start] < a[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {

            // Find the middle element

            // int mid = (start + end) /2;  // might be possible that (start + end) exceed the range of int in java

            int mid = start + (end - start) / 2;

            if (a[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < a[mid]) {
                    end = mid - 1; // Start will remain same 
                } else {
                    start = mid + 1;
                }
            }
             else {
                if (target < a[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }     
        }        
        return -1;
    }
}
