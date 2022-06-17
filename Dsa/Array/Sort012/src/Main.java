public class Main {
    public static void main(String[] args) {
        sort012(new int[]{0, 2, 1, 2, 0}, 5);
    }

    public static void sort012(int[] a, int n) {

        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (a[mid]) {
                case 0 -> {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                }
            }
        }
        for (int data : a) {
            System.out.print(data + " ");
        }
    }
}