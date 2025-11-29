// 349. Intersection of Two Arrays
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class InterSection{
    public static int[] InterSectionofArray(int[] nums1 , int[] nums2){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int N1 = nums1.length;
        int N2 = nums2.length;
        int firstPointer = 0;
        int secondPointer = 0;
        while(firstPointer < N1 && secondPointer < N2){
            if(nums1[firstPointer] == nums2[secondPointer]){
                set.add(nums1[firstPointer]);
                firstPointer++;
                secondPointer++;
            }
            else if(nums1[firstPointer] < nums2[secondPointer]){
                firstPointer++;
            }
            else{
                secondPointer++;
            }
        }
        int[] index = new int[set.size()];
        int i = 0;
        for(int num : set){
            index[i++] = num;
        }
        return index;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 :");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 :");
        int n2 = scan.nextInt();
        System.out.println("Enter the Array 1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2 :");
        int[] nums2 = new int[n2];
        for(int i = 0;i<nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        int[] result = InterSectionofArray(nums1,nums2);
        System.out.println("Intersection of Two Arrays is :"+Arrays.toString(result));
    }
}