// 1030. Matrix Cells in Distance Order
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class allCellsDistOrder{
     public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num1 = Math.abs(rCenter - i);
                int num2 = Math.abs(cCenter - j);
                map.put(Arrays.asList(i, j), num1 + num2);
            }
        }
        List<List<Integer>> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            if (!Objects.equals(map.get(a), map.get(b))) {
                return map.get(a) - map.get(b);
            }
            return 0;
        });

        int[][] nums = new int[rows * cols][2];
        int idx1 = 0;
        for (List<Integer> subset : list) {
            nums[idx1][0] = subset.get(0);
            nums[idx1][1] = subset.get(1);
            idx1++;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Rows :");
        int rows = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int cols = scan.nextInt();
        System.out.println("Enter the rCenter : ");
        int rCenter = scan.nextInt();
        System.out.println("Enter the cCenter : ");
        int cCenter = scan.nextInt();
        int[][] result = allCellsDistOrder(rows, cols, rCenter, cCenter);
        System.out.println(Arrays.deepToString(result));
    }
}