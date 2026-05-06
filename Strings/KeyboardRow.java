// 500. Keyboard Row
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class KeyboardRow{
    public static String[] findWords(String[] words){
        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('Q','W','E','R','T','Y','U','I','O','P'));
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('A','S','D','F','G','H','J','K','L'));
        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('Z','X','C','V','B','N','M'));
        ArrayList<String> arr = new ArrayList<>();
        for(String nums : words){
            int count1 = 0; int count2 = 0; int count3 = 0;
            if(list1.contains(Character.toUpperCase(nums.charAt(0)))){
                for(int i = 0;i < nums.length();i++){
                    char ch = Character.toUpperCase(nums.charAt(i));
                    if(list1.contains(ch)){
                        count1++;
                        if(count1 == nums.length()){
                            arr.add(nums);
                        }
                    }
                    else{
                        break;
                    }
                }
            }
            else if(list2.contains(Character.toUpperCase(nums.charAt(0)))) {
                for (int i = 0; i < nums.length(); i++) {
                    char ch = Character.toUpperCase(nums.charAt(i));
                    if (list2.contains(ch)) {
                        count2++;
                        if (count2 == nums.length()) {
                            arr.add(nums);

                        }
                    }
                    else {
                        break;
                    }
                }
            }
            else if(list3.contains(Character.toUpperCase(nums.charAt(0)))){
                for (int i = 0; i < nums.length(); i++) {
                    char ch = Character.toUpperCase(nums.charAt(i));
                    if (list3.contains(ch)) {
                        count3++;
                        if (count3 == nums.length()) {
                            arr.add(nums);
                        }
                    }
                    else {
                        break;
                    }
                }
            }
        }
        String[] ans = new String[arr.size()];
        for(int i = 0;i < arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans; 
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.next();
        }
        String[] result = findWords(nums);
        System.out.println(Arrays.toString(nums));
    }
}