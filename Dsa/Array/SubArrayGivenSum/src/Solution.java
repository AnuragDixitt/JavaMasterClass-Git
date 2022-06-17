import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        System.out.println(SubArrayGivenSum(new int[] {1,2,3,7,5} , 5, 12));
    }

    static ArrayList<Integer> SubArrayGivenSum(int [] a, int n, int sum) {

        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = 0;
        int currSum = 0;

        try {
            while (left <= right) {
                if (currSum == sum) {
                    list.add(left + 1);
                    list.add(right);
                    break;
                }

                if (currSum < sum) {
                    currSum += a[right];
                    System.out.println(right);
                    right++;
                }

                if (currSum > sum) {
                    currSum -= a[left];
                    left++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (list.size() == 0) {
                list.add(-1);
            }
        }
        return list;
    }
}
