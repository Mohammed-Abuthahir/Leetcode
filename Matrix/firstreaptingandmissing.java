// 2965. Find Missing and Repeated Values
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class firstreaptingandmissing{
    public static int[] firstrepeat(int[][] nums){
        ArrayList<Integer> repeat = new ArrayList<>();
        HashSet<Integer> missing = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                repeat.add(nums[i][j]);
                missing.add(nums[i][j]);
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < repeat.size();i++){
            map.put(repeat.get(i),map.getOrDefault(repeat.get(i) , 0) + 1);
        }
        int repated = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 2){
                repated = key;
                break;
            }
        }
        int missingNum  = 1;
        while(missing.contains(missingNum)){
            missingNum++;
        }
        return new int[]{repated,missingNum};
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
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[] result = firstrepeat(nums);
        System.out.println("First Reapeted and Missing Value :"+Arrays.toString(result));
    }
}