// 2155. All Divisions With the Highest Score of a Binary Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxScoreIndices{
    public static List<Integer> maxScore(int[] nums){
        int onecount = 0; int zerocount = 0;
        for(int num : nums){
            if(num == 1) onecount++;
        }
        List<Integer> arr = new ArrayList<>();
        arr.add(zerocount, onecount);
        for(int num : nums){
            if(num == 0) zerocount++;
            else onecount--;
            arr.add(zerocount + onecount);
        }
        int max = Collections.max(arr);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < arr.size(); i++){
            if(arr.get(i) == max) ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        List<Integer> result = maxScore(nums);
        System.out.println(result);
    }
}