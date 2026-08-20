// 3069. Distribute Elements Into Two Arrays I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class resultArray{
    public static int[] result(int[] nums1){
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums1[0]); arr2.add(nums1[1]);
        int idx1 = 0; int idx2 = 0;
        for(int i = 2;i < nums1.length; i++){
            if(arr1.get(idx1) > arr2.get(idx2)){
                arr1.add(nums1[i]);
                idx1++;
            }
            else{
                arr2.add(nums1[i]);
                idx2++;
            }
        }
        int index = 0;
        for(int i = 0;i < arr1.size(); i++) nums1[index++] = arr1.get(i);
        for(int i = 0;i < arr2.size(); i++) nums1[index++] = arr2.get(i);
        return nums1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        
        int[] result = result(nums1);
        System.out.println(Arrays.toString(result));
    }
}