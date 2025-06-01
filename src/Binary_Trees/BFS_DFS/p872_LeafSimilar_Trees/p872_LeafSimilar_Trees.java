package Binary_Trees.BFS_DFS.p872_LeafSimilar_Trees;

import java.util.ArrayList;
import java.util.List;

public class p872_LeafSimilar_Trees {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        dfs(root1, r1);
        dfs(root2, r2);

        return r1.equals(r2);
    }

    public void dfs(TreeNode node, List<Integer> list) {
        if(node == null) return;
        
        if(node.left == null && node.right == null) list.add(node.val);

        dfs(node.left, list);
        dfs(node.right, list);
    }
}
