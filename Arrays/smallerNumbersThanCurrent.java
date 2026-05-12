import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class smallerNumbersThanCurrent{
    public static int[] smallerNumber(int[] nums){
        int[] arr = nums.clone();
        Arrays.sort(arr);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(0);
        for(int i = 1;i < arr.length;i++){
            num.add(i);
        }
        for(int i = 0;i < num.size() - 1;i++){
            if(arr[i] == arr[i + 1]){
                num.set(i + 1, num.get(i));
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < num.size();i++){
            map.put(arr[i], num.get(i));
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[size];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = smallerNumber(nums);
        System.out.println(Arrays.toString(nums));
    }
}