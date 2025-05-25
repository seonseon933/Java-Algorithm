package Binary_Trees.BFS_DFS.P103_Binary_Tree_Zigzag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P103_Binary_Tree_Zigzag_Level_Order_Traversal {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);

        boolean leftToRight = true;

        while (!bfs.isEmpty()) {
            int size = bfs.size();
            LinkedList<Integer> level = new LinkedList<>();

            for(int i = 0; i < size; i++){
                TreeNode node = bfs.poll();

                if(leftToRight){
                    level.addLast(node.val);
                }else{
                    level.addFirst(node.val);
                }

                if (node.left != null) bfs.offer(node.left);
                if (node.right != null) bfs.offer(node.right);
            }

            res.add(level);
            leftToRight = !leftToRight;
        }
        return res;
    }   
}
