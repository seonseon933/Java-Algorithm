package Binary_Trees.BFS_DFS.p101_Symmetric_Tree;

public class p101_Symmetric_Tree {
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
    
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        else if ((node1 != null && node2 == null) || (node1 == null && node2 != null)) return false;
        else if(node1.val != node2.val) return false;
        
        boolean res1 = dfs(node1.left, node2.right);
        boolean res2 = dfs(node1.right, node2.left);

        if(res1 == false || res2 == false) return false;
        return true;
    }

}
