// 944. Delete Columns to Make Sorted
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class deletecolumntosort{
    public static int minDeletionSize(String[] nums){
        int n = nums[0].length();
        char arr[][] = new char[nums.length][n];
        ArrayList<Character> list = new ArrayList<>();
        for(String num : nums){
            for(char c : num.toCharArray()){
                 list.add(c);
            }
        }
        int count = 0;
        int idx = 0;
        if(nums.length * n == list.size()){
            for(int i = 0;i < arr.length;i++){
                for(int j = 0;j < arr[i].length;j++){
                    arr[i][j] = list.get(idx++);
                }
            }
            for(int j = 0; j < arr[0].length; j++) {
               for(int i = 0; i < arr.length - 1; i++) {
                   if(arr[i][j] > arr[i + 1][j]) {
                       count++;
                       break; 
                   }
               }
           }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.next();
        }
        int result = minDeletionSize(nums);
        System.out.println(result);
    }
}