// 434. Number of Segments in a String
import java.util.*;
import java.util.Scanner;
class countSegments{
    public static int count(String s){
        if(s.equals("")) return 0;
        List<String> nums = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
       for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(sb.length() > 0){
                    nums.add(sb.toString());
                    sb.setLength(0);
                }
            }
            else {
                sb.append(s.charAt(i));
            }
       }
       if(sb.length() > 0){
            nums.add(sb.toString());
       }
       return nums.size();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = count(s);
        System.out.println(result);
    }
}