// 1742. Maximum Number of Balls in a Box
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countBalls{
    public static int countballs(int lowlimit, int highlimit){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = lowlimit; i <= highlimit; i++){
            String number = String.valueOf(i);
            int sum = 0;
            for(char c : number.toCharArray()){
                sum = sum + c - '0';
            }
            nums.add(sum);
        }
        int[] freq = new int[highlimit + 1];
        int max = 0;
        for(int num : nums){
            freq[num]++;
            max = Math.max(max, freq[num]);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the LowLimit :");
        int lowlimit = scan.nextInt();
        System.out.println("Enter the HighLimit :");
        int highlimit = scan.nextInt();
        int result = countballs(lowlimit, highlimit);
        System.out.print(result);
    }
}
