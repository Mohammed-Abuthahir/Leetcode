// 2032. Two Out of Three
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class twooutofthree{
    public static ArrayList<Integer> outofthree(int[] nums1,int[]  nums2, int[] nums3){
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();
        HashSet<Integer> arr3 = new HashSet<>();
        for(int num : nums1){
            arr1.add(num);
        }
        for(int num : nums2){
            arr2.add(num);
        }
        for(int num : nums3){
            arr3.add(num);
        }
        LinkedHashMap< Integer,Integer> map = new LinkedHashMap<>();
        for(int num1 : arr1){
            map.put(num1,map.getOrDefault(num1, 0 ) + 1);
        }
        for(int num2 : arr2){
            map.put(num2,map.getOrDefault(num2 , 0) + 1);
        }
        for(int num3 : arr3){
            map.put(num3,map.getOrDefault(num3,0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) >= 2){
                ans.add(key);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Size 3");
        int n3 = scan.nextInt();
        System.out.println("Enter the Arays 1:");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arays 2:");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        System.out.println("Enter the Arays 3:");
        int[] nums3 = new int[n3];
        for(int i = 0;i < nums3.length;i++){
            nums3[i] = scan.nextInt();
        }
        ArrayList<Integer> result = outofthree(nums1,nums2,nums3);
        System.out.println(result);
    }
}