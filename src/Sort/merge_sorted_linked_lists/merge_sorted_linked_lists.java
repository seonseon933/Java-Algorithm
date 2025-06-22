package Sort.merge_sorted_linked_lists;

import java.util.List;

public class merge_sorted_linked_lists {
    public class Node {
        private int val;
        private Node next;
        
        public Node(int val) {
            this.val = val;
        }
        public int getVal() {
            return val;
        }
        
        public void setNext(Node node) {
            this.next = node;
        }
        
        public Node getNext() {
            return next;
        }
    }
    public Node solution(List<Node> input) {
        if(input == null || input.isEmpty()) return null;
        if(input.size() == 1) return input.get(0);

        int mid = input.size() / 2;
        List<Node> left = input.subList(0, mid);
        List<Node> right = input.subList(mid, input.size());
        
        Node n1 = solution(left);
        Node n2 = solution(right);

        return merge(n1, n2);
    }

    public Node merge(Node n1, Node n2) {
        Node start = new Node(0);
        Node curr = start;

        while (n1 != null && n2 != null) {
            if(n1.getVal() <= n2.getVal()) {
                curr.setNext(n1);
                n1 = n1.getNext();
            } else {
                curr.setNext(n2);
                n2 = n2.getNext();
            }
            curr = curr.getNext();
        }

        if(n1 != null) curr.setNext(n2);
        else curr.setNext(n2);

        return start.getNext();
    }
}