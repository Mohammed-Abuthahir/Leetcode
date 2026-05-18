// 1317. Convert Integer to the Sum of Two No-Zero Integers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class getNoZeroIntegers{
    public static int[] getZeroInteger(int n){
        if(n == 2) return new int[]{1,1};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i <= n ; i++){
            list.add(i);
        }
        int left = 0;
        int right = list.size() - 1;
        List<List<Integer>> result = new ArrayList<>();
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            List<Integer> arr = new ArrayList<>();
            if (n == sum) {
                arr.add(list.get(left));
                arr.add(list.get(right));
                result.add(arr);
                left++;
                right--;
            }
            else if (sum > n) {
                right--;
            }
            else {
                left++;
            }
        }
 
        int[] nums = new int[2];
        for (List<Integer> subset : result) {
            int count = 0;
            for (int i = 0; i < subset.size(); i++) {
                String num = String.valueOf(subset.get(i));
                for (char c : num.toCharArray()) {
                    if ((c - '0') == 0) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                for (int i = 0; i < subset.size(); i++) {
                    nums[i] = subset.get(i);
                }
                return nums;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int[] result = getZeroInteger(n);
        System.out.println(Arrays.toString(result));
    }
}