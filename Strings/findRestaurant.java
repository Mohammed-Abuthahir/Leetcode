// 599. Minimum Index Sum of Two Lists
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findRestaurant{
    public static String[] restaurant(String[] nums1, String[] nums2){
         HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i = 0;i < nums1.length;i++){
            map1.put(nums1[i], i);
        }
        for(int i = 0;i < nums2.length;i++){
            map2.put(nums2[i], i);
        }
        int min = Integer.MAX_VALUE;
        for(String num : nums1){
            if(map1.containsKey(num) && map2.containsKey(num)){
                min = Math.min(min, map1.get(num) + map2.get(num));
            }
        }
        ArrayList<String> nums = new ArrayList<>();
        for(String num : nums1){
            if(map1.containsKey(num) && map2.containsKey(num) && map1.get(num) + map2.get(num) == min){
                nums.add(num);
            }
        }
        String[] arr = new String[nums.size()];
        int i = 0;
        for(String num : nums){
            arr[i++] = num;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n1 = scan.nextInt();
        System.out.println("Enter the size :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1");
        String[] arr1 = new String[n1];
        for(int i = 0;i < arr1.length; i++){
            arr1[i] = scan.next();
        }
        System.out.println("Enter the Arrays 2");
        String[] arr2 = new String[n2];
        for(int i = 0;i < arr2.length; i++){
            arr2[i] = scan.next();
        }
        String[] result = restaurant(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}