// 324. Wiggle Sort II
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class wigglesort{
    public static int[] wigglesorting(int[] nums){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        ArrayList<Integer>firstHalf = new ArrayList<>();
        ArrayList<Integer>secondhalf = new ArrayList<>();
        for(int i = 0;i <= mid ;i++){
            firstHalf.add(nums[i]);
        }
        for(int i = mid + 1;i<nums.length;i++){
            secondhalf.add(nums[i]);
        }
        left = 0;
         right = firstHalf.size() - 1;
        while(left <= right){
            int temp = firstHalf.get(left);
            firstHalf.set(left,firstHalf.get(right));
            firstHalf.set(right,temp);
            left++;
            right--;
        }
        left = 0;
        right = secondhalf.size() - 1;
        while(left <= right){
            int temp = secondhalf.get(left);
            secondhalf.set(left,secondhalf.get(right));
            secondhalf.set(right,temp);
            left++;
            right--;
        }
        int i = 0;
        int idx = 0;
        while(i < firstHalf.size() || i < secondhalf.size()){
            if(i < firstHalf.size()){
                nums[idx++] = firstHalf.get(i);
            }
            if(i < secondhalf.size()){
                nums[idx++] = secondhalf.get(i);
            }
            i++;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = wigglesorting(nums);
        System.out.println("After Wiggle sort :"+Arrays.toString(result));
    }
}