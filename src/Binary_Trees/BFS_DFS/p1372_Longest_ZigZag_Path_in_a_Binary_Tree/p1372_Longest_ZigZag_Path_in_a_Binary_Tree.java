package Binary_Trees.BFS_DFS.p1372_Longest_ZigZag_Path_in_a_Binary_Tree;

public class p1372_Longest_ZigZag_Path_in_a_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int max = 0;

    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;

        zigzag(root.left, true, 1);
        zigzag(root.right, false, 1);

        return max;
    }

    public void zigzag(TreeNode root, boolean d, int sum) {
        if(root == null) return;

        max = Math.max(max, sum);

        if(d) {
            zigzag(root.right, false, sum + 1);
            zigzag(root.left, true, 1);
        }else{
            zigzag(root.left, true, sum + 1);
            zigzag(root.right, false, 1);
        }
    }
}
