import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class NextGreaterElement{
    public static int[] greaterelement(int[] nums1,int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<list.size();i++){
            int nextgreater = -1;
            for(int j = i+1;j<list.size();j++){
                if(list.get(j) > list.get(i)){
                    nextgreater = list.get(j);
                    break;
                }
            }
            map.put(list.get(i),nextgreater);
        }
        int[] arr = new int[nums1.length];
        for(int i = 0;i< nums1.length;i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2 :");
        int[] nums2 = new int[n2];
        for(int i = 0;i<nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        int[] result = greaterelement(nums1,nums2);
        System.out.println("Next Greater Element :"+Arrays.toString(result));
    }
}