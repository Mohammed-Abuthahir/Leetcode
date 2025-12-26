// 74. Search a 2D Matrix
import java.util.Scanner;
class Search2DMatrix {
    public static boolean matrix(int[][] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Column :");
        int cols = scan.nextInt();
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        System.out.println("Enter the Matrix Number :");
        int[][] nums = new int[row][cols];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = scan.nextInt();
            }
        }
        boolean result = matrix(nums, target);
        System.out.println("If Target is Present : " + result);
        scan.close();
    }
}
