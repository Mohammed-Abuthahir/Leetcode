// 819. Most Common Word
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mostcommonword{
    public static String common(String s,String[] banned){
        String[] arr = s.toLowerCase().replaceAll("[^a-zA-z0-9]"," ").split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(String num : arr){
            list.add(num);
        }
        for(String item : banned){
           if(list.contains(item)){
               list.removeAll(Arrays.asList(banned));
           }
       }
       HashMap<String,Integer> map = new HashMap<>();
       for(int i = 0;i < list.size();i++){
          map.put(list.get(i),map.getOrDefault(list.get(i) , 0) + 1);
       }
       int max = Collections.max(map.values());
       for(String key : map.keySet()){
          if(map.get(key) == max){
            return key;
          }
       }
       return "";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("Enter the Banned Array Length :");
        int n = scan.nextInt();
        scan.nextLine(); 
        System.out.println("Enter the Banned String :");
        String[] banned = new String[n];
        for(int i = 0;i < banned.length;i++){
            banned[i] = scan.nextLine();
        }
        String result = common(s,banned);
        System.out.println("The Most Common Word is to :"+result);
    }
}