// 1710. Maximum Units on a Truck
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumUnits{
    public static int maximum(int[] nums){
        Arrays.sort(nums, (a, b) -> {
            if(a[1] != b[1]){
                return b[1] - a[1];
            }
            return b[0] - a[0];
        });
        int sum = 0;
        for(int[] num : nums){
            int numberOfBoxes = num[0];
            int numberOfUnitsPerBox = num[1];
            int takenboxes = Math.min(truckSize, numberOfBoxes);
            sum = sum + (takenboxes * numberOfUnitsPerBox);
            truckSize = truckSize - takenboxes;
            if(truckSize == 0) break;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int cols = scan.nextInt();
        System.out.println("Enter the nums : ");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            nums[i][j] = scan.nextInt();
        }
        int result = maximum(nums);
        System.out.println(result);
    }
}