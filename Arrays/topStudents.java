// 2512. Reward Top K Students
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class topStudents{
    public static List<Integer> topstudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k){
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for(String str : positive_feedback) set1.add(str);
        for(String str : negative_feedback) set2.add(str);
        int idx = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String num : report){
            String str[] = num.split(" ");
            int sum = 0;
            for(String word : str){
                if(set1.contains(word)){
                    sum = sum + 3;
                }
                if(set2.contains(word)){
                    sum = sum - 1;
                }
            }
            map.put(student_id[idx++], sum);
        }
        List<Integer> nums = new ArrayList<>(map.keySet());
        Collections.sort(nums, (a, b) -> {
            if(map.get(a) != map.get(b)){
                return Integer.compare(map.get(a), map.get(b));
            }
            else{
                return Integer.compare(a, b);
            }
        });
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i < k; i++){
            arr.add(nums.get(i));
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // 1. Read sizes
        System.out.println("Enter the Positive_feedback Size : ");
        int n1 = scan.nextInt();

        System.out.println("Enter the Negative_feedback Size : ");
        int n2 = scan.nextInt();

        System.out.println("Enter the report size : ");
        int n3 = scan.nextInt();

        System.out.println("Enter the student id Size :");
        int n4 = scan.nextInt();

        // Instantiate arrays
        String[] positive_feedback = new String[n1];
        String[] negative_feedback = new String[n2];
        String[] report = new String[n3];
        int[] student_id = new int[n4];

        // 2. Read Positive Feedback
        System.out.println("Enter the positive_feedback words: ");
        for (int i = 0; i < positive_feedback.length; i++) {
            positive_feedback[i] = scan.next();
        }

        // 3. Read Negative Feedback
        System.out.println("Enter the negative_feedback words: ");
        for (int i = 0; i < negative_feedback.length; i++) {
            negative_feedback[i] = scan.next();
        }

        // CONSUME EXTRA NEWLINE BEFORE USING scan.nextLine()
        scan.nextLine();

        // 4. Read Reports
        System.out.println("Enter the reports : ");
        for (int i = 0; i < report.length; i++) {
            report[i] = scan.nextLine();
        }

        // 5. Read Student IDs
        System.out.println("Enter the student_ids : ");
        for (int i = 0; i < student_id.length; i++) {
            student_id[i] = scan.nextInt();
        }

        // 6. Read K value
        System.out.println("Enter the K :");
        int k = scan.nextInt();

        scan.close();
        List<Integer> result = topstudents(positive_feedback, negative_feedback, report, student_id, k);
        System.out.println(result);


    }
}