// 1637. Widest Vertical Area Between Two Points Containing No Points
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxWidthOfVerticalArea{
    public static int maxWidth(int[][] nums){
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        for(int i = 1;i < nums.length; i++){
            ans = Math.max(ans, nums[i][0] - nums[i - 1][0]);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] nums = new int[row][cols];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = maxWidth(nums);
        System.out.println(result);
    }
}