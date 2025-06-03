package Binary_Trees.BFS_DFS.p1161_Maximum_Level_Sum_of_a_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class p1161_Maximum_Level_Sum_of_a_Binary_Tree {
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
    
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        
        bfs.offer(root);

        int max = Integer.MIN_VALUE;
        int res = 0;
        int level = 0;

        while (!bfs.isEmpty()) {
            int size = bfs.size();
            level++;
            int sum = 0;

            for(int i = 0; i < size; i++) {
                TreeNode node = bfs.poll();
                sum += node.val;

                if(node.left != null) bfs.offer(node.left);
                if(node.right != null) bfs.offer(node.right);
            }
           if(max < sum) {
            max = sum;
            res = level;
           }
        }        
        return res;
    }
}