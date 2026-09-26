// 2225. Find Players With Zero or One Losses
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findWinners{
    public static List<List<Integer>> findwinners(int[][] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i][1], map.getOrDefault(nums[i][1], 0) + 1);
        }
        TreeSet<Integer> set1 = new TreeSet<>();
        for(int key : map.keySet()){
            if(map.get(key) == 1) set1.add(key);
        }
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i = 0;i < nums.length; i++){
            if(!map.containsKey(nums[i][0])){
                set2.add(nums[i][0]);
            }
        }
        return Arrays.asList(new ArrayList<>(set2), new ArrayList<>(set1));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int col = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] matrix = new int[row][col];
        for(int i = 0;i < matrix.length; i++){
            for(int j = 0;j < matrix[i].length; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        List<List<Integer>> result = findwinners(matrix);
        System.out.println(result);
    }
}