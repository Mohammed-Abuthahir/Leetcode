// 2917. Find the K-or of an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findKOr{
    public static int findxor(int[] nums, int k){
        int max = 0;
        List<String> arr = new ArrayList<>();
        for(int num : nums){
            String binary = Integer.toBinaryString(num);
            arr.add(binary);
            max = Math.max(max, binary.length());
        }
        int idx = 0;
        for(String num : arr){
             while(num.length() != max){
                num = "0" + num;
             }
             arr.set(idx++, num);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < max; i++){
            int count = 0;
            for(String num : arr){
                if(num.charAt(i) == '1'){
                    count++;
                }
            }
            if(count >= k) sb.append("1");
            else sb.append("0");
        }
        return Integer.parseInt(sb.toString(), 2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = findxor(nums, k);
        System.out.println(result);
    }
}