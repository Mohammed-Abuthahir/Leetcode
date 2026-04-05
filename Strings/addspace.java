// 2109. Adding Spaces to a String
import java.util.*;

class addspace{
    public static String addingspaces(String s,int[] spaces){
        StringBuilder arr = new StringBuilder();
        int j = 0;
        for(int i = 0;i < s.length();i++){
            if(i == spaces[j]){
                arr.append(" ");
                arr.append(s.charAt(i));
                j++;
                if(j == spaces.length){
                    j = 0;
                }
            }
            else{
                arr.append(s.charAt(i));
            }
        }
        return arr.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] spaces = new int[n];
        for(int i = 0;i < spaces.length;i++){
            spaces[i] = scan.nextInt();
        }
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = addingspaces(s , spaces);
        System.out.println("result is to :"+result);
    }
}
