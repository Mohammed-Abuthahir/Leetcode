import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class relativerank{
    public static String[] relative(int[] nums){
        int[] arr = nums.clone();
        Arrays.sort(arr);
        HashMap<Integer,String> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0;i < n;i++){
            if(i == n - 1) map.put(arr[i],"Gold Medal");
            else if(i == n - 2) map.put(arr[i],"Silver Medal");
            else if(i == n - 3) map.put(arr[i],"Bronze Medal");
            else map.put(arr[i] , String.valueOf(n - i));
        }
        String[] res = new String[n];
       for (int i = 0; i < n; i++) {
           res[i] = map.get(nums[i]);
       }
       return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums =  new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        String[] result = relative(nums);
        System.out.println("Result :" + Arrays.toString(result));
    }
}