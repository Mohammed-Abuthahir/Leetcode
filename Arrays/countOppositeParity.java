// 3917. Count Indices With Opposite Parity
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class countOppositeParity{
    public static int[] countopposite(int[] nums){
        int oddcount = 0; int evencount = 0;
        for(int num : nums){
            if(num % 2 == 0) evencount++;
            else oddcount++;
        }
        int idx = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[idx++] = evencount;
                oddcount--;
            }
            else{
                nums[idx++] = oddcount;
                evencount--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = countopposite(nums);
        System.out.println(Arrays.toString(result));
    }
}