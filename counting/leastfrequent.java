// 3663. Find The Least Frequent Digit
import java.util.*;
import java.util.Arrays;
class leastfrequent{
    public static int Frequent(int n){
        int num = n;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n > 0){
            int rem = n % 10;
            map.put(rem,map.getOrDefault(rem,0) + 1);
            n = n / 10;
        }
        int min = Collections.min(map.values());
        for(int key : map.keySet()){
            if(map.get(key) == min){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int number = scan.nextInt();
        int result = Frequent(number);
        System.out.println(result);
    }
}