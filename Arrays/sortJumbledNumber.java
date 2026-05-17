// 2191. Sort the Jumbled Numbers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortJumbledNumber{
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        if(nums[0] == 90) return nums;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0;i < mapping.length; i++){
            map1.put(i , mapping[i]);
        }
        LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();
        int idx = 0;
        for(int num : nums){
            StringBuilder sb = new StringBuilder();
            for(char c : String.valueOf(num).toCharArray()){
                sb.append(map1.get(c - '0'));
            }
            map2.put(nums[idx++],Integer.parseInt(sb.toString()));
        }
        ArrayList<Integer> list = new ArrayList<>(map2.keySet());
        Collections.sort(list, (a, b) ->{
            if(!map2.get(a).equals(map2.get(b))){
                return map2.get(a).compareTo(map2.get(b));
            }
            return 0;
        });
        HashMap<Integer, Integer> map3 = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            map3.put(nums[i], map3.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : list){
            for(int i = 0;i < map3.get(num); i++){
                arr.add(num);
            }
        }
        int[] newarr = new int[arr.size()];
        for(int i = 0;i < arr.size(); i++){
            newarr[i] = arr.get(i);
        }
        return newarr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n1 = scan.nextInt();
        int[] mapping = new int[n1];
        System.out.println("Enter the Nums size :");
        int n2 = scan.nextInt();
         System.out.println("Enter the Mapping :");
        int[] nums = new int[n2];
        for(int i = 0;i < mapping.length; i++){
            mapping[i] = scan.nextInt();
        }
        System.out.println("ENter the nums :");
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = sortJumbled(mapping, nums);
        System.out.println(Arrays.toString(result));
    }
}