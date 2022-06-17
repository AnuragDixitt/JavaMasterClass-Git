public class BinarySearch {
    public static void main(String[] args){
        System.out.println(binarySearch(new int[] {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}, 254));
    }


    // return the index

    static int binarySearch(int [] a, int target) {
        
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {

            // Find the middle element

            // int mid = (start + end) /2;  // might be possible that (start + end) exceed the range of int in java

            int mid = start + (end - start) / 2;

            if (target <= a[mid]) {
                
                end = mid - 1; // Start will remain same 
            } else if (target > a[mid]) {
                    start = mid + 1;
            } else {
                // answer found
                return mid;
            }     
        }        
        return -1;
    }
}
