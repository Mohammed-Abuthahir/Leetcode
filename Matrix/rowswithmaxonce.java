// 2643. Row With Maximum Ones
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rowswithmaxonce{
    public static int[] rowswithonce(int[][] nums){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = 0;j<nums[i].length;j++){
                sum = sum + nums[i][j];
            }
            list.add(sum);
        }
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = list.size() - 1;
        while(left <= right){
            max = Math.max(max,Math.max(list.get(left),list.get(right)));
            left++;
            right--;
        }
        int index = 0;
        for(int i = 0;i<list.size();i++){
            if(list.get(i) == max){
                index = i;
                break;
            }
        }
        int[] arr = new int[2];
        arr[0] = index;
        arr[1] = max;
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row Size :");
        int row = scan.nextInt();
        System.out.println("Enter the Coloumn size :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                System.out.println("Enter the "+i+" row and "+j+" column");
                nums[i][j] = scan.nextInt();
            }
        }
        int[] result = rowswithonce(nums);
        System.out.println("Row and max Once are :"+Arrays.toString(result));
    }
}