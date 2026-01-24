// 3005. Count Elements With Maximum Frequency
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countmaxelementfreq{
    public static int countfreq(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i] , 0) + 1);
        }
        int max = Collections.max(map.values());
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(map.get(nums[i]) == max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = countfreq(nums);
        System.out.println("result :"+result);
    }
}