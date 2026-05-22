// 648. Replace Words
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ReplaceWords {
    public static String replacewords(String[] nums, String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        List<String> ans = new ArrayList<>(list);
        Arrays.sort(nums, (a, b) -> Integer.compare(a.length(), b.length()));
        Collections.sort(list);
        HashMap<String, String> map = new HashMap<>();
        for (String num : list) {
            for (String root : nums) {
                if (num.startsWith(root)) {
                    map.put(num, root);
                    break;
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            if (map.containsKey(ans.get(i))) {
                ans.set(i, map.get(ans.get(i)));
            }
        }
        StringBuilder result = new StringBuilder();
        for (String num : ans) {
            result.append(num).append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.next();
        }
        scan.nextLine(); 
        System.out.println("Enter the String :");
        String s = scan.nextLine(); 
        String result = replacewords(nums, s);
        System.out.println("\nResult:");
        System.out.println(result);
        scan.close();
    }
}