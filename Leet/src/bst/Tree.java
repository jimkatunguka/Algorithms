package bst;

public class Tree {
    Node root;

    public Tree (Node root){this.root = root;}

    public boolean findNode(int value){

        if(root == null) return false;

        Node  current = root;
        while(current != null){
            if(value < root.val) current = current.left;
            else current = current.right;
        }
        return current.val == value;
    }

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(){}
        public Node(int val){this.val = val;}
        public Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
