// 914. X of a Kind in a Deck of Cards
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class hasGroupsSizeX{
    public static boolean hasgroupsizex(int[] nums){
         if(nums[0] == 1 && nums.length == 1) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> arr = new ArrayList<>(map.values());
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(i) != arr.get(j)){
                    int a = arr.get(i);
                    int b = arr.get(j);
                    while(b != 0){
                        int temp = a % b;
                        a = b;
                        b = temp;
                    }
                    min = Math.min(min , a);
                }
            }
        }
        return min > 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length ; i++){
            nums[i] = scan.nextInt();
        }
        boolean result = hasgroupsizex(nums);
        System.out.println(result);

    }
}