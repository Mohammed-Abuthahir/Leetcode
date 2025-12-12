// 442. Find All Duplicates in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findduplicates{
    public static ArrayList<Integer> duplicates(int[] nums){
         HashSet <Integer> set = new HashSet<>();
         ArrayList <Integer> list = new ArrayList<>();
         for(int num : nums){
            if(set.contains(num)){
                list.add(num);
            }
            else{
                set.add(num);
            }
         }
        return list;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        ArrayList<Integer> result = duplicates(nums);
        System.out.println("Duplicate Elements are :"+result);
    }
}