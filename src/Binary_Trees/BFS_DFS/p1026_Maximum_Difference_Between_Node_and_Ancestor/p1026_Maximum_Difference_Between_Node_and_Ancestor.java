package Binary_Trees.BFS_DFS.p1026_Maximum_Difference_Between_Node_and_Ancestor;

public class p1026_Maximum_Difference_Between_Node_and_Ancestor {
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

    public int maxAncestorDiff(TreeNode root) {
        return findV(root, root.val, root.val);
    }

    private int findV(TreeNode node, int min, int max) {
        if (node == null) return max - min;

        max = Math.max(max, node.val);
        min = Math.min(min, node.val);

        int left = findV(node.left, min, max);
        int right = findV(node.right, min, max);

        return Math.max(left, right);
    }
    
}
