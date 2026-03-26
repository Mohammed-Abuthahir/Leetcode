// 1399. Count Largest Group
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countlargestgroup{
    public static int countLargestGroup(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i <= n; i++){
            if(i < 10){
                list.add(i);
            }
            else{
                int sum = 0;
                int temp = i;
                while(temp > 0){
                    int rem = temp % 10;
                    sum = sum + rem;
                    temp = temp / 10;
                }
                list.add(sum);
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < list.size();i++){
            map.put(list.get(i) , map.getOrDefault(list.get(i) , 0) + 1);
        }
        int max = 0;
        for(int key : map.keySet()){
            max = Math.max(max, map.get(key));
        }
        int count = 0;
        for(int key : map.keySet()){
            if(map.get(key) == max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = countLargestGroup(n);
        System.out.println(result);
    }
}