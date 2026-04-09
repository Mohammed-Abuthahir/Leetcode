import java.util.*;

class insertintoBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Helper to extract values from tree to list
    public static void FilltheList(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        nums.add(root.val);
        FilltheList(root.left, nums);
        FilltheList(root.right, nums);
    }

    // Standard method to build a balanced BST from a sorted list or array
    public static TreeNode createBST(List<Integer> nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = createBST(nums, left, mid - 1);
        root.right = createBST(nums, mid + 1, right);
        return root;
    }

    // Initial conversion from the input array
    public static TreeNode convertarrtobst(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convertarrtobst(nums, left, mid - 1);
        root.right = convertarrtobst(nums, mid + 1, right);
        return root;
    }

    // Made this static so it can be called from main
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        List<Integer> nums = new ArrayList<>();
        FilltheList(root, nums);
        nums.add(val);
        Collections.sort(nums); // Ensures the list is sorted for a balanced BST
        return createBST(nums, 0, nums.size() - 1);
    }

    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    public static void displayTree(TreeNode root, int space) {
    // Base case
    if (root == null) return;
    space += 10;
    displayTree(root.right, space);
    System.out.print("\n");
    for (int i = 10; i < space; i++) System.out.print(" ");
    System.out.println(root.val);
    displayTree(root.left, space);
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the Size of initial tree: ");
        int n = scan.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements (sorted for best results):");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        
        // Sorting input array just in case user enters unsorted data
        Arrays.sort(nums); 

        System.out.print("Enter the value to insert: ");
        int val = scan.nextInt();

        // 1. Build initial tree
        TreeNode root = convertarrtobst(nums, 0, nums.length - 1);
        
        // 2. Insert and rebuild
        TreeNode result = insertIntoBST(root, val);
        
        // 3. Display
        System.out.print("In-Order Traversal of result: ");
        displayTree(result,0);
        System.out.println();
        
        scan.close();
    }
}