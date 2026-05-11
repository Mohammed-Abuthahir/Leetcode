// 1431. Kids With the Greatest Number of Candies
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kidsWithCandies{
    public static List<Boolean> kids(int[] candies, int extraCandies){
        List<Boolean> nums = new ArrayList<>();
        int max = 0;
        for(int num : candies){
            max = Math.max(num, max);
        }
        for(int num : candies){
            if((num + extraCandies) >= max){
                nums.add(true);
            }
            else{
                nums.add(false);
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] candies = new int[n];
        for(int i = 0;i < candies.length; i++){
            candies[i] = scan.nextInt();
        }
        System.out.println("ENter the ExtraCandies :");
        int extraCandies = scan.nextInt();
        List<Boolean> result = kids(candies, extraCandies);
        System.out.println(result);
    }
}