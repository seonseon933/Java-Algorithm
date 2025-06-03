package Binary_Trees.BST.p1305_All_Elements_in_Two_Binary_Search_Trees;

import java.util.ArrayList;
import java.util.List;

public class p1305_All_Elements_in_Two_Binary_Search_Trees {
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
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int r1 = 0, r2 = 0;

        bst(root1, list1);
        bst(root2, list2);

        while (r1 < list1.size() && r2 < list2.size()) {
            int val1 = list1.get(r1);
            int val2 = list2.get(r2);
            if(val1 < val2){
                res.add(val1);
                r1++;
            }
            else {
                res.add(val2);
                r2++;
            }
        }

        while(r1 < list1.size()){
            int val = list1.get(r1); 
            res.add(val);
            r1++;
        }
        while(r2 < list2.size()){
            int val = list2.get(r2);
            res.add(val);
            r2++;  
        }
        
        return res;
    }

    private void bst(TreeNode node, List<Integer> list) {
        if (node == null) return;
        
        bst(node.left, list);
        list.add(node.val);
        bst(node.right, list);
    }
}
