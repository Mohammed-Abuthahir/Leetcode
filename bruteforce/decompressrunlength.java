// 1313. Decompress Run-Length Encoded List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class decompressrunlength{
    public static int[] decompressRLElist(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length - 1;i = i + 2){
            for(int j = 0;j < nums[i]; j++){
                list.add(nums[i + 1]);
            }
        }
        int[] nums1 = new int[list.size()];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = list.get(i);
        }
        return nums1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }
}