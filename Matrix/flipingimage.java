// 832. Flipping an Image
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class flipingimage{
    public static int[][] flippingimages(int[][] nums){
        for(int i = 0;i < nums.length;i++){
            int left = 0;
            int right = nums[0].length - 1;
            while(left <= right){
                int temp = nums[i][left];
                nums[i][left] = nums[i][right];
                nums[i][right] = temp;
                left++;
                right--;
            }
        }
        int row = 0;
        int cols = 0;
        while(row < nums.length){
            while(cols < nums[0].length){
                if(nums[row][cols] == 0){
                    nums[row][cols] = 1;
                }
                else if(nums[row][cols] == 1){
                    nums[row][cols] = 0;
                }
                cols++;
            }
            cols = 0;
            row++;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[0].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[][] result = flippingimages(nums);
        System.out.println(Arrays.deepToString(result));
    }
}