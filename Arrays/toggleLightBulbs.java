// 3842. Toggle Light Bulbs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class toggleLighBulbs{
    public static List<Integer> toggleLightBulbs(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }
            else set.add(num);
        }
        return new ArrayList<>(set);
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
        List<Integer> result = toggleLightBulbs(nums);
        System.out.println(result);

    }
}