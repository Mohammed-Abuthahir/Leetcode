// 1528. Shuffle String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ShuffleString{
    public static String restoreString(String s, int[] nums){
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i], s.charAt(i));
        }
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < nums.length;i++){
            sb.append(map.get(nums[i]));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        String result = restoreString(s, nums);
        System.out.println(result);
    }
}