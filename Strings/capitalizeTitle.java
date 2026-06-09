// 2129. Capitalize the Title
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class capitalizeTitle{
    public static  String capitalize(String s) {
      String[] nums = s.split(" ");
      String[] arr = new String[nums.length];
      int idx = 0;
      for(String str : nums){
          StringBuilder sb = new StringBuilder();
          if(str.length() <= 2){
              sb.append(str.toLowerCase());

          }
          else{
              for(int i = 0;i < str.length(); i++){
                  if(i == 0){
                      sb.append(Character.toUpperCase(str.charAt(0)));
                  }
                  else{
                      sb.append(Character.toLowerCase(str.charAt(i)));
                  }
              }
          }
          arr[idx++] = sb.toString();
      }
        String str = "";
        for(String num : arr){
            str = str + num + " ";
        }
      return str.trim();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = capitalize(s);
        System.out.println(result);
    }
}