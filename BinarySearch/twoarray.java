// 2215. Find the Difference of Two Arrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class twoarray{
    public static List<List<Integer>> difference(int[] nums1,int[] nums2){
        List<List<Integer>> arr = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0;i < nums1.length;i++){
            if(!set2.contains(nums1[i])){
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }
        for(int i = 0;i < nums2.length;i++){
            if(!set1.contains(nums2[i])){
                if(!list1.contains(nums2[i])){
                    list1.add(nums2[i]);
                }
            }
        }
        arr.add(list);
        arr.add(list1);
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2");
        int[] nums2 = new int[n2];
        for(int i = 0;i <nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        List<List<Integer>> result = difference(nums1,nums2);
        System.out.println(result);
    }
}