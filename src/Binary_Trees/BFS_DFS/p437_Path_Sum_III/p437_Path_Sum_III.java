package Binary_Trees.BFS_DFS.p437_Path_Sum_III;

public class p437_Path_Sum_III {
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

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        return count(root, targetSum) 
             + pathSum(root.left, targetSum) 
             + pathSum(root.right, targetSum);
    }

    private int count(TreeNode node, long remainingSum) {
        if (node == null) return 0;

        int count = 0;
        if (node.val == remainingSum) count++;

        count += count(node.left, remainingSum - node.val);
        count += count(node.right, remainingSum - node.val);

        return count;
    }
}
