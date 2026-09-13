// 492. Construct the Rectangle
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class constructRectangle{
    public static int[] constructrectangle(int area){
        List<Integer> nums = new ArrayList<>();
        for(int i = 1;i <= area; i++){
            if(area % i == 0) nums.add(i);
        }
        int sqrt = (int) Math.sqrt(area);
        for(int i = 0;i < nums.size(); i++){
            for(int j = 0;j < nums.size(); j++){
                if(nums.get(j) <= sqrt && (nums.get(i) >= nums.get(j)) && (nums.get(i) * nums.get(j)) == area){
                    return new int[]{nums.get(i), nums.get(j)};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Area : ");
        int area = scan.nextInt();
        int[] result = constructrectangle(area);
        System.out.println(Arrays.toString(result));
    }
}