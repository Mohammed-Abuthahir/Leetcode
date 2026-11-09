// 2582. Pass the Pillow
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class passThePillow{
    public static int passThePillow(int n, int time){
        List<Integer> nums = new ArrayList<>();
        for(int i = 1;i <= n; i++){
            nums.add(i);
        }
        int idx = 0;
        while(time != 0){
            idx++;
            if(idx == nums.size() - 1){
                Collections.reverse(nums);
                idx = 0;
            }
            time--;
        }
        return nums.get(idx);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        System.out.println("Enter the Time : ");
        int time = scan.nextInt();
        int result = passThePillow(n, time);
        System.out.println(result);
    }
}