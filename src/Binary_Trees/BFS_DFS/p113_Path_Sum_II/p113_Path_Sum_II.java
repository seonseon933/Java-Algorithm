package Binary_Trees.BFS_DFS.p113_Path_Sum_II;

import java.util.ArrayList;
import java.util.List;

public class p113_Path_Sum_II {
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

    List<List<Integer>> res = new ArrayList<>(); 
    int target;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return new ArrayList<>();
        
        target = targetSum;
        
        dfs(root, targetSum, new ArrayList<>());

        return res;
    }

    public void dfs(TreeNode node, int curr, List<Integer> path) {
        if(node == null) return;
    
        path.add(node.val);

        if(node.left == null && node.right == null && node.val == curr) {
            res.add(new ArrayList<>(path));
        } else {
            dfs(node.left, curr - node.val, path);
            dfs(node.right, curr - node.val, path);
        }

        path.remove(path.size() - 1);
    }
}
