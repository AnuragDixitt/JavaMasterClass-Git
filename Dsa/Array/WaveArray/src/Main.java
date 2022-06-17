public class Main {
    public static void main(String[] args) {
        convertToWave(5, new int [] {1,2,3,4,5});
    }

    public static void swap(int [] a, int i, int j) {
        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
    }
    public static void convertToWave(int n, int [] a) {
        for (int i=0; i<n-1; i+=2) {
            swap(a, i, i+1);
        }

        // Loop for accessing each element in the row
        for (int data : a) {
            System.out.print(data + " ");
        }
    }
}