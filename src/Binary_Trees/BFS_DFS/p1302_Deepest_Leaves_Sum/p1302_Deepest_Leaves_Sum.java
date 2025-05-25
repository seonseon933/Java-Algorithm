package Binary_Trees.BFS_DFS.p1302_Deepest_Leaves_Sum;

import java.util.LinkedList;
import java.util.Queue;

public class p1302_Deepest_Leaves_Sum {
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

    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> bfs = new LinkedList<>();
        int res = 0;

        bfs.offer(root);
        
        while (!bfs.isEmpty()) {
            int size = bfs.size();
            res = 0;

            for(int i = 0; i < size; i++){
                TreeNode node = bfs.poll();
                res += node.val;

                if(node.left != null) bfs.offer(node.left);
                if(node.right != null) bfs.offer(node.right);
            }
        }        

        return res;
    }
}
